package yonyou.marketing.web.management.actions;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.session.RowBounds;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import yonyou.marketing.api.user.entity.UserDto;
import yonyou.marketing.api.user.services.UserService;
import yonyou.marketing.common.utils.HtmlUtil;
import yonyou.marketing.common.utils.SessionUtils;
import yonyou.marketing.common.utils.json.JSONUtil;

/**
 * 
 * @author BENJAMIN
 *
 */
@Controller
public class MainController extends BaseAction{
	Logger log = Logger.getLogger(this.getClass());
	@Autowired
	private  HttpServletRequest request;
	
	@Autowired
	private UserService userService;
	
	/**
	 * 登录
	 * 
	 * @param user
	 * @param request
	 * @param response
	 */
	@RequestMapping("/signIn")
	public void userSignIn(HttpServletResponse response){
		try {
			
			String userName=request.getParameter("user_name");
			UserDto user= userService.findUserByUserNo(userName);
			
			if(user==null){
				sendFailureMessage(response, "密码或者帐号错误.");
			}else{
				SessionUtils.setUser(request,user);
				sendSuccessMessage(response, "登录成功."+user.getNickname());
			}
		} catch (Exception e) {
			sendFailureMessage(response, e.getMessage());
			request.setAttribute("InfoMessage", "信息载入失败！具体异常信息：" + e.getMessage());
			log.error(e);
		}
	}
	
	
	/**
	 * 
	 * 跳转主页面
	 * @param response
	 * @return
	 */
	@RequestMapping("mainPre")
	public ModelAndView mainPre(HttpServletResponse response){
		try {
			//Map<String,Object>  context = getRootMap();
			//获取登录的用户
			UserDto user = SessionUtils.getUser(request);
			return forword("/jsp/frame/main",null);
		}catch (Exception e) {
				e.printStackTrace();
				sendFailureMessage(response, e.getMessage());
				request.setAttribute("InfoMessage", "信息载入失败！具体异常信息：" + e.getMessage());
				log.error(e);
				return null;
		}
	}
	
	/**
	 * 获取菜单
	 * 
	 * @param response
	 */
	@RequestMapping("getFuncList")
	public void getFuncList(HttpServletResponse response){
		try {
			
			String id=request.getParameter("id");//菜单ID
			
			UserDto user = SessionUtils.getUser(request);
			Map queryMap=new HashMap();
			queryMap.put("userId", user.getId());
			queryMap.put("parentId",id);
			
			//得到该用户下所有的按钮权限
			List<Map> btnList= userService.getMenuByUser(queryMap);
			log.info( JSONUtil.toJSONString(btnList));
			SessionUtils.setAttr(request, "userPrivilege", btnList);
			//BenFrame.main.addTabs('"+nodeName+"','"+url+"')
			//将用户的权限放到Session中
			
			HtmlUtil.writerJson(response, JSONUtil.toJSONString(btnList));
		} catch (Exception e) {
			e.printStackTrace();
			sendFailureMessage(response, e.getMessage());
			request.setAttribute("InfoMessage", "信息载入失败！具体异常信息：" + e.getMessage());
			log.error(e);
		}
	}
	
	
	
}

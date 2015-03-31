package yonyou.marketing.web.management.actions;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import yonyou.marketing.api.user.entity.UserDto;
import yonyou.marketing.api.user.services.UserService;
import yonyou.marketing.common.utils.SessionUtils;

@Controller
public class MainController extends BaseAction{
	Logger log = Logger.getLogger(this.getClass());
	@Autowired
	private  HttpServletRequest request;
	
	@Autowired
	private UserService userService;
	
	/**
	 * 登录controller
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
			log.debug(e);
			sendFailureMessage(response, e.getMessage());
			request.setAttribute("InfoMessage", "信息载入失败！具体异常信息：" + e.getMessage());
		}
	}
	
	
	@RequestMapping("mainPre")
	public ModelAndView mainPre(HttpServletResponse response){
		try {
			Map<String,Object>  context = getRootMap();
			//获取登录的用户
			UserDto user = SessionUtils.getUser(request);
			//得到该用户下所有的按钮权限
			//List<TMenuPrivilege> btnList= userService.getMenuBtnByUser(user);
			//将用户的权限放到Session中
			//SessionUtil.setAttr(request, "userPrivilege", btnList);
			return forword("/jsp/frame/main", context);
		}catch (Exception e) {
				e.printStackTrace();
				sendFailureMessage(response, e.getMessage());
				request.setAttribute("InfoMessage", "信息载入失败！具体异常信息：" + e.getMessage());
				return null;
		}
			
	}
	
	
	
}

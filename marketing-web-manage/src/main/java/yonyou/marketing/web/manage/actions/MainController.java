package yonyou.marketing.web.manage.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import yonyou.marketing.api.user.services.UserService;

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
	@RequestMapping("signIn")
	public void userSignIn(HttpServletResponse response){
		try {
			
			String userName=request.getParameter("user_name");
			log.debug(userName);
			//判断是否存在用户
//			boolean hasUser=mainService.userExists(user);
//			if(hasUser){
//				List<TUser> userList = mainService.queryUserList(user);
//				
//				SessionUtil.setUser(request,userList.get(0));
//				sendSuccessMessage(response, "登录成功.");
//				
//			}else{
//				log.info("登录失败！");
//				sendFailureMessage(response, "密码或者帐号错误.");
//				return;
//			}
		} catch (Exception e) {
			e.printStackTrace();
			request.setAttribute("InfoMessage", "信息载入失败！具体异常信息：" + e.getMessage());
		}
	}
}

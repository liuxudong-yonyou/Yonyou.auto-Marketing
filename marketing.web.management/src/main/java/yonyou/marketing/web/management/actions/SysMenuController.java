package yonyou.marketing.web.management.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import yonyou.marketing.api.user.entity.UserDto;
import yonyou.marketing.common.utils.SessionUtils;

@RequestMapping("/sysMenu")
@Controller
public class SysMenuController extends BaseAction{
	
	Logger log = Logger.getLogger(this.getClass());
	
	@Autowired
	private  HttpServletRequest request;
	
	@RequestMapping("/menu")
	public ModelAndView menuPre(HttpServletResponse response){
		try {
			//获取登录的用户
			UserDto user = SessionUtils.getUser(request);
			return forword("/jsp/sysmanage/sys_menu",null);
		}catch (Exception e) {
				e.printStackTrace();
				sendFailureMessage(response, e.getMessage());
				request.setAttribute("InfoMessage", "信息载入失败！具体异常信息：" + e.getMessage());
				log.error(e);
				return null;
		}
	}
	

}

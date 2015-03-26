package yonyou.marketing.web.management.actions;

import yonyou.marketing.api.user.entity.SysUser;
import yonyou.marketing.api.user.services.UserService;



/**
 * @author BENJAMIN
 *
 */
public class LoginAction {

	
	private UserService userservice;
	
	public void userLogin(String userNo){
		SysUser user= userservice.findUserByUserNo(userNo);
	}
}

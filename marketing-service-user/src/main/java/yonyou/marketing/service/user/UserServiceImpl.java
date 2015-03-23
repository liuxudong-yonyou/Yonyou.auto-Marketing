package yonyou.marketing.service.user;



import org.springframework.stereotype.Service;

import yonyou.marketing.api.user.entity.SysUser;
import yonyou.marketing.api.user.services.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Override
	public void create(SysUser pmsUser) {
		// TODO Auto-generated method stub

	}

	@Override
	public SysUser getById(Long userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SysUser findUserByUserNo(String userNo) {
		// TODO Auto-generated method stub
		SysUser user = new SysUser();
		user.setNickName("userNo");
		return user;
	}

	@Override
	public void deleteUserById(long userId) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(SysUser user) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateUserPwd(Long userId, String newPwd, boolean isTrue) {
		// TODO Auto-generated method stub

	}

	@Override
	public String findUserByNo(String name) {
		
		return "hello "+name;
	}

}

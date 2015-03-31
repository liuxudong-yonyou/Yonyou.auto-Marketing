package yonyou.marketing.service.user;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import yonyou.marketing.api.user.entity.UserDto;
import yonyou.marketing.api.user.services.UserService;
import yonyou.marketing.common.exception.ServiceException;
import yonyou.marketing.service.user.biz.UserBiz;
import yonyou.marketing.service.user.daos.UserDtoMapper;

@Service("userService")
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserBiz userBiz;
	
	
	@Override
	public UserDto findUserByUserNo(String userNo) throws ServiceException {
		return userBiz.findUserByUserNo(userNo);
	}
	
	@Override
	public void create(UserDto pmsUser) {
		// TODO Auto-generated method stub

	}

	@Override
	public UserDto getById(Long userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteUserById(long userId) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(UserDto user) {
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

	@Override
	public UserDto getMenuBtnByUser(UserDto user) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}

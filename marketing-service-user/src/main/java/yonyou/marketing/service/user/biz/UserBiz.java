package yonyou.marketing.service.user.biz;

import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import yonyou.marketing.api.user.entity.UserDto;
import yonyou.marketing.api.user.entity.UserDtoExample;
import yonyou.marketing.common.exception.ServiceException;
import yonyou.marketing.common.utils.SessionUtils;
import yonyou.marketing.service.user.daos.UserDtoMapper;

@Service("userBiz")
public class UserBiz {
	protected static final Logger logger = Logger.getLogger(SessionUtils.class);

	@Autowired
	private UserDtoMapper mapper;
	
	
	/**
	 * 根据登录名查询用户
	 * 
	 * @param userNo
	 * @return
	 * @throws ServiceException
	 */
	public UserDto findUserByUserNo(String userNo) throws ServiceException{
		UserDto user = null;
		UserDtoExample dtoExample = new UserDtoExample();
		dtoExample.createCriteria().andNoEqualTo(userNo);
		
		
		List<UserDto> list = mapper.selectByExample(dtoExample);
		if (list.size() == 1) {
			user = list.get(0);
		} else {
			throw new ServiceException("未找到该用户名！");
		}
		return user;
	}
	
	/**
	 * 根据用户查询菜单
	 * 
	 * @param queryMap
	 * @return
	 * @throws ServiceException
	 */
	public List<Map> getMenuByUser(Map queryMap) throws ServiceException{ 
		List<Map> menuList=mapper.getMenuByUser(queryMap);
		return menuList;
	}
}

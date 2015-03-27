package yonyou.marketing.service.user.biz;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import yonyou.marketing.api.user.entity.UserDto;
import yonyou.marketing.api.user.entity.UserDtoExample;
import yonyou.marketing.common.utils.SessionUtils;
import yonyou.marketing.service.user.daos.UserDtoMapper;

@Service("userBiz")
public class UserBiz {
	protected static final Logger logger = Logger.getLogger(SessionUtils.class);
	
	@Autowired
	private UserDtoMapper mapper;
	
	public UserDto findUserByUserNo(String userNo) {
		UserDto user = null;
		try {

			UserDtoExample dtoExample = new UserDtoExample();
			dtoExample.createCriteria().andNoEqualTo(userNo);
			List<UserDto> list = mapper.selectByExample(dtoExample);
			if(list.size()>0){
				user=list.get(0);
			}
		} catch (Exception e) {
			e.printStackTrace();
			logger.error(e.getMessage());
		} finally {
			
		}
		return user;

	}
}

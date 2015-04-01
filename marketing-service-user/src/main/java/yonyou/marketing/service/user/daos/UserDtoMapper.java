package yonyou.marketing.service.user.daos;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import yonyou.marketing.api.user.entity.UserDto;
import yonyou.marketing.api.user.entity.UserDtoExample;

@Service("userDtoMapper")
public interface UserDtoMapper {
    int countByExample(UserDtoExample example);

    int deleteByExample(UserDtoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserDto record);

    int insertSelective(UserDto record);

    List<UserDto> selectByExample(UserDtoExample example);

    UserDto selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserDto record, @Param("example") UserDtoExample example);

    int updateByExample(@Param("record") UserDto record, @Param("example") UserDtoExample example);

    int updateByPrimaryKeySelective(UserDto record);

    int updateByPrimaryKey(UserDto record);
    
    List<Map> getMenuByUser (Map queryMap);
}
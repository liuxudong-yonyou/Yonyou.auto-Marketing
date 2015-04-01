package yonyou.marketing.service.user.daos;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import yonyou.marketing.api.user.entity.SysMenuDto;
import yonyou.marketing.api.user.entity.SysMenuDtoExample;

public interface SysMenuDtoMapper {
    int countByExample(SysMenuDtoExample example);

    int deleteByExample(SysMenuDtoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SysMenuDto record);

    int insertSelective(SysMenuDto record);

    List<SysMenuDto> selectByExample(SysMenuDtoExample example);

    SysMenuDto selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SysMenuDto record, @Param("example") SysMenuDtoExample example);

    int updateByExample(@Param("record") SysMenuDto record, @Param("example") SysMenuDtoExample example);

    int updateByPrimaryKeySelective(SysMenuDto record);

    int updateByPrimaryKey(SysMenuDto record);
}
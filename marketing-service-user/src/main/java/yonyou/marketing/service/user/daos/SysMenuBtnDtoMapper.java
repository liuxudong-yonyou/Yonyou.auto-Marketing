package yonyou.marketing.service.user.daos;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import yonyou.marketing.api.user.entity.SysMenuBtnDto;
import yonyou.marketing.api.user.entity.SysMenuBtnDtoExample;

public interface SysMenuBtnDtoMapper {
    int countByExample(SysMenuBtnDtoExample example);

    int deleteByExample(SysMenuBtnDtoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SysMenuBtnDto record);

    int insertSelective(SysMenuBtnDto record);

    List<SysMenuBtnDto> selectByExample(SysMenuBtnDtoExample example);

    SysMenuBtnDto selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SysMenuBtnDto record, @Param("example") SysMenuBtnDtoExample example);

    int updateByExample(@Param("record") SysMenuBtnDto record, @Param("example") SysMenuBtnDtoExample example);

    int updateByPrimaryKeySelective(SysMenuBtnDto record);

    int updateByPrimaryKey(SysMenuBtnDto record);
}
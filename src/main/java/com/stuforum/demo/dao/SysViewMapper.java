package com.stuforum.demo.dao;

import com.stuforum.demo.entity.SysView;
import com.stuforum.demo.entity.SysViewExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysViewMapper {
    long countByExample(SysViewExample example);

    int deleteByExample(SysViewExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SysView record);

    int insertSelective(SysView record);

    List<SysView> selectByExample(SysViewExample example);

    SysView selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SysView record, @Param("example") SysViewExample example);

    int updateByExample(@Param("record") SysView record, @Param("example") SysViewExample example);

    int updateByPrimaryKeySelective(SysView record);

    int updateByPrimaryKey(SysView record);
}
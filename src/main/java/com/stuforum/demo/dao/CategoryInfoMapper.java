package com.stuforum.demo.dao;

import com.stuforum.demo.entity.CategoryInfo;
import com.stuforum.demo.entity.CategoryInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CategoryInfoMapper {
    long countByExample(CategoryInfoExample example);

    int deleteByExample(CategoryInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CategoryInfo record);

    int insertSelective(CategoryInfo record);

    List<CategoryInfo> selectByExample(CategoryInfoExample example);

    CategoryInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CategoryInfo record, @Param("example") CategoryInfoExample example);

    int updateByExample(@Param("record") CategoryInfo record, @Param("example") CategoryInfoExample example);

    int updateByPrimaryKeySelective(CategoryInfo record);

    int updateByPrimaryKey(CategoryInfo record);
}
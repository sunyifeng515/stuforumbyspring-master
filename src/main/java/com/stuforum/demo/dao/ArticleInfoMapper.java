package com.stuforum.demo.dao;

import com.stuforum.demo.entity.ArticleInfo;
import com.stuforum.demo.entity.ArticleInfoExample;
import java.util.List;

public interface ArticleInfoMapper {
    long countByExample(ArticleInfoExample example);

    int deleteByExample(ArticleInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ArticleInfo record);

    int insertSelective(ArticleInfo record);

    List<ArticleInfo> selectByExample(ArticleInfoExample example);

    ArticleInfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ArticleInfo record);

    int updateByPrimaryKey(ArticleInfo record);
}
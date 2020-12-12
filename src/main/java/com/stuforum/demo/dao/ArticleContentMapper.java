package com.stuforum.demo.dao;

import com.stuforum.demo.entity.ArticleContent;
import com.stuforum.demo.entity.ArticleContentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ArticleContentMapper {
    long countByExample(ArticleContentExample example);

    int deleteByExample(ArticleContentExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ArticleContent record);

    int insertSelective(ArticleContent record);

    List<ArticleContent> selectByExampleWithBLOBs(ArticleContentExample example);

    List<ArticleContent> selectByExample(ArticleContentExample example);

    ArticleContent selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ArticleContent record, @Param("example") ArticleContentExample example);

    int updateByExampleWithBLOBs(@Param("record") ArticleContent record, @Param("example") ArticleContentExample example);

    int updateByExample(@Param("record") ArticleContent record, @Param("example") ArticleContentExample example);

    int updateByPrimaryKeySelective(ArticleContent record);

    int updateByPrimaryKeyWithBLOBs(ArticleContent record);

    int updateByPrimaryKey(ArticleContent record);
}
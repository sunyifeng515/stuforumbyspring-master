package com.stuforum.demo.dao;

import com.stuforum.demo.entity.ArticleComment;
import com.stuforum.demo.entity.ArticleCommentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ArticleCommentMapper {
    long countByExample(ArticleCommentExample example);

    int deleteByExample(ArticleCommentExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ArticleComment record);

    int insertSelective(ArticleComment record);

    List<ArticleComment> selectByExample(ArticleCommentExample example);

    ArticleComment selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ArticleComment record, @Param("example") ArticleCommentExample example);

    int updateByExample(@Param("record") ArticleComment record, @Param("example") ArticleCommentExample example);

    int updateByPrimaryKeySelective(ArticleComment record);

    int updateByPrimaryKey(ArticleComment record);
}
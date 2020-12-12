package com.stuforum.demo.dao;

import com.stuforum.demo.entity.CommentInfo;
import com.stuforum.demo.entity.CommentInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CommentInfoMapper {
    long countByExample(CommentInfoExample example);

    int deleteByExample(CommentInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CommentInfo record);

    int insertSelective(CommentInfo record);

    List<CommentInfo> selectByExample(CommentInfoExample example);

    CommentInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CommentInfo record, @Param("example") CommentInfoExample example);

    int updateByExample(@Param("record") CommentInfo record, @Param("example") CommentInfoExample example);

    int updateByPrimaryKeySelective(CommentInfo record);

    int updateByPrimaryKey(CommentInfo record);
}
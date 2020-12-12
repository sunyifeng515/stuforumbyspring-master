package com.stuforum.demo.dao;

import com.stuforum.demo.entity.CommentInfo;
import com.stuforum.demo.entity.CommentInfoExample;
import java.util.List;

public interface CommentInfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CommentInfo record);

    int insertSelective(CommentInfo record);

    List<CommentInfo> selectByExample(CommentInfoExample example);

    CommentInfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CommentInfo record);

    int updateByPrimaryKey(CommentInfo record);
}
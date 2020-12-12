package com.stuforum.demo.dao;

import com.stuforum.demo.entity.PictureInfo;
import com.stuforum.demo.entity.PictureInfoExample;
import java.util.List;

public interface PictureInfoMapper {
    long countByExample(PictureInfoExample example);

    int deleteByExample(PictureInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PictureInfo record);

    int insertSelective(PictureInfo record);

    List<PictureInfo> selectByExample(PictureInfoExample example);

    PictureInfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PictureInfo record);

    int updateByPrimaryKey(PictureInfo record);
}
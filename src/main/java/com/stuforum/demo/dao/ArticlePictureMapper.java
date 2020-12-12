package com.stuforum.demo.dao;

import com.stuforum.demo.entity.ArticlePicture;
import com.stuforum.demo.entity.ArticlePictureExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ArticlePictureMapper {
    long countByExample(ArticlePictureExample example);

    int deleteByExample(ArticlePictureExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ArticlePicture record);

    int insertSelective(ArticlePicture record);

    List<ArticlePicture> selectByExample(ArticlePictureExample example);

    ArticlePicture selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ArticlePicture record, @Param("example") ArticlePictureExample example);

    int updateByExample(@Param("record") ArticlePicture record, @Param("example") ArticlePictureExample example);

    int updateByPrimaryKeySelective(ArticlePicture record);

    int updateByPrimaryKey(ArticlePicture record);
}
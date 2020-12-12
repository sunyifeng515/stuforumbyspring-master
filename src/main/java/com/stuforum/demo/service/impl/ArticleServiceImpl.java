package com.stuforum.demo.service.impl;


import com.stuforum.demo.dao.*;
import com.stuforum.demo.dto.ArticleDto;
import com.stuforum.demo.entity.*;
import com.stuforum.demo.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @author wade
 * @creat 2020-12-08-2020/12/8
 */
@Service
public class ArticleServiceImpl implements ArticleService {
    @Autowired
    ArticleInfoMapper articleInfoMapper;

    @Autowired
    ArticleCategoryMapper articleCategoryMapper;

    @Autowired
    ArticleContentMapper articleContentMapper;

    @Autowired
    ArticlePictureMapper articlePictureMapper;

    @Autowired
    ArticleCommentMapper articleCommentMapper;

    @Override
    public boolean addArticle(ArticleDto articleDto) {
        ArticleInfo info = new ArticleInfo();
        ArticlePicture articlePicture = new ArticlePicture();
        ArticleContent articleContent = new ArticleContent();
        ArticleCategory articleCategory = new ArticleCategory();
        Date time = articleDto.getCreate_by();
        info.setCreate_by(time);
        info.setIs_top(articleDto.isIs_top());
        info.setTitle(articleDto.getTitile());
        info.setLikes(articleDto.getLikes());
        info.setTranffic(articleDto.getTranffic());
        info.setUser_id(articleDto.getUser_id());
        info.setId(articleDto.getId());
        articlePicture.setArticle_id(articleDto.getId());
        articlePicture.setCreate_by(time);
        articlePicture.setPicture_id(articleDto.getPicture_id());
        articleContent.setContent(articleDto.getContent());
        articleContent.setArticle_id(articleDto.getId());
        articleContent.setCreate_by(time);
        articleCategory.setCategory_id(articleDto.getCategory_id());
        articleCategory.setArticle_id(articleDto.getId());
        articleInfoMapper.insert(info);
        articlePictureMapper.insert(articlePicture);
        articleContentMapper.insert(articleContent);
        articleCategoryMapper.insert(articleCategory);
        return true;
    }
    public List<ArticleInfo> queryAll(){
        ArticleInfoExample example = new ArticleInfoExample();
        return articleInfoMapper.selectByExample(example);
    }

    @Override
    public boolean deleteById(long id) {
        articleInfoMapper.deleteByPrimaryKey(id);
        return true;
    }



}

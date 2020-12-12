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
        ArticleComment articleComment = new ArticleComment();
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
        articleComment.setArticle_id(articleDto.getId());
        articleComment.setCreate_by(time);
        articleComment.setIs_effective(articleDto.getIs_effective());
        articleComment.setMessage_id(articleDto.getMessage_id());
        articleInfoMapper.insert(info);
        articlePictureMapper.insert(articlePicture);
        articleContentMapper.insert(articleContent);
        articleCategoryMapper.insert(articleCategory);
        articleCommentMapper.insert(articleComment);
        return true;
    }
    @Override
    public List<ArticleDto> queryAll(){
        ArticleInfoExample example = new ArticleInfoExample();
        //return articleInfoMapper.selectByExample(example);
        return null;
    }


    @Override
    public boolean deleteById(long id) {
        articleInfoMapper.deleteByPrimaryKey(id);
        //删除表category中
        ArticleCategoryExample articleCategoryExample = new ArticleCategoryExample();
        ArticleCategoryExample.Criteria articleCategoryExampleCriteria = articleCategoryExample.createCriteria();
        articleCategoryExampleCriteria.andArticle_idEqualTo(id);
        articleCategoryMapper.deleteByExample(articleCategoryExample);
        //删除表Comment中
        ArticleCommentExample articleCommentExample = new ArticleCommentExample();
        ArticleCommentExample.Criteria articleCommentExampleCriteria = articleCommentExample.createCriteria();
        articleCommentExampleCriteria.andArticle_idEqualTo(id);
        articleCommentMapper.deleteByExample(articleCommentExample);

        ArticleContentExample articleContentExample = new ArticleContentExample();
        ArticleContentExample.Criteria articleContentExampleCriteria = articleContentExample.createCriteria();
        articleContentExampleCriteria.andArticle_idEqualTo(id);
        articleContentMapper.deleteByExample(articleContentExample);

        ArticlePictureExample articlePictureExample = new ArticlePictureExample();
        ArticlePictureExample.Criteria articlePictureExampleCriteria = articlePictureExample.createCriteria();
        articlePictureExampleCriteria.andArticle_idEqualTo(id);
        articlePictureMapper.deleteByExample(articlePictureExample);
        //对应模块帖子-1
        return true;
    }



}

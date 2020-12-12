package com.stuforum.demo.service;


import com.stuforum.demo.dto.ArticleDto;
import com.stuforum.demo.entity.ArticleCategory;
import com.stuforum.demo.entity.ArticleInfo;

import java.util.List;

/**
 * 文章实现业务接口
 * @author wade
 * @creat 2020-12-04-2020/12/4
 */
public interface ArticleService {

    /**
     * 添加一篇文章
     * @param
     * @return
     */
    public boolean addArticle(ArticleDto articleDto);



    public List<ArticleDto> queryAll();
    public boolean deleteById(long id);
    public List<ArticleDto> queryByKeyword(String name);
    public boolean updateByKey(ArticleDto articleDto);

}

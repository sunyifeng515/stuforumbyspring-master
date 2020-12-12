package com.stuforum.demo.test;

import com.stuforum.demo.dto.ArticleDto;
import com.stuforum.demo.entity.ArticleInfo;
import com.stuforum.demo.service.ArticleService;
import com.stuforum.demo.service.impl.ArticleServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.sql.Date;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @author wade
 * @creat 2020-12-08-2020/12/8
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class ArticleServiceImplTest {
    @Autowired
    ArticleService articleService ;
    ArticleDto articleDto = new ArticleDto();
    @Test
    public void addArticle() {
        articleDto.setCreate_by(new Date(System.currentTimeMillis()));
        articleDto.setUser_id(2L);
        articleDto.setTitile("晚间新闻");
        articleDto.setIs_top(false);
        articleDto.setLikes(0);
        articleDto.setTranffic(0);
        articleDto.setPicture_id(10L);
        articleDto.setId(7);
        articleDto.setContent("good Evening！！");
        articleDto.setCategory_id(2L);
        articleService.addArticle(articleDto);
    }
    @Test
    public void queryAll(){
        List list = articleService.queryAll();
        for (Object articleInfo:
             list) {
            System.out.println(articleInfo);
        }
    }
    @Test
    public void deleteById(){
        System.out.println(articleService.deleteById(1L));
    }
}
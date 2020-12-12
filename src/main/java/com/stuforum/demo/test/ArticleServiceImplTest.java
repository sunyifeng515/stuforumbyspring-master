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
        articleDto.setTitile("新闻");
        articleDto.setIs_top(false);
        articleDto.setLikes(0);
        articleDto.setTranffic(0);
        articleDto.setPicture_id(10L);
        articleDto.setId(10);
        articleDto.setContent("good Evening！！");
        articleDto.setCategory_id(2L);
        articleDto.setIs_effective(false);
        articleDto.setMessage_id(6l);
        articleService.addArticle(articleDto);
    }
    @Test
    public void queryAll(){
        List<ArticleDto> list = articleService.queryAll();
        for (ArticleDto articleDto:
             list) {
            System.out.println("{"+articleDto.getTitile()+","+articleDto.getContent()+"}");
        }
    }
    @Test
    public void queryByKeyword(){
        List<ArticleDto> list = articleService.queryByKeyword("llo");
        for (ArticleDto articleDto:
                list) {
            System.out.println("{"+articleDto.getTitile()+","+articleDto.getContent()+"}");
        }
    }
    @Test
    public void deleteById(){
        System.out.println(articleService.deleteById(9));
    }
    @Test
    public void updateByKey(){
        articleDto.setCreate_by(new Date(System.currentTimeMillis()));
        articleDto.setUser_id(3L);
        articleDto.setTitile("晚间");
        articleDto.setIs_top(false);
        articleDto.setLikes(1);
        articleDto.setTranffic(0);
        articleDto.setPicture_id(10L);
        articleDto.setId(10);
        articleDto.setArticle_id(10L);
        articleDto.setContent("晚上好");
        articleDto.setCategory_id(7L);
        articleDto.setIs_effective(true);
        articleDto.setMessage_id(9l);
        articleService.updateByKey(articleDto);
    }
}
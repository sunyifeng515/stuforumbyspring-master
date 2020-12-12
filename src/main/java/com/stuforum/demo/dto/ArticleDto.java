package com.stuforum.demo.dto;


import java.util.Date;

public class ArticleDto {
    private long id;
    private long sort_id;
    private String titile;
    private boolean is_top;


    private Long article_id;

    private Long picture_id;
    private String content;
    private Long category_id;

    public Long getCategory_id() {
        return category_id;
    }

    public void setCategory_id(Long category_id) {
        this.category_id = category_id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Long getArticle_id() {
        return article_id;
    }

    public void setArticle_id(Long article_id) {
        this.article_id = article_id;
    }

    public Long getPicture_id() {
        return picture_id;
    }

    public void setPicture_id(Long picture_id) {
        this.picture_id = picture_id;
    }

    @Override
    public String toString() {
        return "ArticleDto{" +
                "id=" + id +
                ", sort_id=" + sort_id +
                ", titile='" + titile + '\'' +
                ", is_top=" + is_top +
                ", create_by=" + create_by +
                ", modified_by=" + modified_by +
                ", Likes=" + Likes +
                ", Tranffic=" + Tranffic +
                ", user_id=" + user_id +
                '}';
    }

    private Date create_by;
    private Date modified_by;
    private Integer Likes;
    private Integer Tranffic;
    private Long user_id;

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getSort_id() {
        return sort_id;
    }

    public void setSort_id(long sort_id) {
        this.sort_id = sort_id;
    }

    public String getTitile() {
        return titile;
    }

    public void setTitile(String titile) {
        this.titile = titile;
    }

    public boolean isIs_top() {
        return is_top;
    }

    public void setIs_top(boolean is_top) {
        this.is_top = is_top;
    }

    public Date getCreate_by() {
        return create_by;
    }

    public void setCreate_by(Date create_by) {
        this.create_by = create_by;
    }

    public Date getModified_by() {
        return modified_by;
    }

    public void setModified_by(Date modified_by) {
        this.modified_by = modified_by;
    }

    public Integer getLikes() {
        return Likes;
    }

    public void setLikes(Integer likes) {
        Likes = likes;
    }

    public Integer getTranffic() {
        return Tranffic;
    }

    public void setTranffic(Integer tranffic) {
        Tranffic = tranffic;
    }
}

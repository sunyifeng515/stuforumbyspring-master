package com.stuforum.demo.entity;

import java.util.Date;

public class ArticleInfo {
    private Long id;

    private String title;

    private Boolean is_top;

    private Date create_by;

    @Override
    public String toString() {
        return "ArticleInfo{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", is_top=" + is_top +
                ", create_by=" + create_by +
                ", user_id=" + user_id +
                ", tranffic=" + tranffic +
                ", likes=" + likes +
                '}';
    }

    private Long user_id;

    private Integer tranffic;

    private Integer likes;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Boolean getIs_top() {
        return is_top;
    }

    public void setIs_top(Boolean is_top) {
        this.is_top = is_top;
    }

    public Date getCreate_by() {
        return create_by;
    }

    public void setCreate_by(Date create_by) {
        this.create_by = create_by;
    }

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public Integer getTranffic() {
        return tranffic;
    }

    public void setTranffic(Integer tranffic) {
        this.tranffic = tranffic;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }
}
package com.kgc.entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Invitation {
    private Integer id;

    private String title;

    private String summary;

    private String author;

    public Replydetail getReplydetail() {
        return replydetail;
    }

    public void setReplydetail(Replydetail replydetail) {
        this.replydetail = replydetail;
    }

    private Date creatdate;
    private  Replydetail replydetail;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary == null ? null : summary.trim();
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
    }

    public Date getCreatdate() {
        return creatdate;
    }
@DateTimeFormat(pattern = "yyyy-MM-dd")
    public void setCreatdate(Date creatdate) {
        this.creatdate = creatdate;
    }
}
package com.kgc.entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Replydetail {
    private Integer id;

    private Integer invid;

    private String content;

    private String replyauthor;

    public Invitation getInvitation() {
        return invitation;
    }

    public void setInvitation(Invitation invitation) {
        this.invitation = invitation;
    }

    private Date recreatdate;
    private Invitation invitation;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getInvid() {
        return invid;
    }

    public void setInvid(Integer invid) {
        this.invid = invid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getReplyauthor() {
        return replyauthor;
    }

    public void setReplyauthor(String replyauthor) {
        this.replyauthor = replyauthor == null ? null : replyauthor.trim();
    }

    public Date getRecreatdate() {
        return recreatdate;
    }
@DateTimeFormat(pattern = "yyyy-MM-dd")
    public void setRecreatdate(Date recreatdate) {
        this.recreatdate = recreatdate;
    }
}
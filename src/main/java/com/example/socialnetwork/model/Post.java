package com.example.socialnetwork.model;

import java.util.Date;

public class Post {
    private int postId;
    private int userId;
    private String content;
    private Date postDate;

    public Post() {
    }

    public Post(int postId, int userId, String content, Date postDate) {
        this.postId = postId;
        this.userId = userId;
        this.content = content;
        this.postDate = postDate;
    }

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getPostDate() {
        return postDate;
    }

    public void setPostDate(Date postDate) {
        this.postDate = postDate;
    }
}

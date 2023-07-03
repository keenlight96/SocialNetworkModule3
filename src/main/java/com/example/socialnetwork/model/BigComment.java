package com.example.socialnetwork.model;

import java.util.Date;

public class BigComment {
    private int commentId;
    private int postId;
    private User user;
    private String content;
    private Date commentDate;
    private int commentSourceId;

    public BigComment() {
    }

    public BigComment(int commentId, int postId, User user, String content, Date commentDate, int commentSourceId) {
        this.commentId = commentId;
        this.postId = postId;
        this.user = user;
        this.content = content;
        this.commentDate = commentDate;
        this.commentSourceId = commentSourceId;
    }

    public int getCommentId() {
        return commentId;
    }

    public void setCommentId(int commentId) {
        this.commentId = commentId;
    }

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCommentDate() {
        return commentDate;
    }

    public void setCommentDate(Date commentDate) {
        this.commentDate = commentDate;
    }

    public int getCommentSourceId() {
        return commentSourceId;
    }

    public void setCommentSourceId(int commentSourceId) {
        this.commentSourceId = commentSourceId;
    }
}

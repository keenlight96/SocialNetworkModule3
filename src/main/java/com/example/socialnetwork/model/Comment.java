package com.example.socialnetwork.model;

import java.util.Date;

public class Comment {
    private int commentId;
    private int postId;
    private int userId;
    private String content;
    private Date commentDate;
    private int commentSourceId;

    public Comment() {
    }

    public Comment(int commentId, int postId, int userId, String content, Date commentDate, int commentSourceId) {
        this.commentId = commentId;
        this.postId = postId;
        this.userId = userId;
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

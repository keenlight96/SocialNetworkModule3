package com.example.socialnetwork.model;

public class Like {
    private int likeId;
    private int postId;
    private int commentId;
    private int userId;

    public Like() {
    }

    public Like(int likeId, int postId, int commentId, int userId) {
        this.likeId = likeId;
        this.postId = postId;
        this.commentId = commentId;
        this.userId = userId;
    }

    public int getLikeId() {
        return likeId;
    }

    public void setLikeId(int likeId) {
        this.likeId = likeId;
    }

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public int getCommentId() {
        return commentId;
    }

    public void setCommentId(int commentId) {
        this.commentId = commentId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}

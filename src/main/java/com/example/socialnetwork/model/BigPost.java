package com.example.socialnetwork.model;

import java.util.Date;
import java.util.List;

public class BigPost {
    private int postId;
    private int userId;
    private String content;
    private Date postDate;
    private List<Photo> photos;
    private List<Like> likes;
    private boolean isLiked;
    private List<Comment> comments;

    public BigPost() {
    }

    public BigPost(int postId, int userId, String content, Date postDate, List<Photo> photos, List<Like> likes, boolean isLiked, List<Comment> comments) {
        this.postId = postId;
        this.userId = userId;
        this.content = content;
        this.postDate = postDate;
        this.photos = photos;
        this.likes = likes;
        this.isLiked = isLiked;
        this.comments = comments;
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

    public List<Photo> getPhotos() {
        return photos;
    }

    public void setPhotos(List<Photo> photos) {
        this.photos = photos;
    }

    public List<Like> getLikes() {
        return likes;
    }

    public void setLikes(List<Like> likes) {
        this.likes = likes;
    }

    public boolean isLiked() {
        return isLiked;
    }

    public void setLiked(boolean liked) {
        isLiked = liked;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }
}

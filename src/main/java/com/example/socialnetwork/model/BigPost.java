package com.example.socialnetwork.model;

import java.util.Date;
import java.util.List;

public class BigPost {
    private int postId;
    private User user;
    private String content;
    private Date postDate;
    private Post sharedPost;
    private User sharedPostUser;
    private String sharedPostShortContent;
    private Photo sharedPostPhoto;
    private List<Photo> photos;
    private List<Like> likes;
    private boolean isLiked;
    private List<BigComment> bigComments;

    public BigPost() {
    }

    public BigPost(int postId, User user, String content, Date postDate, Post sharedPost, User sharedPostUser, String sharedPostShortContent, Photo sharedPostPhoto, List<Photo> photos, List<Like> likes, boolean isLiked, List<BigComment> bigComments) {
        this.postId = postId;
        this.user = user;
        this.content = content;
        this.postDate = postDate;
        this.sharedPost = sharedPost;
        this.sharedPostUser = sharedPostUser;
        this.sharedPostShortContent = sharedPostShortContent;
        this.sharedPostPhoto = sharedPostPhoto;
        this.photos = photos;
        this.likes = likes;
        this.isLiked = isLiked;
        this.bigComments = bigComments;
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

    public Date getPostDate() {
        return postDate;
    }

    public void setPostDate(Date postDate) {
        this.postDate = postDate;
    }

    public Post getSharedPost() {
        return sharedPost;
    }

    public void setSharedPost(Post sharedPost) {
        this.sharedPost = sharedPost;
    }

    public User getSharedPostUser() {
        return sharedPostUser;
    }

    public void setSharedPostUser(User sharedPostUser) {
        this.sharedPostUser = sharedPostUser;
    }

    public String getSharedPostShortContent() {
        return sharedPostShortContent;
    }

    public void setSharedPostShortContent(String sharedPostShortContent) {
        this.sharedPostShortContent = sharedPostShortContent;
    }

    public Photo getSharedPostPhoto() {
        return sharedPostPhoto;
    }

    public void setSharedPostPhoto(Photo sharedPostPhoto) {
        this.sharedPostPhoto = sharedPostPhoto;
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

    public List<BigComment> getBigComments() {
        return bigComments;
    }

    public void setBigComments(List<BigComment> bigComments) {
        this.bigComments = bigComments;
    }
}

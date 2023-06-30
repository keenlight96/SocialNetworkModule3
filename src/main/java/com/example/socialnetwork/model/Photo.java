package com.example.socialnetwork.model;

public class Photo {
    private int photoId;
    private int postId;
    private String photoSource;

    public Photo() {
    }

    public Photo(int photoId, int postId, String photoSource) {
        this.photoId = photoId;
        this.postId = postId;
        this.photoSource = photoSource;
    }

    public int getPhotoId() {
        return photoId;
    }

    public void setPhotoId(int photoId) {
        this.photoId = photoId;
    }

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public String getPhotoSource() {
        return photoSource;
    }

    public void setPhotoSource(String photoSource) {
        this.photoSource = photoSource;
    }
}

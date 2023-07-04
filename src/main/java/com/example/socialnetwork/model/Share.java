package com.example.socialnetwork.model;

import java.util.Date;

public class Share {
    private int shareId;
    private int postId;
    private int postSourceId;

    public Share() {
    }

    public Share(int shareId, int postId, int postSourceId) {
        this.shareId = shareId;
        this.postId = postId;
        this.postSourceId = postSourceId;
    }

    public int getShareId() {
        return shareId;
    }

    public void setShareId(int shareId) {
        this.shareId = shareId;
    }

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public int getPostSourceId() {
        return postSourceId;
    }

    public void setPostSourceId(int postSourceId) {
        this.postSourceId = postSourceId;
    }
}

package com.example.socialnetwork.model;

import java.util.Date;

public class Share {
    private int postId;
    private int userId;
    private Date shareDate;

    public Share() {
    }

    public Share(int postId, int userId, Date shareDate) {
        this.postId = postId;
        this.userId = userId;
        this.shareDate = shareDate;
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

    public Date getShareDate() {
        return shareDate;
    }

    public void setShareDate(Date shareDate) {
        this.shareDate = shareDate;
    }
}

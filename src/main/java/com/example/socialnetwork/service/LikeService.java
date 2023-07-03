package com.example.socialnetwork.service;

import com.example.socialnetwork.dao.LikeDAO;
import com.example.socialnetwork.model.Account;
import com.example.socialnetwork.model.Like;
import com.example.socialnetwork.model.Post;

public class LikeService {
    LikeDAO likeDAO = new LikeDAO();
    public void doTogglePostLike(Account currentAccount, Post post, String action) {
        if (action.equals("toLike")) {
            int postId = post.getPostId();
            int userId = currentAccount.getUserId();
            Like like = new Like(0, postId, 0, userId);
            likeDAO.insertPostLike(like);
        } else {
            Like like = likeDAO.selectLikeByPostAndUserId(post, currentAccount.getUserId());
            likeDAO.deleteLike(like);
        }
    }
}

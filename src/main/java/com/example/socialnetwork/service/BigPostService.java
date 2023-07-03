package com.example.socialnetwork.service;

import com.example.socialnetwork.dao.LikeDAO;
import com.example.socialnetwork.dao.PhotoDAO;
import com.example.socialnetwork.dao.PostDAO;
import com.example.socialnetwork.dao.UserDAO;
import com.example.socialnetwork.model.*;

import java.util.ArrayList;
import java.util.List;

public class BigPostService {
    UserDAO userDAO = new UserDAO();
    PostDAO postDAO = new PostDAO();
    PhotoDAO photoDAO = new PhotoDAO();
    LikeDAO likeDAO = new LikeDAO();
    BigCommentService bigCommentService = new BigCommentService();

    public List<BigPost> getAllBigPostsByUser(User user) {
        List<BigPost> bigPosts = new ArrayList<>();
        List<Post> posts = postDAO.selectAllPostsByUser(user);
        for (Post post :
                posts) {
            List<Photo> photos = photoDAO.selectAllPhotosByPost(post);
            List<Like> likes = likeDAO.selectAllLikesByPost(post);
            List<BigComment> bigComments = bigCommentService.getAllBigCommentsByPostId(post.getPostId());

            bigPosts.add(new BigPost(post.getPostId(), user, post.getContent(), post.getPostDate(),
                    photos, likes, false, bigComments));
        }
        return bigPosts;
    }

    public BigPost getBigPostByPost(Post post) {
        User user = userDAO.selectUserByUserId(post.getUserId());
        List<Photo> photos = photoDAO.selectAllPhotosByPost(post);
        List<Like> likes = likeDAO.selectAllLikesByPost(post);
        List<BigComment> bigComments = bigCommentService.getAllBigCommentsByPostId(post.getPostId());

        return new BigPost(post.getPostId(), user, post.getContent(), post.getPostDate(),
                photos, likes, false, bigComments);
    }

    public boolean isLiked(Post post, Account account) {
        List<Like> likes = likeDAO.selectAllLikesByPost(post);
        for (Like like :
                likes) {
            if (like.getUserId() == account.getUserId())
                return true;
        }
        return false;
    }

    public int countLikes(Post post) {
        List<Like> likes = likeDAO.selectAllLikesByPost(post);
        return likes.size();
    }
}

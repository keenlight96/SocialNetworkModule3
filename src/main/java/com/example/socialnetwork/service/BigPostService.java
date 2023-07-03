package com.example.socialnetwork.service;

import com.example.socialnetwork.dao.LikeDAO;
import com.example.socialnetwork.dao.PhotoDAO;
import com.example.socialnetwork.dao.PostDAO;
import com.example.socialnetwork.model.*;

import java.util.ArrayList;
import java.util.List;

public class BigPostService {
    PostDAO postDAO = new PostDAO();
    PhotoDAO photoDAO = new PhotoDAO();
    LikeDAO likeDAO = new LikeDAO();

    public List<BigPost> getAllBigPostsByUser(User user) {
        List<BigPost> bigPosts = new ArrayList<>();
        List<Post> posts = postDAO.selectAllPostsByUser(user);
        for (Post post :
                posts) {
            List<Photo> photos = photoDAO.selectAllPhotosByPost(post);
            List<Like> likes = likeDAO.selectAllLikesByPost(post);
            List<Comment> comments = null;

            bigPosts.add(new BigPost(post.getPostId(), post.getUserId(), post.getContent(), post.getPostDate(),
                    photos, likes, false, comments));
        }
        return bigPosts;
    }

    public BigPost getBigPostByPost(Post post) {
        List<Photo> photos = photoDAO.selectAllPhotosByPost(post);
        List<Like> likes = likeDAO.selectAllLikesByPost(post);
        List<Comment> comments = null;

        return new BigPost(post.getPostId(), post.getUserId(), post.getContent(), post.getPostDate(),
                photos, likes, false, comments);
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

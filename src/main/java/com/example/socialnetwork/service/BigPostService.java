package com.example.socialnetwork.service;

import com.example.socialnetwork.dao.*;
import com.example.socialnetwork.model.*;

import java.util.ArrayList;
import java.util.List;

public class BigPostService {
    UserDAO userDAO = new UserDAO();
    PostDAO postDAO = new PostDAO();
    PhotoDAO photoDAO = new PhotoDAO();
    LikeDAO likeDAO = new LikeDAO();
    ShareDAO shareDAO = new ShareDAO();
    BigCommentService bigCommentService = new BigCommentService();

    public List<BigPost> getAllBigPostsByUser(User user) {
        List<BigPost> bigPosts = new ArrayList<>();
        List<Post> posts = postDAO.selectAllPostsByUser(user);
        for (Post post :
                posts) {
            List<Photo> photos = photoDAO.selectAllPhotosByPost(post);
            List<Like> likes = likeDAO.selectAllLikesByPost(post);
            List<BigComment> bigComments = bigCommentService.getAllBigCommentsByPostId(post.getPostId());

            // get share content if had
            Share share = shareDAO.selectShareByPost(post);
            if (share != null) {
                User sharedPostUser = userDAO.selectUserByPostId(share.getPostSourceId());
                System.out.println(sharedPostUser.getFirstName());
                Post sharedPost = postDAO.selectPostByPostId(share.getPostSourceId());
                String sharedPostFullContent = sharedPost.getContent();
                String sharedPostShortContent;
                if (sharedPostFullContent.length() <= 50) {
                    sharedPostShortContent = sharedPostFullContent;
                } else {
                    sharedPostShortContent = sharedPostFullContent.substring(0, 50) + "...";
                }
                Photo sharedPostPhoto = photoDAO.selectFirstPhotosByPost(sharedPost);

                bigPosts.add(new BigPost(post.getPostId(), user, post.getContent(), post.getPostDate(),
                        sharedPost, sharedPostUser, sharedPostShortContent, sharedPostPhoto, photos, likes, false, bigComments));
            } else {
                bigPosts.add(new BigPost(post.getPostId(), user, post.getContent(), post.getPostDate(),
                        null, null, null, null, photos, likes, false, bigComments));
            }
        }
        return bigPosts;
    }

    public BigPost getBigPostByPost(Post post) {
        User user = userDAO.selectUserByUserId(post.getUserId());

        List<Photo> photos = photoDAO.selectAllPhotosByPost(post);
        List<Like> likes = likeDAO.selectAllLikesByPost(post);
        List<BigComment> bigComments = bigCommentService.getAllBigCommentsByPostId(post.getPostId());

        // get share content if had
        Share share = shareDAO.selectShareByPost(post);
        if (share != null) {
            User sharedPostUser = userDAO.selectUserByPostId(share.getPostSourceId());
            Post sharedPost = postDAO.selectPostByPostId(share.getPostSourceId());
            String sharedPostFullContent = sharedPost.getContent();
            String sharedPostShortContent;
            if (sharedPostFullContent.length() <= 50) {
                sharedPostShortContent = sharedPostFullContent;
            } else {
                sharedPostShortContent = sharedPostFullContent.substring(0, 50) + "...";
            }
            Photo sharedPostPhoto = photoDAO.selectFirstPhotosByPost(sharedPost);

            return new BigPost(post.getPostId(), user, post.getContent(), post.getPostDate(),
                    sharedPost, sharedPostUser, sharedPostShortContent, sharedPostPhoto, photos, likes, false, bigComments);
        } else {
            return new BigPost(post.getPostId(), user, post.getContent(), post.getPostDate(),
                    null, null, null, null, photos, likes, false, bigComments);
        }

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

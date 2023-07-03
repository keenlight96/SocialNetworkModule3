package com.example.socialnetwork.service;

import com.example.socialnetwork.dao.CommentDAO;
import com.example.socialnetwork.dao.UserDAO;
import com.example.socialnetwork.model.BigComment;
import com.example.socialnetwork.model.Comment;
import com.example.socialnetwork.model.User;

import java.util.ArrayList;
import java.util.List;

public class BigCommentService {
    CommentDAO commentDAO = new CommentDAO();
    UserDAO userDAO = new UserDAO();

    public List<BigComment> getAllBigCommentsByPostId(int postId){
        List<Comment> comments = commentDAO.selectAllCommentsByPostId(postId);
        List<BigComment> bigComments = new ArrayList<>();
        for (Comment comment :
                comments) {
            User user = userDAO.selectUserByUserId(comment.getUserId());
            bigComments.add(new BigComment(comment.getCommentId(), comment.getPostId(), user, comment.getContent(),
                    comment.getCommentDate(), comment.getCommentSourceId()));
        }
        return bigComments;
    }
}

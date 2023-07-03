package com.example.socialnetwork.dao;

import com.example.socialnetwork.model.Comment;
import com.example.socialnetwork.service.DateService;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CommentDAO {
    Connection connection = ConnectMySQL.getConnection();
    public void insertCommentPost(Comment comment) {
        String sql = "insert into Comment(PostId, UserId, Content, CommentDate) values (?,?,?,?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, comment.getPostId());
            preparedStatement.setInt(2, comment.getUserId());
            preparedStatement.setString(3, comment.getContent());
            preparedStatement.setString(4, DateService.convertDateToDateTimeSQL(comment.getCommentDate()));
            preparedStatement.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<Comment> selectAllCommentsByPostId(int postId) {
        List<Comment> comments = new ArrayList<>();
        String sql = "select * from Comment where PostId = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, postId);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                int commentId = resultSet.getInt("CommentId");
                int userId = resultSet.getInt("UserId");
                String content = resultSet.getString("Content");
                Date commentDate = DateService.convertDateTimeSQLToDate(resultSet.getString("CommentDate"));
                int commentSourceId = resultSet.getInt("CommentSourceId");

                comments.add(new Comment(commentId, postId, userId, content, commentDate, commentSourceId));
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return comments;
    }
}

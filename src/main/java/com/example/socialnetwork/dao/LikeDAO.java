package com.example.socialnetwork.dao;

import com.example.socialnetwork.model.Like;
import com.example.socialnetwork.model.Post;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class LikeDAO {
    Connection connection = ConnectMySQL.getConnection();
    public void insertPostLike(Like like) {
        String sql = "insert into `Like`(LikeId, PostId, UserId) values (?,?,?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, like.getLikeId());
            preparedStatement.setInt(2, like.getPostId());
            preparedStatement.setInt(3, like.getUserId());
            preparedStatement.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteLike(Like like) {
        String sql = "delete from `Like` where LikeId = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, like.getLikeId());
            preparedStatement.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<Like> selectAllLikesByPost(Post post) {
        List<Like> likes = new ArrayList<>();
        String sql = "select * from `Like` where PostId = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, post.getPostId());
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                int likeId = resultSet.getInt("LikeId");
                int postId = resultSet.getInt("PostId");
                int commentId = resultSet.getInt("CommentId");
                int userId = resultSet.getInt("UserId");

                likes.add(new Like(likeId, postId, commentId, userId));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return likes;
    }

    public Like selectLikeByPostAndUserId(Post post, int userId) {
        String sql = "select * from `Like` where PostId = ? and UserId = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, post.getPostId());
            preparedStatement.setInt(2, userId);

            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                int likeId = resultSet.getInt("LikeId");
                int postId = resultSet.getInt("PostId");
                int commentId = resultSet.getInt("CommentId");

                return new Like(likeId, postId, commentId, userId);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}

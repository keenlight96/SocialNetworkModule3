package com.example.socialnetwork.dao;

import com.example.socialnetwork.model.Post;
import com.example.socialnetwork.model.Share;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ShareDAO {
    Connection connection = ConnectMySQL.getConnection();
    public void insertShare(Share share) {
        String sql = "insert into Share(PostId, PostSourceId) values (?,?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, share.getPostId());
            preparedStatement.setInt(2, share.getPostSourceId());
            preparedStatement.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Share selectShareByPost(Post post) {
        String sql = "select * from Share where PostId = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, post.getPostId());
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                int shareId = resultSet.getInt("ShareId");
                int postId = resultSet.getInt("PostId");
                int postSourceId = resultSet.getInt("PostSourceId");
                return new Share(shareId, postId, postSourceId);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}

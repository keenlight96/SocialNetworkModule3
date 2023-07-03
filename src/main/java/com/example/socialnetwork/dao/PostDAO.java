package com.example.socialnetwork.dao;

import com.example.socialnetwork.model.Post;
import com.example.socialnetwork.model.User;
import com.example.socialnetwork.service.DateService;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PostDAO {
    Connection connection = ConnectMySQL.getConnection();
    public int insertPost(Post post) { // return postId
        String sql = "insert into Post(UserID, Content, PostDate) values (?,?,?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setInt(1, post.getUserId());
            preparedStatement.setString(2, post.getContent());
            preparedStatement.setString(3, DateService.convertDateToDateTimeSQL(post.getPostDate()));
            preparedStatement.execute();

            ResultSet resultSet = preparedStatement.getGeneratedKeys();
            if (resultSet.next())
                return resultSet.getInt(1);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public List<Post> selectAllPostsByUser(User user) {
        List<Post> posts = new ArrayList<>();
        String sql = "select * from Post where UserId = ? order by Postid desc";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, user.getUserId());
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                int postId = resultSet.getInt("PostId");
                int userId = resultSet.getInt("UserId");
                String content = resultSet.getString("Content");
                Date postDate = DateService.convertDateTimeSQLToDate(resultSet.getString("PostDate"));
                posts.add(new Post(postId, userId, content, postDate));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return posts;
    }

    public Post selectPostByPostId(int postId) {
        String sql = "select * from Post where PostId = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, postId);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                int userId = resultSet.getInt("UserId");
                String content = resultSet.getString("Content");
                Date postDate = DateService.convertDateTimeSQLToDate(resultSet.getString("PostDate"));
                return new Post(postId, userId, content, postDate);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}

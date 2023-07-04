package com.example.socialnetwork.dao;

import com.example.socialnetwork.model.Photo;
import com.example.socialnetwork.model.Post;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class PhotoDAO {
    Connection connection = ConnectMySQL.getConnection();

    public void insertPhoto(Photo photo) {
        String sql = "insert into Photo(PostId, PhotoSource) values (?,?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, photo.getPostId());
            preparedStatement.setString(2, photo.getPhotoSource());
            preparedStatement.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<Photo> selectAllPhotosByPost(Post post) {
        List<Photo> photos = new ArrayList<>();
        String sql = "select * from Photo where PostId = ? ";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, post.getPostId());
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                int photoId = resultSet.getInt("PhotoId");
                int postId = resultSet.getInt("PostId");
                String photoSource = resultSet.getString("PhotoSource");

                photos.add(new Photo(photoId, postId, photoSource));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return photos;
    }

    public Photo selectFirstPhotosByPost(Post post) {
        String sql = "select * from Photo where PostId = ? ";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, post.getPostId());
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                int photoId = resultSet.getInt("PhotoId");
                int postId = resultSet.getInt("PostId");
                String photoSource = resultSet.getString("PhotoSource");

                return new Photo(photoId, postId, photoSource);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}

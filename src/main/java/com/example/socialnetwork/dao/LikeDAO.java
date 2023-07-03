package com.example.socialnetwork.dao;

import com.example.socialnetwork.dao.connection.MyConnection;
import com.example.socialnetwork.model.Like;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LikeDAO {
    Connection connection;

//    1. Lấy user_id từ bảng Like dựa trên PostID:
//    2. Đếm số lượng lượt thích của một bài viết cụ thể dựa trên PostID:
//    3. Chèn một dòng mới vào bảng Like với các giá trị UserID và PostID:
//    4. Xóa các dòng trong bảng Like dựa trên UserID:
//    5. Tìm kiếm các dòng trong bảng Like dựa trên cặp UserID và PostID:
//    6. Lấy tất cả các cột từ bảng Like dựa trên LikeID:

    private final String SELECT_USER = "SELECT UserID FROM `Like` WHERE PostID = ?";
    private final String SELECT_LIKE_COUNT = "SELECT COUNT(*) AS like_count FROM `Like` WHERE PostID = ?";
    private final String INSERT_INTO = "INSERT INTO `Like` (UserID, PostID) VALUES (?, ?)";
    private final String DELETE_BY_ID = "DELETE FROM `Like` WHERE UserID = ?";
    private final String FIND_BY_USER_AND_POST = "SELECT * FROM `Like` WHERE UserID = ? AND PostID = ?";

    private final String SELECT_BY_ID = "SELECT * FROM `Like` WHERE LikeID = ?";

    public LikeDAO(){
        connection = MyConnection.getConnection();
    }
    public List<Like> displayUser(){
        List<Like> likeList = new ArrayList<>();
        try(PreparedStatement preparedStatement = connection.prepareStatement(SELECT_USER)) {
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                int userID = resultSet.getInt("userID");

            }

        }catch (SQLException e){
            e.printStackTrace();
        }
        return likeList;
    }


}

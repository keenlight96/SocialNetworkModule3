package com.example.socialnetwork.dao;

import com.example.socialnetwork.model.User;
import com.example.socialnetwork.service.DateService;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserDAO {
    Connection connection = ConnectMySQL.getConnection();
    public User selectUserByUsername(String username) {
        String sql = "select User.* from Account join User on User.userid = Account.userid where username = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, username);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                int userid = resultSet.getInt("UserId");
                String firstName = resultSet.getString("FirstName");
                String lastName = resultSet.getString("LastName");
                Date birthday = DateService.convertDateSQLToDate(resultSet.getString("Birthday"));
                String gender = resultSet.getString("Gender");
                String email = resultSet.getString("Email");
                String phoneNumber = resultSet.getString("PhoneNumber");
                String address = resultSet.getString("Address");

                return new User(userid, firstName, lastName, birthday, gender, email, phoneNumber, address);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public User selectUserByUserId(int userId) {
        String sql = "select * from User where UserId = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, userId);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                int userid = resultSet.getInt("UserId");
                String firstName = resultSet.getString("FirstName");
                String lastName = resultSet.getString("LastName");
                Date birthday = DateService.convertDateSQLToDate(resultSet.getString("Birthday"));
                String gender = resultSet.getString("Gender");
                String email = resultSet.getString("Email");
                String phoneNumber = resultSet.getString("PhoneNumber");
                String address = resultSet.getString("Address");

                return new User(userid, firstName, lastName, birthday, gender, email, phoneNumber, address);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public User selectUserByPostId(int postId) {
        String sql = "select User.* from User join Post on User.UserId = Post.UserId where PostId = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, postId);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                int userid = resultSet.getInt("UserId");
                String firstName = resultSet.getString("FirstName");
                String lastName = resultSet.getString("LastName");
                Date birthday = DateService.convertDateSQLToDate(resultSet.getString("Birthday"));
                String gender = resultSet.getString("Gender");
                String email = resultSet.getString("Email");
                String phoneNumber = resultSet.getString("PhoneNumber");
                String address = resultSet.getString("Address");

                return new User(userid, firstName, lastName, birthday, gender, email, phoneNumber, address);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<User> selectAllUsers() {
        List<User> users = new ArrayList<>();
        String sql = "select * from User";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int userid = resultSet.getInt("UserId");
                String firstName = resultSet.getString("FirstName");
                String lastName = resultSet.getString("LastName");
                Date birthday = DateService.convertDateSQLToDate(resultSet.getString("Birthday"));
                String gender = resultSet.getString("Gender");
                String email = resultSet.getString("Email");
                String phoneNumber = resultSet.getString("PhoneNumber");
                String address = resultSet.getString("Address");

                users.add(new User(userid, firstName, lastName, birthday, gender, email, phoneNumber, address)) ;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return users;
    }


}

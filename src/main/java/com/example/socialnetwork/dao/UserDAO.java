package com.example.socialnetwork.dao;

import com.example.socialnetwork.model.User;
import com.example.socialnetwork.service.DateService;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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

    public boolean updateUser(User user) {
        try  {
            String sql = "UPDATE User SET FirstName = ?, LastName = ?, Birthday = ?, Gender = ?, Email = ?, PhoneNumber = ?, Address = ? WHERE UserID = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, user.getFirstName());
            statement.setString(2, user.getLastName());
            statement.setString(3, DateService.convertDateToDateSQL(user.getBirthday()));
            statement.setString(4, user.getGender());
            statement.setString(5, user.getEmail());
            statement.setString(6, user.getPhoneNumber());
            statement.setString(7, user.getAddress());
            statement.setInt(8, user.getUserId());

            int rowsUpdated = statement.executeUpdate();
            return rowsUpdated > 0;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }


}

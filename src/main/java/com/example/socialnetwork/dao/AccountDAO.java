package com.example.socialnetwork.dao;

import com.example.socialnetwork.model.Account;
import com.example.socialnetwork.model.User;
import com.example.socialnetwork.service.DateService;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AccountDAO {
    Connection connection = ConnectMySQL.getConnection();

    public Account selectAccount(String email, String username, String password) {
        String sql = "select * from account where (email=? or username=?) and password=?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, email);
            preparedStatement.setString(2, username);
            preparedStatement.setString(3, password);
            ResultSet resultSet = preparedStatement.executeQuery();
            resultSet.next();

            int id = resultSet.getInt("userid");
            String _email = resultSet.getString("email");
            String _username = resultSet.getString("username");
            String role = resultSet.getString("role");
            String status = resultSet.getString("status");
            return new Account(id, _email, _username, password, role, status);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public String selectUsername(String username) {
        String sql = "select username from account where username = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, username);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (!resultSet.next())
                return null;
            else
                return resultSet.getString("username");
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public void insertAccountAndUser(Account account, User user) {
        String sql1 = "insert into account(email, username, password, role, status) values (?,?,?,?,?)";
        String sql2 = "insert into user(firstName, lastName, birthday, gender, email, phoneNumber, address) values (?,?,?,?,?,?,?)";
        try {
            // Insert account
            connection.setAutoCommit(false);
            PreparedStatement preparedStatement1 = connection.prepareStatement(sql1);
            preparedStatement1.setString(1, account.getEmail());
            preparedStatement1.setString(2, account.getUsername());
            preparedStatement1.setString(3, account.getPassword());
            preparedStatement1.setString(4, account.getRole());
            preparedStatement1.setString(5, account.getStatus());
            preparedStatement1.execute();

            // Insert user
            PreparedStatement preparedStatement2 = connection.prepareStatement(sql2);
            preparedStatement2.setString(1, user.getFirstName());
            preparedStatement2.setString(2, user.getLastName());
            preparedStatement2.setString(3, DateService.convertDateToDateSQL(user.getBirthday()));
            preparedStatement2.setString(4, user.getGender());
            preparedStatement2.setString(5, user.getEmail());
            preparedStatement2.setString(6, user.getPhoneNumber());
            preparedStatement2.setString(7, user.getAddress());
            preparedStatement2.execute();

            // Commit
            connection.commit();
            System.out.println("committed");
        } catch (Exception e) {
            e.printStackTrace();
            try {
                connection.rollback();
                System.out.println("rolled back");
            } catch (Exception e2) {
                e.printStackTrace();
            }
        } finally {
            try {
                connection.setAutoCommit(true);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }


    }
}














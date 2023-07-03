package com.example.socialnetwork.dao;

import com.example.socialnetwork.model.Account;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDAO {
    Connection connection = null;
    PreparedStatement preparedStatement = null;
    ResultSet resultSet = null;

    public Account getLogin(String username, String password) {
        try {
            connection = new ConnectMySQL().getConnection();
            String sql = "select * from account where username = ? and password = ?;";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, username);
            statement.setString(2, password);
            ResultSet resultSet = statement.executeQuery();

            resultSet.next();
            int userId = resultSet.getInt("userId");
            String email = resultSet.getString("email");
            String role = resultSet.getString("role");
            String status = resultSet.getString("status");
            return new Account(userId, email, username, password, role, status);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public Account checkAccountExit(String username) throws ClassNotFoundException {
        String sql ="SELECT * FROM account WHERE username = ?;";
        try {
            connection = new ConnectMySQL().getConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, username);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                return new Account(
                        resultSet.getInt("userId"),
                        resultSet.getString("username"),
                        resultSet.getString("password"),
                        resultSet.getString("email"),
                        resultSet.getString("role"),
                        resultSet.getString("status"));
            }
        } catch (SQLException e) {
        }
        return null;
    }

    public void registers(String username, String password){
        String sql = "INSERT INTO account(username, password, email, role, status) VALUES(?, ?, ?, ?, ?);";
        try {
            connection = new ConnectMySQL().getConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
        }
    }

    public static void main(String[] args) {
        LoginDAO loginDAO = new LoginDAO();
        Account account = loginDAO.getLogin("trandung", "quocdung");
        System.out.println(account);
    }
}

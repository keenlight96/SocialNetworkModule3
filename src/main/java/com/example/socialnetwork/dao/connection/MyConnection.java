package com.example.socialnetwork.dao.connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class MyConnection {
    public static final String URL = "jdbc:mysql://localhost:3306/socialnetwork?useSSL=false";
    public static final String USERNAME = "root";
    public static final String PASSWORD = "123456";
    private static Connection connection;

    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}

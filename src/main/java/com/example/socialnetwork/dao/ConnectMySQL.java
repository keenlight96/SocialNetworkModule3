package com.example.socialnetwork.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectMySQL {
    public static final String URL = "jdbc:mysql://localhost:3306/socialnetwork?useSSL=false&allowPublicKeyRetrieval=true";
    public static final String USERNAME = "root";
    public static final String PASSWORD = "2811Hung";

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

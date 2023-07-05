package com.example.socialnetwork.service;

import com.example.socialnetwork.dao.UserDAO;
import com.example.socialnetwork.model.User;

import javax.servlet.http.HttpServletRequest;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public class UserService {
    private final UserDAO userDAO;
    private static UserService userService;

    public UserService() {
        userDAO = new UserDAO();
    }
    public static UserService getInstance(){
        if (userService == null){
            userService = new UserService();
        }
        return userService;
    }
    public User DisplayInfo(HttpServletRequest req){
        int id = Integer.parseInt(req.getParameter("id"));
        return userDAO.selectUserByUserId(id);
    }
    public List<User> findAll(){
        return userDAO.selectAllUsers();
    }
    public User getUserById(int userId) throws SQLException {
        return userDAO.selectUserByUserId(userId);
    }

    public boolean updateUser(int userId, String firstName, String lastName, Date birthday, String gender, String email, String phoneNumber, String address) throws SQLException {
        User user = new User(userId, firstName, lastName, birthday, gender, email, phoneNumber, address);
        return userDAO.updateUser(user);
    }
}


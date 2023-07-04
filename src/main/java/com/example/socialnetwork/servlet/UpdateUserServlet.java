package com.example.socialnetwork.servlet;

import com.example.socialnetwork.dao.ConnectMySQL;
import com.example.socialnetwork.service.DateService;
import com.example.socialnetwork.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.util.Date;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@WebServlet("/user")
public class UpdateUserServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private UserService userService;
    private UpdateUserServlet updateUserService;

    public void init() {
        userService = new UserService();
        updateUserService = new UpdateUserServlet();

    }

//    private final UserService userService = UserService.getInstance();
//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//
//    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int userId = Integer.parseInt(req.getParameter("userID"));
        String firstName = req.getParameter("firstName");
        String lastName = req.getParameter("lastName");
        String email = req.getParameter("email");
        String phoneNumber = req.getParameter("phoneNumber");
        int dayOfBirthStr = Integer.parseInt(req.getParameter("dayOfBirth"));
        int monthOfBirthStr = Integer.parseInt(req.getParameter("monthOfBirth"));
        int yearOfBirthStr = Integer.parseInt(req.getParameter("yearOfBirth"));
        String gender = req.getParameter("gender");
        String address = req.getParameter("address");

        Date birthday = DateService.convertToDate(yearOfBirthStr,monthOfBirthStr,dayOfBirthStr);
        System.out.println(birthday);
        try {
            boolean updated = userService.updateUser(userId, firstName, lastName, birthday, gender, email, phoneNumber, address);
            if (updated) {
                resp.sendRedirect( "/time-line");
            } else {
                resp.getWriter().println("Failed to update user.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            resp.getWriter().println("Error occurred while updating user.");
        }
    }

}

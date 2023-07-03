package com.example.socialnetwork.servlet;


import com.example.socialnetwork.service.UserService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "UserServlet", urlPatterns = "/user")
public class UserServlet extends HttpServlet {

    //// tao đối tượng userServlet bằng getInstance/////////
    private final UserService userService = UserService.getInstance();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "information":
                try {
                    informationGet(req,resp);
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
                break;
            default:
        }
    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }

    private void informationGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException, SQLException {
        int userID = Integer.parseInt(req.getParameter("userID"));
        if (userService.checkById(userID)) {
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("/edit-profile-basic.jsp");
            req.setAttribute("user", userService.getById(userID));
            requestDispatcher.forward(req, resp);
        } else {
            resp.sendRedirect("/404.jsp");
        }
    }


}



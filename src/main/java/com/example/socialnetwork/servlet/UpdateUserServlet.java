package com.example.socialnetwork.servlet;

import com.example.socialnetwork.service.UserService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/User")
public class UserServlet extends HttpServlet {
    private final UserService userService = UserService.getInstance();
//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        int id = Integer.parseInt(req.getParameter("id"));
//        if (userService.checkById(id)){
//            RequestDispatcher requestDispatcher = request.getRequestDispatcher("/User/userInfor.jsp");
//            request.setAttribute("user", userService.getById(id));
//            requestDispatcher.forward(request, response);
//        } else {
//            response.sendRedirect("/404.jsp");
//        }
//    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}

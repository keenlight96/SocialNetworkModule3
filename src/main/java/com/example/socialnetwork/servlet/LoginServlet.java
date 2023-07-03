package com.example.socialnetwork.servlet;

import com.example.socialnetwork.model.Account;
import com.example.socialnetwork.service.LoginService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    LoginService loginService = new LoginService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/login-register/login.jsp");
        requestDispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String email_username = req.getParameter("email_username");
        String password = req.getParameter("password");
        Account account = loginService.getAccount(email_username, password);
        if (account != null) {
            HttpSession session = req.getSession();
            session.setAttribute("currentAccount", account);

            RequestDispatcher dispatcher = req.getRequestDispatcher("/time-line");
            dispatcher.forward(req, resp);
        } else {
            req.setAttribute("error", "Sai tên tài khoản hoặc mật khẩu");
            RequestDispatcher dispatcher = req.getRequestDispatcher("/login-register/login.jsp");
            dispatcher.forward(req, resp);
        }
    }
}

package com.example.socialnetwork.service;

import com.example.socialnetwork.dao.LoginDAO;
import com.example.socialnetwork.model.Account;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
@WebServlet("/login")
public class LoginService extends HttpServlet {
    LoginDAO loginDAO = new LoginDAO();

    @Override
    public void init() throws ServletException {
        super.init();
        loginDAO = new LoginDAO();
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            login(req, resp);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    private void login(HttpServletRequest req, HttpServletResponse resp) throws ClassNotFoundException, ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        Account account = loginDAO.getLogin(username, password);
        if (account == null) {
            req.setAttribute("mess", "Đăng nhập thất bại");
            RequestDispatcher dispatcher = req.getRequestDispatcher("login.jsp");
            dispatcher.forward(req, resp);
        } else {
            HttpSession session = req.getSession();
            session.setAttribute("acc", account);
            resp.sendRedirect("/home");
        }
    }
}

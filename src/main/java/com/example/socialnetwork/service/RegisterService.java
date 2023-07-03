package com.example.socialnetwork.service;

import com.example.socialnetwork.dao.LoginDAO;
import com.example.socialnetwork.model.Account;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "RegisterService", value = "/register")
public class RegisterService extends HttpServlet {
    LoginDAO loginDAO = new LoginDAO();

    @Override
    public void init() throws ServletException {
        super.init();
        loginDAO = new LoginDAO();
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        try {
            register(req, resp);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.sendRedirect("/register.jsp");
    }

    private void register(HttpServletRequest req, HttpServletResponse resp) throws ClassNotFoundException, ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        Account account = loginDAO.checkAccountExit(username);
        if (account == null) {
            loginDAO.registers(username, password);
            resp.sendRedirect("/home");
        } else {
            resp.sendRedirect("login.jsp");
        }
    }
}


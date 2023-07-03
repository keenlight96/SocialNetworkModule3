package com.example.socialnetwork.servlet;

import com.example.socialnetwork.dao.AccountDAO;
import com.example.socialnetwork.model.Account;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/AdminDelete")
public class AdminDeleteServlet extends HttpServlet {
    AccountDAO accountDAO = new AccountDAO();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String email = req.getParameter("email");
        System.out.println("123");
        accountDAO.deleteAcc(email);
        resp.sendRedirect("/admin");
    }
}
package com.example.socialnetwork.servlet;

import com.example.socialnetwork.dao.AccountDAO;
import com.example.socialnetwork.model.Account;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/admin")
public class AdminServlet extends HttpServlet {
    AccountDAO accountDAO = new AccountDAO();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Account> list =accountDAO.selectAllAccount();
        req.setAttribute("account", list);
        RequestDispatcher dispatcher = req.getRequestDispatcher("/Admin_LayOut/page_Admin.jsp");
        dispatcher.forward(req,resp);
    }
}
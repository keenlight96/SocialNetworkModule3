package com.example.socialnetwork.servlet;

import com.example.socialnetwork.Manager.ManagerAccount;
import com.example.socialnetwork.model.Account;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/AdminEdit")
public class AdminEditServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String email = req.getParameter("email");
        Account account = findById(email);
        req.setAttribute("acc", account);
        RequestDispatcher dispatcher = req.getRequestDispatcher("/edit.jsp");
        dispatcher.forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String email = req.getParameter("email");
        String name = req.getParameter("name");
        String img = req.getParameter("img");
        Account account = findById(email);
        if (account != null){
//            account.setImg(img);
//            account.setName(name);
        }
        resp.sendRedirect("/admin");
    }



    public Account findById(String email){
        for (Account account: ManagerAccount.account) {
            if (account.getEmail() == email){
                return account;
            }
        }
        return null;
    }

}
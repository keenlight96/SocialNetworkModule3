package com.example.socialnetwork.servlet;



import com.example.socialnetwork.Manager.ManagerAccount;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/AdminDelete")
public class AdminDeleteServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String email = req.getParameter("email");
        for (int i = 0; i < ManagerAccount.account.size(); i++) {
            if (ManagerAccount.account.get(i).getEmail() == email) {
                ManagerAccount.account.remove(i);
            }
        }
        resp.sendRedirect("/home");
    }
}
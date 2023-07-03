package com.example.socialnetwork.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/logout")
public class LogoutServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("logout");
        HttpSession session = req.getSession();
        session.setAttribute("currentAccount", null);
        session.setAttribute("currentProfile", null);
        session.setAttribute("currentPost", null);

        resp.sendRedirect("/login");
    }
}

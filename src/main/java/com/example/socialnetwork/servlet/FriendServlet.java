package com.example.socialnetwork.servlet;

import com.example.socialnetwork.model.Account;
import com.example.socialnetwork.model.Friendship;
import com.example.socialnetwork.service.FriendsService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/friends")
public class FriendServlet extends HttpServlet {
    FriendsService friendsService = new FriendsService();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        Account currentAccount = (Account) session.getAttribute("currentAccount");

        String action =  req.getParameter("action");
        int userId = Integer.parseInt(req.getParameter("userId"));

        switch (action) {
            case "add":
                Friendship friendship = new Friendship(0, currentAccount.getUserId(), userId, "Request");
                friendsService.sendRequest(friendship);
                break;
        }

    }
}

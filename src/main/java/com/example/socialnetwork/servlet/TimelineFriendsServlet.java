package com.example.socialnetwork.servlet;

import com.example.socialnetwork.dao.UserDAO;
import com.example.socialnetwork.model.Account;
import com.example.socialnetwork.model.User;
import com.example.socialnetwork.service.FriendsService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@WebServlet("/timeline-friends")
public class TimelineFriendsServlet extends HttpServlet {
    UserDAO userDAO = new UserDAO();
    FriendsService friendsService = new FriendsService();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        Account currentAccount = (Account) session.getAttribute("currentAccount");
        User currentProfile = (User) session.getAttribute("currentProfile");

        req.setAttribute("user", currentProfile);

        List<User> friends = friendsService.getAllFriendsByUser(currentProfile);
        req.setAttribute("friends", friends);
        List<User> friendRequests = friendsService.getAllFriendRequestsByUser(currentProfile);
        req.setAttribute("friendRequests", friendRequests);
        List<User> requestsSent = friendsService.getAllRequestsSentByUser(currentProfile);
        req.setAttribute("requestsSent", requestsSent);

        req.setAttribute("navFriends","active");
        req.setAttribute("navFriendsReq","");
        req.setAttribute("navReqsSent","");
        req.setAttribute("navFriendsSearch","");
        req.setAttribute("tabFriends","active fade show");
        req.setAttribute("tabFriendsReq","fade");
        req.setAttribute("tabReqsSent","fade");
        req.setAttribute("tabFriendsSearch","fade");

        RequestDispatcher dispatcher = req.getRequestDispatcher("/timeline-friends.jsp");
        dispatcher.forward(req, resp);
    }
}

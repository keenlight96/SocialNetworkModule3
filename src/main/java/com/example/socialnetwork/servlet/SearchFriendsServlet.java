package com.example.socialnetwork.servlet;

import com.example.socialnetwork.dao.UserDAO;
import com.example.socialnetwork.model.Account;
import com.example.socialnetwork.model.User;
import com.example.socialnetwork.service.SearchFriendsService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@WebServlet("/searchFriend")
public class SearchFriendsServlet extends HttpServlet {
    UserDAO userDAO = new UserDAO();
    SearchFriendsService friendsService = new SearchFriendsService();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        Account currentAccount = (Account) session.getAttribute("currentAccount");

        String name = req.getParameter("name");
        List<User> results = friendsService.searchFriends(currentAccount, name);

        req.setAttribute("results", results);
        User user = userDAO.selectUserByUserId(currentAccount.getUserId());
        req.setAttribute("user", user);

        req.setAttribute("navFriends","");
        req.setAttribute("navFriendsReq","");
        req.setAttribute("navFriendsSearch","active");
        req.setAttribute("tabFriends","");
        req.setAttribute("tabFriendsReq","");
        req.setAttribute("tabFriendsSearch","active");

        RequestDispatcher dispatcher = req.getRequestDispatcher("/timeline-friends.jsp");
        dispatcher.forward(req, resp);
    }
}

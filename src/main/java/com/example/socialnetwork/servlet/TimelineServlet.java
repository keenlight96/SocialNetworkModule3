package com.example.socialnetwork.servlet;

import com.example.socialnetwork.dao.PostDAO;
import com.example.socialnetwork.dao.UserDAO;
import com.example.socialnetwork.model.Account;
import com.example.socialnetwork.model.BigPost;
import com.example.socialnetwork.model.Post;
import com.example.socialnetwork.model.User;
import com.example.socialnetwork.service.BigPostService;
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

@WebServlet("/time-line")
public class TimelineServlet extends HttpServlet {
    UserDAO userDAO = new UserDAO();
    PostDAO postDAO = new PostDAO();
    FriendsService friendsService = new FriendsService();
    BigPostService bigPostService = new BigPostService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        Account currentAccount = (Account) session.getAttribute("currentAccount");
        User currentProfile = (User) session.getAttribute("currentProfile");

        int userId = 0;
        boolean isOwner = false;
        if (req.getParameter("userId") != null) {
            userId = Integer.parseInt(req.getParameter("userId"));
            if (userId == currentAccount.getUserId())
                isOwner = true;
        } else if (currentProfile != null) {
            userId = currentProfile.getUserId();
        } else {
            isOwner = true;
            userId = currentAccount.getUserId();
        }

        req.setAttribute("isOwner", isOwner);

        // get all information of that profile
        User user = userDAO.selectUserByUserId(userId);
        session.setAttribute("currentProfile", user);
        req.setAttribute("user", user);

        // get stuff info
        List<User> friends = friendsService.getAllFriendsByUser(user);
        req.setAttribute("friends", friends);

        // get post information (post, photos, likes, comments)
        List<BigPost> bigPosts = bigPostService.getAllBigPostsByUser(user);
        for (BigPost e :
                bigPosts) {
            Post post = postDAO.selectPostByPostId(e.getPostId());
            e.setLiked(bigPostService.isLiked(post, currentAccount));
        }
        req.setAttribute("bigPosts", bigPosts);

        RequestDispatcher dispatcher = req.getRequestDispatcher("/time-line.jsp");
        dispatcher.forward(req, resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.sendRedirect("/time-line");

    }
}

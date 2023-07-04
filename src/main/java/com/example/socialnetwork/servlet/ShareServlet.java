package com.example.socialnetwork.servlet;

import com.example.socialnetwork.dao.PostDAO;
import com.example.socialnetwork.dao.ShareDAO;
import com.example.socialnetwork.model.Account;
import com.example.socialnetwork.model.Post;
import com.example.socialnetwork.model.Share;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;

@WebServlet("/share")
public class ShareServlet extends HttpServlet {
    PostDAO postDAO = new PostDAO();
    ShareDAO shareDAO = new ShareDAO();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        Account currentAccount = (Account) session.getAttribute("currentAccount");

        // create post
        String content = req.getParameter("post-content");
        Date currentTime = Calendar.getInstance().getTime();
        Post post = new Post(0, currentAccount.getUserId(), content, currentTime);
        int postId = postDAO.insertPost(post);

        // create share
        int postSourceId = Integer.parseInt(req.getParameter("postSourceId"));
        Share share = new Share(0,postId,postSourceId);
        shareDAO.insertShare(share);

        resp.sendRedirect("/time-line");
    }
}

package com.example.socialnetwork.servlet;

import com.example.socialnetwork.dao.PostDAO;
import com.example.socialnetwork.model.Account;
import com.example.socialnetwork.model.Post;
import com.example.socialnetwork.service.LikeService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/like")
public class LikeServlet extends HttpServlet {
    PostDAO postDAO = new PostDAO();
    LikeService likeService = new LikeService();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        Account currentAccount = (Account) session.getAttribute("currentAccount");

        int postId = Integer.parseInt(req.getParameter("postId"));
        Post post = postDAO.selectPostByPostId(postId);
        String action = req.getParameter("action");
        likeService.doTogglePostLike(currentAccount, post, action);

        resp.sendRedirect("/postDetail");
    }
}

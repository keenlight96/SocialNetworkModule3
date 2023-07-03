package com.example.socialnetwork.servlet;

import com.example.socialnetwork.dao.CommentDAO;
import com.example.socialnetwork.dao.PostDAO;
import com.example.socialnetwork.dao.UserDAO;
import com.example.socialnetwork.model.*;
import com.example.socialnetwork.service.BigCommentService;
import com.example.socialnetwork.service.BigPostService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@WebServlet("/postDetail")
public class PostDetailServlet extends HttpServlet {
    PostDAO postDAO = new PostDAO();
    UserDAO userDAO = new UserDAO();
    BigPostService bigPostService = new BigPostService();
    BigCommentService bigCommentService = new BigCommentService();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        Account currentAccount = (Account) session.getAttribute("currentAccount");

        int postId;
        Post post;
        if (req.getParameter("postId") == null) {
            post = (Post) session.getAttribute("currentPost");
        } else {
            postId = Integer.parseInt(req.getParameter("postId"));
            post = postDAO.selectPostByPostId(postId);
        }

        User user = userDAO.selectUserByUserId(post.getUserId());
        BigPost bigPost = bigPostService.getBigPostByPost(post);
        bigPost.setLiked(bigPostService.isLiked(post, currentAccount));

        req.setAttribute("user", user);
        req.setAttribute("bigPost", bigPost);
//        req.setAttribute("bigComments", bigComments);

        session.setAttribute("currentPost", post);
        RequestDispatcher dispatcher = req.getRequestDispatcher("/post-detail.jsp");
        dispatcher.forward(req, resp);
    }
}

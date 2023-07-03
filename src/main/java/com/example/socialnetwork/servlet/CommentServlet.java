package com.example.socialnetwork.servlet;

import com.example.socialnetwork.dao.CommentDAO;
import com.example.socialnetwork.model.Account;
import com.example.socialnetwork.model.Comment;
import com.example.socialnetwork.model.Post;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.*;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;

@WebServlet("/comment")
public class CommentServlet extends HttpServlet {
    CommentDAO commentDAO = new CommentDAO();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        Account currentAccount = (Account) session.getAttribute("currentAccount");
        Post post = (Post) session.getAttribute("currentPost");

        Date currentTime = Calendar.getInstance().getTime();
        String content = req.getParameter("comment");
        Comment comment = new Comment(0, post.getPostId(), currentAccount.getUserId(), content, currentTime,0);
        commentDAO.insertCommentPost(comment);

        resp.sendRedirect("/postDetail");
    }
}

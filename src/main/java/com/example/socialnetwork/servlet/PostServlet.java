package com.example.socialnetwork.servlet;

import com.example.socialnetwork.dao.PhotoDAO;
import com.example.socialnetwork.dao.PostDAO;
import com.example.socialnetwork.model.Account;
import com.example.socialnetwork.model.Photo;
import com.example.socialnetwork.model.Post;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;

@WebServlet("/post")
public class PostServlet extends HttpServlet {
    PostDAO postDAO = new PostDAO();
    PhotoDAO photoDAO = new PhotoDAO();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        Account currentAccount = (Account) session.getAttribute("currentAccount");

        String content = req.getParameter("post-content");
        Date currentTime = Calendar.getInstance().getTime();
        Post post = new Post(0, currentAccount.getUserId(), content, currentTime);
        int postId = postDAO.insertPost(post);

        // post photo
        String photoSource = req.getParameter("img-src");
        if (photoSource != null) {
            Photo photo = new Photo(0, postId, photoSource);
            photoDAO.insertPhoto(photo);
        }

        resp.sendRedirect("/time-line");
    }
}

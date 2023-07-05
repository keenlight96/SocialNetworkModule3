package com.example.socialnetwork.servlet;

import com.example.socialnetwork.dao.PhotoDAO;
import com.example.socialnetwork.model.Account;
import com.example.socialnetwork.model.Photo;
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

@WebServlet("/timeline-photos")
public class TimelinePhotosServlet extends HttpServlet {
    PhotoDAO photoDAO = new PhotoDAO();
    FriendsService friendsService = new FriendsService();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        Account currentAccount = (Account) session.getAttribute("currentAccount");
        User currentProfile = (User) session.getAttribute("currentProfile");
        List<User> friends = friendsService.getAllFriendsByUser(currentProfile);
        req.setAttribute("friends", friends);
        req.setAttribute("currentAccount", currentAccount);

        List<Photo> photos = photoDAO.selectAllPhotosByUser(currentProfile);
        req.setAttribute("photos", photos);
        req.setAttribute("user", currentProfile);

        RequestDispatcher dispatcher = req.getRequestDispatcher("/timeline-photos.jsp");
        dispatcher.forward(req, resp);
    }
}

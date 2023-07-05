package com.example.socialnetwork.servlet;

import com.example.socialnetwork.dao.UserDAO;
import com.example.socialnetwork.model.Account;
import com.example.socialnetwork.model.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;


@WebServlet("/detailUpdate")
public class UpdateDetail extends HttpServlet {
    UserDAO userDAO = new UserDAO();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//       HttpSession là một phiên làm việc giữa máy chủ và người dùng, nó lưu trữ thông tin trạng thái của người dùng trong suốt phiên làm việc.
        HttpSession session = req.getSession();

        Account currentAccount = (Account) session.getAttribute("currentAccount");

//        int userID = Integer.parseInt(req.getParameter("userID"));
        if (currentAccount != null){
            session.setAttribute("currentAccount", currentAccount);
//            req.setAttribute("userID", currentAccount.getUserId());
            User user = userDAO.selectUserByUserId(currentAccount.getUserId());
            req.setAttribute("user", user);
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("/edit-profile-basic.jsp");
            requestDispatcher.forward(req, resp);
        }else {
            RequestDispatcher dispatcher = req.getRequestDispatcher("/login-register/login.jsp");
            dispatcher.forward(req, resp);
        }


    }
}
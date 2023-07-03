package com.example.socialnetwork.servlet;

import com.example.socialnetwork.dao.AccountDAO;
import com.example.socialnetwork.model.Account;
import com.example.socialnetwork.model.User;
import com.example.socialnetwork.service.DateService;
import com.example.socialnetwork.service.RegisterService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
    AccountDAO accountDAO = new AccountDAO();
    RegisterService registerService = new RegisterService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher dispatcher = req.getRequestDispatcher("/login-register/register.jsp");
        dispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String confirmPassword = req.getParameter("confirmPassword");
        String firstName = req.getParameter("firstName");
        String lastName = req.getParameter("lastName");
        String email = req.getParameter("email");
        int dayOfBirth = Integer.parseInt(req.getParameter("dayOfBirth"));
        int monthOfBirth = Integer.parseInt(req.getParameter("monthOfBirth"));
        int yearOfBirth = Integer.parseInt(req.getParameter("yearOfBirth"));
        String gender = req.getParameter("gender");
        String phoneNumber = req.getParameter("phoneNumber");
        String address = req.getParameter("address");

        if (registerService.isValidUsername(username) &&
                (registerService.isValidPassword(password, confirmPassword)) &&
                (registerService.isValidBirthday(dayOfBirth, monthOfBirth,yearOfBirth))) {
            Date birthday = DateService.convertToDate(yearOfBirth, monthOfBirth, dayOfBirth);
            Account account = new Account(0, email, username, password, "User", "Active");
            User user = new User(0, firstName, lastName, birthday,gender, email, phoneNumber, address);
            accountDAO.insertAccountAndUser(account, user);

            resp.sendRedirect("/login");
        } else {
            req.setAttribute("username",username);
            req.setAttribute("password",password);
            req.setAttribute("confirmPassword",confirmPassword);
            req.setAttribute("firstName",firstName);
            req.setAttribute("lastName",lastName);
            req.setAttribute("dayOfBirth",dayOfBirth);
            req.setAttribute("monthOfBirth",monthOfBirth);
            req.setAttribute("yearOfBirth",yearOfBirth);
            req.setAttribute("gender",gender);
            req.setAttribute("phoneNumber",phoneNumber);
            req.setAttribute("address",address);
            req.setAttribute("usernameExist", !registerService.isValidUsername(username));

            RequestDispatcher dispatcher = req.getRequestDispatcher("/login-register/register.jsp");
            dispatcher.forward(req, resp);
        }
    }
}

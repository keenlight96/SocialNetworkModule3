package com.example.socialnetwork.servlet;

import com.example.socialnetwork.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/changepassword")
public class ChangePasswordServlet extends HomeServlet{
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Lấy thông tin từ request
        int userId = Integer.parseInt(req.getParameter("userId"));
        String oldPassword = req.getParameter("oldPassword");
        String newPassword = req.getParameter("newPassword");

        // Gọi phương thức để thay đổi mật khẩu và cập nhật vào cơ sở dữ liệu
        UserService userService = new UserService();
        boolean passwordChanged = userService.changePassword(userId, oldPassword, newPassword);

        // Kiểm tra kết quả và chuyển hướng tới trang thành công hoặc thất bại
        if (passwordChanged) {
            resp.sendRedirect("/time-line"); // Chuyển hướng tới trang thành công
        } else {
            resp.sendRedirect("/error.jsp"); // Chuyển hướng tới trang thất bại
        }
    }
}

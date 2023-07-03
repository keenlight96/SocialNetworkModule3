//package com.example.socialnetwork.filter;
//
//import com.example.socialnetwork.model.Account;
//
//import javax.servlet.http.HttpFilter;
//
//import javax.servlet.FilterChain;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebFilter;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;
//import java.io.IOException;
//
//@WebFilter({"/admin", "/home", "/admin/*"})
//public class authentication extends HttpFilter {
//    @Override
//    protected void doFilter(HttpServletRequest req, HttpServletResponse res, FilterChain chain) throws IOException, ServletException {
//        HttpSession session = req.getSession();
//        Account account = (Account) session.getAttribute("currentAccount");
//        if (account != null){
//            chain.doFilter(req,res);
//            System.out.println("da dang nhap");
//        }else {
//            res.sendRedirect("/login");
//        }
//    }
//}

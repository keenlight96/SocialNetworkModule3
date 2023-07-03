package com.example.socialnetwork.service;

import com.example.socialnetwork.dao.AccountDAO;
import com.example.socialnetwork.model.Account;

public class LoginService {
    AccountDAO accountDAO = new AccountDAO();

    public Account getAccount(String email_username, String password) {
        if (email_username.contains("@")) {
            return accountDAO.selectAccount(email_username, "", password);
        } else
            return accountDAO.selectAccount("", email_username, password);
    }
}

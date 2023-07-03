package com.example.socialnetwork.service;

import com.example.socialnetwork.dao.AccountDAO;

import java.time.LocalDate;

public class RegisterService {
    AccountDAO accountDAO = new AccountDAO();
    public boolean isValidUsername(String username) {
        return accountDAO.selectUsername(username) == null;
    }

    public boolean isValidPassword(String password, String confirmPassword) {
        return password.equals(confirmPassword);
    }

    public boolean isValidBirthday(int day, int month, int year) {
        try {
            LocalDate.of(year, month, day);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

}


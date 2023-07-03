package com.example.socialnetwork.service;

import com.example.socialnetwork.dao.UserDAO;
import com.example.socialnetwork.model.Account;
import com.example.socialnetwork.model.User;

import java.util.ArrayList;
import java.util.List;

public class SearchFriendsService {
    UserDAO userDAO = new UserDAO();
    public List<User> searchFriends(Account currentAccount, String name) {
        List<User> results = new ArrayList<>();
        List<User> users = userDAO.selectAllUsers();
        for (User user :
                users) {
            if (user.getUserId() == currentAccount.getUserId())
                continue;

            boolean check = false;
            String[] firstNames = user.getFirstName().split(" ");
            String[] lastNames = user.getLastName().split(" ");
            for (String e :
                    firstNames) {
                if (e.equals(name)) {
                    results.add(user);
                    check = true;
                    break;
                }
            }

            if (!check) {
                for (String e :
                        lastNames) {
                    if (e.equals(name)) {
                        results.add(user);
                        break;
                    }
                }
            }
        }
        return results;
    }
}

package com.example.socialnetwork.service;

import com.example.socialnetwork.dao.FriendshipDAO;
import com.example.socialnetwork.dao.UserDAO;
import com.example.socialnetwork.model.Account;
import com.example.socialnetwork.model.Friendship;
import com.example.socialnetwork.model.User;

import java.util.ArrayList;
import java.util.List;

public class SearchFriendsService {
    UserDAO userDAO = new UserDAO();
    FriendshipDAO friendshipDAO = new FriendshipDAO();

    public List<User> searchFriends(Account currentAccount, String name) {
        List<User> results = new ArrayList<>();
        List<User> users = userDAO.selectAllUsers();
        for (User user :
                users) {
            if (user.getUserId() == currentAccount.getUserId())
                continue;

            getStatus(currentAccount.getUserId(), user);

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

    public void getStatus(int accountUserId, User user) {
        List<Friendship> friendships = friendshipDAO.selectAllFriendshipsByUserId(accountUserId);
        // get status
        for (Friendship friendship :
                friendships) {
            if ((((friendship.getUserId() == user.getUserId()) && (friendship.getFriendId() == accountUserId))
                    || ((friendship.getUserId() == accountUserId) && (friendship.getFriendId() == user.getUserId())))
                    && (friendship.getStatus().equals("Active"))) {
                user.setExtraField1("Active");
                break;
            } else if (((friendship.getUserId() == user.getUserId()) && (friendship.getFriendId() == accountUserId)) && friendship.getStatus().equals("Request")) {
                user.setExtraField1("GotRequest");
            } else if (((friendship.getUserId() == accountUserId) && (friendship.getFriendId() == user.getUserId())) && friendship.getStatus().equals("Request")) {
                user.setExtraField1("ToRequest");
            }
        }
    }
}

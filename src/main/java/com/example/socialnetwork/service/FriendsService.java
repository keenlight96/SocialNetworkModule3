package com.example.socialnetwork.service;

import com.example.socialnetwork.dao.FriendshipDAO;
import com.example.socialnetwork.model.Friendship;
import com.example.socialnetwork.model.User;

import java.util.List;

public class FriendsService {
    FriendshipDAO friendshipDAO = new FriendshipDAO();
    public void sendRequest (Friendship friendship) {
        friendshipDAO.insertFriendship(friendship);
    }

    public List<User> getAllFriendByUser(User user) {
        return friendshipDAO.selectAllFriendsByUser(user);
    }
}

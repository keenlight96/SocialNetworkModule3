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

    public List<User> getAllFriendsByUser(User user) {
        return friendshipDAO.selectAllFriendsByUserAndStatus(user, "Active");
    }

    public List<User> getAllFriendRequestsByUser(User user) {
        return friendshipDAO.selectAllFriendRequestsByUser(user);
    }

    public List<User> getAllRequestsSentByUser(User user) {
        return friendshipDAO.selectAllFriendsByUserAndStatus(user, "Request");
    }

    public void deleteFriendship(int userId, int friendId) {
        friendshipDAO.deleteFriendshipById(userId, friendId);
        friendshipDAO.deleteFriendshipById(friendId, userId);
    }

    public void confirmFriendship(int userId, int friendId) {
        friendshipDAO.updateStatus(friendId, userId, "Active");
        Friendship friendship = new Friendship(0, userId, friendId, "Active");
        friendshipDAO.insertFriendship(friendship);
    }
}

package com.example.socialnetwork.dao;

import com.example.socialnetwork.model.Friendship;
import com.example.socialnetwork.model.User;
import com.example.socialnetwork.service.DateService;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FriendshipDAO {
    Connection connection = ConnectMySQL.getConnection();
    public void insertFriendship(Friendship friendship) {
        String sql = "insert into Friendship(UserId, FriendId, Status) values (?,?,?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, friendship.getUserId());
            preparedStatement.setInt(2, friendship.getFriendId());
            preparedStatement.setString(3, friendship.getStatus());
            preparedStatement.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void updateStatus(int userId, int friendId, String status) {
        String sql = "update Friendship set status = ? where UserId = ? and FriendId = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, status);
            preparedStatement.setInt(2, userId);
            preparedStatement.setInt(3, friendId);
            preparedStatement.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

//    public Friendship selectFriendship(int UserId, int FriendId){
//
//    }

    public List<Friendship> selectAllFriendshipsByUserId(int _userId) {
        List<Friendship> friendships = new ArrayList<>();
        String sql = "select * from Friendship where UserId = ? or FriendId = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, _userId);
            preparedStatement.setInt(2, _userId);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                int friendshipId = resultSet.getInt("FriendshipId");
                int userId = resultSet.getInt("UserId");
                int friendId = resultSet.getInt("FriendId");
                String status = resultSet.getString("Status");
                friendships.add(new Friendship(friendshipId,  userId, friendId, status));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return friendships;
    }

    public List<User> selectAllFriendsByUserAndStatus(User user, String status) {
        List<User> friends = new ArrayList<>();
        String sql = "select User.* from Friendship join User on Friendship.FriendId = User.UserId " +
                "where Friendship.UserId = ? and Status = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, user.getUserId());
            preparedStatement.setString(2, status);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                int userid = resultSet.getInt("UserId");
                String firstName = resultSet.getString("FirstName");
                String lastName = resultSet.getString("LastName");
                Date birthday = DateService.convertDateSQLToDate(resultSet.getString("Birthday"));
                String gender = resultSet.getString("Gender");
                String email = resultSet.getString("Email");
                String phoneNumber = resultSet.getString("PhoneNumber");
                String address = resultSet.getString("Address");

                friends.add(new User(userid, firstName, lastName, birthday, gender, email, phoneNumber, address)) ;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return friends;
    }

    public List<User> selectAllFriendRequestsByUser(User user) {
        List<User> friendRequests = new ArrayList<>();
        String sql = "select User.* from Friendship join User on Friendship.UserId = User.UserId " +
                "where Friendship.FriendId = ? and Status = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, user.getUserId());
            preparedStatement.setString(2, "Request");
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                int userid = resultSet.getInt("UserId");
                String firstName = resultSet.getString("FirstName");
                String lastName = resultSet.getString("LastName");
                Date birthday = DateService.convertDateSQLToDate(resultSet.getString("Birthday"));
                String gender = resultSet.getString("Gender");
                String email = resultSet.getString("Email");
                String phoneNumber = resultSet.getString("PhoneNumber");
                String address = resultSet.getString("Address");

                friendRequests.add(new User(userid, firstName, lastName, birthday, gender, email, phoneNumber, address)) ;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return friendRequests;
    }

    public List<User> selectAllUsersNotInteracted(int userId) {
        List<User> users = new ArrayList<>();
        String sql = "select User.* from User left join Friendship on Friendship.UserId = User.UserId" +
                "where Friendship.UserId <> ? and Friendship.FriendId <> ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, userId);
            preparedStatement.setInt(2, userId);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int userid = resultSet.getInt("UserId");
                String firstName = resultSet.getString("FirstName");
                String lastName = resultSet.getString("LastName");
                Date birthday = DateService.convertDateSQLToDate(resultSet.getString("Birthday"));
                String gender = resultSet.getString("Gender");
                String email = resultSet.getString("Email");
                String phoneNumber = resultSet.getString("PhoneNumber");
                String address = resultSet.getString("Address");

                users.add(new User(userid, firstName, lastName, birthday, gender, email, phoneNumber, address)) ;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return users;
    }

    public void deleteFriendshipById(int userId, int friendId) {
        String sql = "delete from Friendship where UserId = ? and FriendId = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, userId);
            preparedStatement.setInt(2, friendId);
            preparedStatement.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

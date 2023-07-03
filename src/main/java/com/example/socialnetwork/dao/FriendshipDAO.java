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

    public void updateStatus(Friendship friendship) {
        String sql = "update Friendship set status = ? where FriendshipId = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, friendship.getStatus());
            preparedStatement.setInt(2, friendship.getFriendshipId());
            preparedStatement.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

//    public Friendship selectFriendship(int UserId, int FriendId){
//
//    }

    public List<Friendship> selectAllFriendshipByUser(User user) {
        List<Friendship> friendships = new ArrayList<>();
        String sql = "select * from Friendship where UserId = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, user.getUserId());
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

    public List<User> selectAllFriendsByUser(User user) {
        List<User> friends = new ArrayList<>();
        String sql = "select User.* from Friendship join User on Friendship.FriendId = User.UserId " +
                "where Friendship.UserId = ? and Status = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, user.getUserId());
            preparedStatement.setString(2, "Active");
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
}

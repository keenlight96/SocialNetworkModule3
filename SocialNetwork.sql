DROP DATABASE SOCIALNETWORK;
CREATE DATABASE SOCIALNETWORK;
USE SOCIALNETWORK;

CREATE TABLE Account (
	UserID int AUTO_INCREMENT PRIMARY KEY,
    Email varchar(30) NOT NULL UNIQUE,
    Username varchar(30) NOT NULL UNIQUE,
    Password varchar(50) NOT NULL UNIQUE,
    Role varchar(20), -- "User" 
    Status varchar(30) -- "Active" 
);

CREATE TABLE User (
	UserID int AUTO_INCREMENT PRIMARY KEY,
    FirstName varchar(50),
    LastName varchar(50),
    Birthday date,
    Gender varchar(10),
    Email varchar(50) NOT NULL UNIQUE,
    PhoneNumber varchar(10) NOT NULL UNIQUE,
    Address varchar(255),
    FOREIGN KEY (UserID) REFERENCES Account(UserID)
);

CREATE TABLE Friendship (
	FriendshipID int AUTO_INCREMENT PRIMARY KEY,
    UserID int NOT NULL,
    FriendID int NOT NULL,
    Status varchar(20) NOT NULL,
    FOREIGN KEY (UserID) REFERENCES User(UserID),
    FOREIGN KEY (FriendID) REFERENCES User(UserID)
);

CREATE TABLE Post (
	PostID int AUTO_INCREMENT PRIMARY KEY,
    UserID int NOT NULL,
    Content text,
    PostDate datetime,
    FOREIGN KEY (UserID) REFERENCES User(UserID)
);

CREATE TABLE Photo (
	PhotoID int AUTO_INCREMENT PRIMARY KEY,
    PostID int NOT NULL,
    PhotoSource varchar(255),
    FOREIGN KEY (PostID) REFERENCES Post(PostID)
);

CREATE TABLE Comment (
	CommentID int AUTO_INCREMENT PRIMARY KEY,
    PostID int NOT NULL,
    UserID int NOT NULL,
    Content text,
    CommentDate datetime,
    CommentSourceID int,
    FOREIGN KEY (PostID) REFERENCES Post(PostID),
    FOREIGN KEY (UserID) REFERENCES User(UserID),
    FOREIGN KEY (CommentSourceID) REFERENCES Comment(CommentID)
);

CREATE TABLE `Like` (
	LikeID int AUTO_INCREMENT PRIMARY KEY,
    PostID int,
    CommentID int,
    UserID int NOT NULL,
    FOREIGN KEY (PostID) REFERENCES Post(PostID),
    FOREIGN KEY (CommentID) REFERENCES Comment(CommentID),
    FOREIGN KEY (UserID) REFERENCES User(UserID)
);

CREATE TABLE Share (
	PostID int NOT NULL,
	UserID int NOT NULL,
    ShareDate datetime,
    FOREIGN KEY (PostID) REFERENCES Post(PostID),
    FOREIGN KEY (UserID) REFERENCES User(UserID)
);











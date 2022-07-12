package com.example.twiiterclone.twitter.User;

import com.example.twiiterclone.twitter.tweet.Tweet;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {


    @Id
    private String Username;
    private String Email;
    private String Name;

    // Should be the object Tweet instead of String type
    private String tweets;
    private String Location;
    private int followerCount;
    private int followingCount;

    // The following two should be Lists of links that follow or are being followed
    private String followers;
    private String following;


    // An empty constructor
    public User() {
    }

    // Constructor with all the class attributes
    public User(String username, String email, String name, String tweets, String location, int followerCount, int followingCount, String followers, String following) {
        Username = username;
        Email = email;
        Name = name;
        this.tweets = tweets;
        Location = location;
        this.followerCount = followerCount;
        this.followingCount = followingCount;
        this.followers = followers;
        this.following = following;
    }

    // A toString method to print the object as a string where required
    @Override
    public String toString() {
        return "User{" +
                "Username='" + Username + '\'' +
                ", Email='" + Email + '\'' +
                ", Name='" + Name + '\'' +
                ", tweets='" + tweets + '\'' +
                ", Location='" + Location + '\'' +
                ", followerCount=" + followerCount +
                ", followingCount=" + followingCount +
                ", followers='" + followers + '\'' +
                ", following='" + following + '\'' +
                '}';
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getTweets() {
        return tweets;
    }

    public void setTweets(String tweets) {
        this.tweets = tweets;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public int getFollowerCount() {
        return followerCount;
    }

    public void setFollowerCount(int followerCount) {
        this.followerCount = followerCount;
    }

    public int getFollowingCount() {
        return followingCount;
    }

    public void setFollowingCount(int followingCount) {
        this.followingCount = followingCount;
    }

    public String getFollowers() {
        return followers;
    }

    public void setFollowers(String followers) {
        this.followers = followers;
    }

    public String getFollowing() {
        return following;
    }

    public void setFollowing(String following) {
        this.following = following;
    }
}

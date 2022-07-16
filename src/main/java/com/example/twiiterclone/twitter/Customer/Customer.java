package com.example.twiiterclone.twitter.Customer;

import com.example.twiiterclone.twitter.tweet.Tweet;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Customer {


    @Id
    private String Username;
    private String Email;
    private String Name;

    // Should be the object Tweet instead of String type
    @OneToMany
    private List<Tweet> tweets;
    private String Location;
    private int followerCount;
    private int followingCount;

    // The following two should be Lists of links that follow or are being followed
    private String followers;
    private String following;


    // An empty constructor
    public Customer() {
    }

    // Constructor with all the class attributes
    public Customer(String username, String email, String name, List<Tweet> tweets, String location, int followerCount, int followingCount, String followers, String following) {
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
        return "Customer{" +
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

    public List<Tweet> getTweets() {
        return tweets;
    }

    public void setTweets(List<Tweet> tweets) {
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

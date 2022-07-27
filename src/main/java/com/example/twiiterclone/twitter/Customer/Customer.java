package com.example.twiiterclone.twitter.Customer;

import com.example.twiiterclone.twitter.comment.Comment;
import com.example.twiiterclone.twitter.tweet.Tweet;

import javax.persistence.*;
import java.util.List;

import static javax.persistence.GenerationType.SEQUENCE;

@Entity
public class Customer {


    @Id
    @SequenceGenerator(
            name = "comment_sequence",
            sequenceName = "comment_sequence"
    )
    @GeneratedValue(
            strategy = SEQUENCE,
            generator = "comment_sequence"
    )

    private String Username;
    @Column(
            columnDefinition = "TEXT",
            unique = true
    )
    private String Email;
    private String Name;

    // Should be the object Tweet instead of String type

    @ManyToOne
    private Tweet tweets;
    private String Location;
    private int followerCount;
    private int followingCount;

    // The following two should be Lists of links that follow or are being followed
    private String followers;
    private String following;

    @ManyToOne
    private Comment comments;


    // An empty constructor
    public Customer() {
    }

    // Constructor with all the class attributes
    public Customer(String username, Comment comments,String email, String name, Tweet tweets, String location, int followerCount, int followingCount, String followers, String following) {
        Username = username;
        Email = email;
        Name = name;
        this.tweets = tweets;
        Location = location;
        this.followerCount = followerCount;
        this.followingCount = followingCount;
        this.followers = followers;
        this.following = following;
        this.comments = comments;
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
                ", comments='" + comments+'\'' +
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

    public Tweet getTweets() {
        return tweets;
    }

    public void setTweets(Tweet tweets) {
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

    public Comment getComments() {
        return comments;
    }

    public void setComments(Comment comments) {
        this.comments = comments;
    }
}

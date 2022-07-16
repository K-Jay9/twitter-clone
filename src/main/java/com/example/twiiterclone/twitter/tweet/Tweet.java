package com.example.twiiterclone.twitter.tweet;


import com.example.twiiterclone.twitter.Customer.Customer;
import com.example.twiiterclone.twitter.comment.Comment;
import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

import static javax.persistence.GenerationType.*;

@Entity
public class Tweet {

    @Id
    @SequenceGenerator(
            name = "tweet_sequence",
            sequenceName = "tweet_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = SEQUENCE,
            generator = "tweet_sequence"
    )
    @Column(
            updatable = false
    )
    private Long tweet_id;
    @Column(
            nullable = false,
            columnDefinition = "DATE DEFAULT CURRENT_DATE"

    )
    private String time_posted;

    @Column(
            columnDefinition = "TEXT"
    )
    private String content;
    private int likes;

    // This should be a list of all the comments in the tweet


    private int shares;
    private int retweets;

    // This should be a link of the images uploaded to the tweet
//    private String images;


    // toString to print the object as a string during testing and debuging
    @Override
    public String toString() {
        return "Tweet{" +
                "long=" + tweet_id +
                ", time_posted=" + time_posted +
                ", content='" + content + '\'' +
                ", likes=" + likes +
                ", shares=" + shares +
                ", retweets=" + retweets + '\'' +
                '}';
    }

    public Tweet() {
    }

    public Tweet(Long tweet_id, String time_posted, String content, int likes, int shares, int retweets) {
        this.tweet_id = tweet_id;
        this.time_posted = time_posted;
        this.content = content;
        this.likes = likes;
        this.shares = shares;
        this.retweets = retweets;

    }

    public Long getLong() {
        return tweet_id;
    }

    public void setUuid(Long tweet_id) {
        this.tweet_id = tweet_id;
    }

    public String getTime_posted() {
        return time_posted;
    }

    public void setTime_posted(String time_posted) {
        this.time_posted = time_posted;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }


    public int getShares() {
        return shares;
    }

    public void setShares(int shares) {
        this.shares = shares;
    }

    public int getRetweets() {
        return retweets;
    }

    public void setRetweets(int retweets) {
        this.retweets = retweets;
    }

}

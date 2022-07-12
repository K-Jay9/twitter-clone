package com.example.twiiterclone.twitter.tweet;


import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;
import java.util.UUID;

@Entity
public class Tweet {

    @Id
    private UUID uuid;
    private LocalDate time_posted;
    private String content;
    private int likes;

    // This should be a list of all the comments in the tweet
    private int comments;

    private int shares;
    private int retweets;

    // This should be a link of the images uploaded to the tweet
    private String images;


    // toString to print the object as a string during testing and debuging
    @Override
    public String toString() {
        return "Tweet{" +
                "uuid=" + uuid +
                ", time_posted=" + time_posted +
                ", content='" + content + '\'' +
                ", likes=" + likes +
                ", comments=" + comments +
                ", shares=" + shares +
                ", retweets=" + retweets +
                ", images='" + images + '\'' +
                '}';
    }

    public Tweet() {
    }

    public Tweet(UUID uuid, LocalDate time_posted, String content, int likes, int comments, int shares, int retweets, String images) {
        this.uuid = uuid;
        this.time_posted = time_posted;
        this.content = content;
        this.likes = likes;
        this.comments = comments;
        this.shares = shares;
        this.retweets = retweets;
        this.images = images;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public LocalDate getTime_posted() {
        return time_posted;
    }

    public void setTime_posted(LocalDate time_posted) {
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

    public int getComments() {
        return comments;
    }

    public void setComments(int comments) {
        this.comments = comments;
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

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
    }
}

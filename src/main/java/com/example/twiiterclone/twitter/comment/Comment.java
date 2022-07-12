package com.example.twiiterclone.twitter.comment;


import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Entity
public class Comment {

    @Id
    private UUID uuid;
    private int likes;
    private int shares;
    private int retweets;
    private String content;
    private int commentCount;

    // should be a list of links under this comment
    private String comment;

    public Comment() {
    }

    @Override
    public String toString() {
        return "Comment{" +
                "uuid=" + uuid +
                ", likes=" + likes +
                ", shares=" + shares +
                ", retweets=" + retweets +
                ", content='" + content + '\'' +
                ", commentCount=" + commentCount +
                ", comment='" + comment + '\'' +
                '}';
    }

    public Comment(UUID uuid, int likes, int shares, int retweets, String content, int commentCount, String comment) {
        this.uuid = uuid;
        this.likes = likes;
        this.shares = shares;
        this.retweets = retweets;
        this.content = content;
        this.commentCount = commentCount;
        this.comment = comment;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(int commentCount) {
        this.commentCount = commentCount;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}

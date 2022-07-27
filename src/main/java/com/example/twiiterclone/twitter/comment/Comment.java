package com.example.twiiterclone.twitter.comment;


import javax.persistence.*;
import java.util.UUID;

import static javax.persistence.GenerationType.SEQUENCE;

@Entity
public class Comment {

    @Id
    @SequenceGenerator(
            name = "comment_sequence",
            sequenceName = "comment_sequence"
    )
    @GeneratedValue(
            strategy = SEQUENCE,
            generator = "comment_sequence"
    )
    @Column(
            updatable = false
    )
    private Long comment_id;
    private int likes;
    private int shares;
    private int retweets;
    @Column(
            columnDefinition = "TEXT"
    )
    private String content;
    private int commentCount;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    // should be a list of links under this comment
    private Comment comment;

    public Comment() {
    }

    @Override
    public String toString() {
        return "Comment{" +
                "long=" + comment_id +
                ", likes=" + likes +
                ", shares=" + shares +
                ", retweets=" + retweets +
                ", content='" + content + '\'' +
                ", commentCount=" + commentCount +
                ", comment='" + comment + '\'' +
                '}';
    }

    public Comment(Long comment_id, int likes, int shares, int retweets, String content, int commentCount, Comment comment) {
        this.comment_id = comment_id;
        this.likes = likes;
        this.shares = shares;
        this.retweets = retweets;
        this.content = content;
        this.commentCount = commentCount;
        this.comment = comment;
    }

    public Long getUuid() {
        return comment_id;
    }

    public void setUuid(Long comment_id) {
        this.comment_id = comment_id;
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

    public Comment getComment() {
        return comment;
    }

    public void setComment(Comment comment) {
        this.comment = comment;
    }
}

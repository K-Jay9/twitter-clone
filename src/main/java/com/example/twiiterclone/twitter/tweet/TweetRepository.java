package com.example.twiiterclone.twitter.tweet;

import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface TweetRepository extends JpaRepository<Tweet, Long> {

    @Override
    List<Tweet> findAllById(Iterable<Long> longs);

    List<Tweet> findTweetByTime_posted (Iterable<String> String);
}

package com.example.twiiterclone.twitter.User;

import org.springframework.data.jpa.repository.JpaRepository;

interface  UserRepository extends JpaRepository<User, String> {
}

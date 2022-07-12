package com.example.twiiterclone.twitter.User;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {


    private final UserRepository repository;

    public UserController(UserRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/home")
    public String hello(){
        System.out.println("startd ...");
        return "Hello World";
    }
}

package com.example.twiiterclone.twitter.Customer;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {


    private final CustomerRepository repository;

    public CustomerController(CustomerRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/home")
    public String hello(){
        System.out.println("startd ...");
        return "Hello World";
    }
}

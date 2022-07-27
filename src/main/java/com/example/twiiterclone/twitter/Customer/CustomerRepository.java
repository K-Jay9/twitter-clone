package com.example.twiiterclone.twitter.Customer;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

interface  CustomerRepository extends JpaRepository<Customer, String> {

    @Override
    List<Customer> findAllById(Iterable<String> strings);
}

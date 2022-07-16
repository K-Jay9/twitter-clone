package com.example.twiiterclone.twitter.Customer;

import org.springframework.data.jpa.repository.JpaRepository;

interface  CustomerRepository extends JpaRepository<Customer, String> {
}

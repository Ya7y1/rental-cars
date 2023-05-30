package com.example.demo.Repositories;

import com.example.demo.Models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository< Customer ,Long> {
}

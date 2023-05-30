package com.example.demo.Services;


import com.example.demo.Models.Category;
import com.example.demo.Models.Customer;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CustomerService {
    Customer SaveCustomer(Customer customer );
    Customer UpdateCustomer (Customer customer);
    Customer getCustomer(Long id);
    List<Customer> getAllCustomer();
    void DeleteCustomer(Long id);
    void DeleteAllCustomer();
}

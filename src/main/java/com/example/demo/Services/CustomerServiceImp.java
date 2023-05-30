package com.example.demo.Services;


import com.example.demo.Models.Customer;
import com.example.demo.Repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImp implements CustomerService{
    @Autowired
    CustomerRepository customerRepositorie;
    @Override
    public Customer SaveCustomer(Customer customer) {
        return customerRepositorie.save(customer);
    }

    @Override
    public Customer UpdateCustomer(Customer customer) {
        return customerRepositorie.save(customer);
    }

    @Override
    public Customer getCustomer(Long id) {
        return customerRepositorie.findById(id).get();
    }

    @Override
    public List<Customer> getAllCustomer() {
        return customerRepositorie.findAll();
    }

    @Override
    public void DeleteCustomer(Long id) {


    }

    @Override
    public void DeleteAllCustomer() {

    }
}

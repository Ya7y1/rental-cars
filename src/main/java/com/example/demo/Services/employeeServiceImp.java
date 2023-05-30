package com.example.demo.Services;

import com.example.demo.Models.employee;
import com.example.demo.Repositories.employeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class employeeServiceImp implements employeeservice{

    @Autowired
    employeeRepository employeeRepository;


    @Override
    public employee Saveemployee(employee employee) {

           return employeeRepository.save(employee);
        }


    @Override
    public employee Updateemployee(employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public employee getemployee(Long id) {
        return employeeRepository.findById(id).get();
    }

    @Override
    public List<employee> getAllemployee() {
        return employeeRepository.findAll();
    }

    @Override
    public void Deleteemployee(Long id) {
        employeeRepository.deleteById(id);

    }

    @Override
    public void DeleteAllemployee() {
        employeeRepository.deleteAll();

    }
}


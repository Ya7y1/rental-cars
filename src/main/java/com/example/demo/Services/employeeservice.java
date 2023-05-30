package com.example.demo.Services;

import com.example.demo.Models.employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface employeeservice {
   employee Saveemployee(employee employee);
    employee Updateemployee (employee employee);
    employee getemployee(Long id);
    List<employee> getAllemployee();
    void Deleteemployee(Long id);
    void DeleteAllemployee();
}

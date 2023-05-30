package com.example.demo.Repositories;

import com.example.demo.Models.employee;
import org.springframework.data.jpa.repository.JpaRepository;
public interface employeeRepository extends JpaRepository <employee,Long> {
}

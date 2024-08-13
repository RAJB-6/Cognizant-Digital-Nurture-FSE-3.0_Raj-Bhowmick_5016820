package com.example.EmployeeManagementSystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.EmployeeManagementSystem.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

    List<Employee> findByEmail(String email);

}

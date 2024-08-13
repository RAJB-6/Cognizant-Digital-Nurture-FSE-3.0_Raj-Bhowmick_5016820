package com.example.EmployeeManagementSystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.EmployeeManagementSystem.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

    @Query(name = "Employee.findByEmail")
    List<Employee> findByEmail(@Param("email")String email);

}

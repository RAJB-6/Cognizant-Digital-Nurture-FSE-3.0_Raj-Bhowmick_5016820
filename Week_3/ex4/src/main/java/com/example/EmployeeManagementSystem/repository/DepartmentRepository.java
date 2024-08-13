package com.example.EmployeeManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.EmployeeManagementSystem.entities.Department;

public interface DepartmentRepository extends JpaRepository<Department, Integer>{

    String findById(int id);

    
}

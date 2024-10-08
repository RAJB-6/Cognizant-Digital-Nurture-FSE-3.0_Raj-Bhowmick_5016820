package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Department;

public interface DepartmentRepository extends JpaRepository<Department, Integer>{

    String findById(int id);

}

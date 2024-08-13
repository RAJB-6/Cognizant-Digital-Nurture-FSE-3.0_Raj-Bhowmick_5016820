package com.example.EmployeeManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.EmployeeManagementSystem.entities.Department;

public interface DepartmentRepository extends JpaRepository<Department, Integer>{

    @Query(name = "Department.GetIdByName")
    int GetIdByName(@Param("name")String name);
 
}

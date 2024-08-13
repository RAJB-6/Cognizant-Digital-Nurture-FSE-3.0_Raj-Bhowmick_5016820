package com.example.EmployeeManagementSystem.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.EmployeeManagementSystem.entities.Department;
import com.example.EmployeeManagementSystem.repository.DepartmentRepository;

@RestController
public class DepartmentController {
    @Autowired
    private DepartmentRepository departmentRepository;

    @GetMapping("Department")
    public List<Department> getAllDepartments() {
        return departmentRepository.findAll();
    }

    @PostMapping
    public Department createDepartment(@RequestBody Department department) {
        return departmentRepository.save(department);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Department> updateDepartment(@PathVariable Integer id, @RequestBody Department departmentDetails) {
        return departmentRepository.findById(id)
            .map(department -> {
                department.setName(departmentDetails.getName());
                return ResponseEntity.ok(departmentRepository.save(department));
            })
            .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteDepartment(@PathVariable Integer id) {
        return departmentRepository.findById(id)
            .map(department -> {
                departmentRepository.delete(department);
                return ResponseEntity.ok().build();
            })
            .orElse(ResponseEntity.notFound().build());
    }
}
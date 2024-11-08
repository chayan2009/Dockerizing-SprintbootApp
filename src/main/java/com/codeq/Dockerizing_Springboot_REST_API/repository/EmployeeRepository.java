package com.codeq.Dockerizing_Springboot_REST_API.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codeq.Dockerizing_Springboot_REST_API.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    
}

package com.codeq.Dockerizing_Springboot_REST_API.service;

import java.util.List;

import com.codeq.Dockerizing_Springboot_REST_API.entity.Employee;

public interface EmployeeService {
    List<Employee> getAllEmployees();
    Employee createEmployee(Employee employee);
    Employee getEmployeeById(Long id);
    Employee updateEmployee(Long id, Employee employeeDetails);
    void deleteEmployee(Long id);
}


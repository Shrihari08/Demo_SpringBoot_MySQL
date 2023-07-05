package com.example.demo.service;

import com.example.demo.model.EmployeeDetails;

import java.util.List;

public interface EmployeeService {

    EmployeeDetails findByEmployeeFirstName(String firstName);

    List<EmployeeDetails> getAllEmployees();

    String createEmployee(EmployeeDetails employeeDetails);

}

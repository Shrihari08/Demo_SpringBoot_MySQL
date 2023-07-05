package com.example.demo.service.impl;

import com.example.demo.model.EmployeeDetails;
import com.example.demo.repository.EmployeeRepository;
import com.example.demo.service.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public EmployeeDetails findByEmployeeFirstName(String firstName) {
        if (firstName != null) {
            return employeeRepository.findByFirstName(firstName);
        }
        return null;
    }

    @Override
    public List<EmployeeDetails> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public String createEmployee(EmployeeDetails employeeDetails) {
        if (employeeDetails != null) {
            employeeRepository.save(employeeDetails);
        }
        return "Employee Created Successfully";
    }
}

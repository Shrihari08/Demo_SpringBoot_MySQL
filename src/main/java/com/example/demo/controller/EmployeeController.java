package com.example.demo.controller;

import com.example.demo.model.EmployeeDetails;
import com.example.demo.service.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping(value = "/{firstName}")
    public ResponseEntity<EmployeeDetails> getEmployeeDetailsByFirstName(@PathVariable String firstName) {
        EmployeeDetails employeeDetails = employeeService.findByEmployeeFirstName(firstName);
        return new ResponseEntity<>(employeeDetails, HttpStatus.OK);
    }

    @GetMapping(value = "/employees")
    public ResponseEntity<List<EmployeeDetails>> getAllEmployeeDetails() {
        List<EmployeeDetails> employeeDetailsList = employeeService.getAllEmployees();
        return new ResponseEntity<>(employeeDetailsList, HttpStatus.OK);
    }

    @PostMapping(value = "/employee")
    public ResponseEntity<String> createEmployee(@RequestBody EmployeeDetails employeeDetails) {
        String createEmployee = employeeService.createEmployee(employeeDetails);
        return new ResponseEntity<>(createEmployee, HttpStatus.CREATED);
    }

}

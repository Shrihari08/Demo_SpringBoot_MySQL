package com.example.demo.controller;

import com.example.demo.model.StudentDetails;
import com.example.demo.service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping(value = "/{lastName}")
    public ResponseEntity<StudentDetails> getStudentDetailsByLastName(@PathVariable String lastName) {
        StudentDetails studentDetails = studentService.findByStudentLastName(lastName);
        return new ResponseEntity<>(studentDetails, HttpStatus.OK);
    }

    @GetMapping(value = "/students")
    public ResponseEntity<List<StudentDetails>> getAllStudentDetails() {
        List<StudentDetails> studentDetailsList = studentService.getAllStudents();
        return new ResponseEntity<>(studentDetailsList, HttpStatus.OK);
    }

    @PostMapping(value = "/student")
    public ResponseEntity<String> createStudent(@RequestBody StudentDetails studentDetails) {
        String createStudent = studentService.createStudent(studentDetails);
        return new ResponseEntity<>(createStudent, HttpStatus.CREATED);
    }

}

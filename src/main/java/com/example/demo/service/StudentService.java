package com.example.demo.service;

import com.example.demo.model.StudentDetails;

import java.util.List;

public interface StudentService {

    StudentDetails findByStudentLastName(String lastName);

    List<StudentDetails> getAllStudents();

    String createStudent(StudentDetails studentDetails);

}

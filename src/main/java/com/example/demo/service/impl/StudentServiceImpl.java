package com.example.demo.service.impl;


import com.example.demo.model.StudentDetails;
import com.example.demo.repository.StudentRepository;
import com.example.demo.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public StudentDetails findByStudentLastName(String lastName) {
        if (lastName != null) {
            return studentRepository.findByLastName(lastName);
        }
        return null;
    }

    @Override
    public List<StudentDetails> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public String createStudent(StudentDetails studentDetails) {
        if (studentDetails != null) {
            studentRepository.save(studentDetails);
        }
        return "Student Created Successfully";
    }
}

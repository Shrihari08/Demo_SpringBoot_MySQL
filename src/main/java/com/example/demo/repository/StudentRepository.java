package com.example.demo.repository;


import com.example.demo.model.StudentDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<StudentDetails, Long> {

    StudentDetails findByLastName(String lastName);

}

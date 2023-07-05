package com.example.demo.repository;

import com.example.demo.model.EmployeeDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeDetails, Long> {

    EmployeeDetails findByFirstName(String firstName);

}

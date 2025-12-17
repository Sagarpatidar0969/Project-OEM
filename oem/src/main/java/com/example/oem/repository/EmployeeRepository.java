package com.example.oem.repository;

import com.example.oem.model.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee, String> {

    // Find employee by email (used for uniqueness validation)
    Optional<Employee> findByEmail(String email);

    // Find by department (example business query)
    Optional<Employee> findByDepartment(String department);

    // Check if email already exists (industry standard)
    boolean existsByEmail(String email);
}

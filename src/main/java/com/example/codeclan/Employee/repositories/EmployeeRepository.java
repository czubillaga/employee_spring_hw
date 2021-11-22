package com.example.codeclan.Employee.repositories;

import com.example.codeclan.Employee.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}

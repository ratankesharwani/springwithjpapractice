package com.rajan.springwithjpapractice.employee.repository;

import com.rajan.springwithjpapractice.employee.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}

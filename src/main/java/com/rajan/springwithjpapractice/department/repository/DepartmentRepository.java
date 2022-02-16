package com.rajan.springwithjpapractice.department.repository;

import com.rajan.springwithjpapractice.department.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department,Long> {
}

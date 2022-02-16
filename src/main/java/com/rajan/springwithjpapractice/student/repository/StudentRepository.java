package com.rajan.springwithjpapractice.student.repository;

import com.rajan.springwithjpapractice.student.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {
}

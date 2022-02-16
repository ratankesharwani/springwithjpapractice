package com.rajan.springwithjpapractice.student.model;

import com.rajan.springwithjpapractice.department.model.DepartmentType;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String firstName;

    @Column
    private String middleName;

    @Column
    private String lastName;

    @Column
    private DepartmentType departmentType;
}

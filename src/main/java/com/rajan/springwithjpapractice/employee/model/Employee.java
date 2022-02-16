package com.rajan.springwithjpapractice.employee.model;

import com.rajan.springwithjpapractice.department.model.DepartmentType;
import com.rajan.springwithjpapractice.subject.model.Subject;
import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private EmployeeType type;

    @Column
    private String firstName;

    @Column
    private String middleName;

    @Column
    private String lastName;

    @Column
    private DepartmentType departmentType;

    @ManyToMany(targetEntity = Subject.class, fetch = FetchType.LAZY)
    private Set<Subject> subjects = new HashSet<>();
}

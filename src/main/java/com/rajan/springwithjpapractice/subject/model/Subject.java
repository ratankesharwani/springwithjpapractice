package com.rajan.springwithjpapractice.subject.model;

import com.rajan.springwithjpapractice.employee.model.Employee;
import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
public class Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String name;

    @Column
    private String code;

    @ManyToMany(targetEntity = Employee.class, fetch = FetchType.LAZY)
    private Set<Employee> professors = new HashSet<>();

}

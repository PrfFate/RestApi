package com.aliacar.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.aliacar.model.Employee;


@Repository
public class EmployeeRepository {

    @Autowired
    private List<Employee> employeeList;
    
    public List<Employee> getAllEmployeeList() {
        return employeeList;
    
}
}

package com.aliacar.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aliacar.model.Employee;
import com.aliacar.repository.EmployeeRepository;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;
    
    public List<Employee> getAllEmployeeList(){
        return employeeRepository.getAllEmployeeList();
    }
}

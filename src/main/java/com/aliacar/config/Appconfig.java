package com.aliacar.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.aliacar.model.Employee;

@Configuration
public class Appconfig {

    @Bean 
    public List<Employee> employeeList(){
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("1","Ali","Acar"));
        employeeList.add(new Employee("2","Enes","Bayram"));
        employeeList.add(new Employee("3","Fatmanur","Gözkapan"));
        employeeList.add(new Employee("4","Hüseyin","Deniz"));
        employeeList.add(new Employee("5","Cemil","Ata"));

        return employeeList;
    }

    
}

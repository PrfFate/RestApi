package com.aliacar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.aliacar.model.Employee;
import com.aliacar.model.UpdateEmployeeRequest;
import com.aliacar.services.EmployeeService;



@RestController
@RequestMapping("/rest/api/employee")
public class RestEmployeeController {

    @Autowired
    private EmployeeService employeeService;
    
    @GetMapping(path= "/list")
    public List<Employee> getAllEmployeeList(){
        return employeeService.getAllEmployeeList();
        
    }
    
   
    @GetMapping(path = "/list/{id}")
    public Employee getEmployeeById(@PathVariable(name ="id",required = true)String id){
        return employeeService.getEmployeeById(id);
    }

    @GetMapping(path = "/with-params")
    public List<Employee> getEmployeeWithParams(@RequestParam(name="firstName",required = false)String firstName,
                                                @RequestParam(name="lastName",required = false)String lastName){    
        return employeeService.getEmployeeWithParams(firstName, lastName);
    }

    @PostMapping(path = "/save-employee")
    public Employee savEmployee(@RequestBody Employee newEmployee){
        return employeeService.saveEmployee(newEmployee);
    }
    @DeleteMapping(path = "/delete-employee/{id}")
    public boolean deleteEmployee(@PathVariable(name="id")String id){
        return employeeService.deleteEmployee(id);

    }
    @PutMapping(path = "/uptade-employee/{id}")
    public Employee uptadeEmployee(@PathVariable(name = "id")String id,@RequestBody UpdateEmployeeRequest request){
       
        return employeeService.uptadeEmployee(id, request);
    }









}

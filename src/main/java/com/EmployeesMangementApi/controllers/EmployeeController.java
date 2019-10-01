package com.EmployeesMangementApi.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.EmployeesMangementApi.Entities.Employee;
import com.EmployeesMangementApi.Repositories.EmployeeRepository;


@RestController

public class EmployeeController {
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	
	
	@RequestMapping("/employees")
	public   List<Employee> getEmployees(){
		
		
		return employeeRepository.findAll();
	}
	
	@RequestMapping("/employees/{id}")
	public Optional<Employee> getEmployeeById(@PathVariable  String id){
		return employeeRepository.findById(Integer.parseInt(id));
		
	}
	
	@RequestMapping(method = RequestMethod.POST, value="/employees")
	public void addEmployee(@RequestBody Employee employee) {
		employeeRepository.save(employee);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value="/employees")
	public void updateEmployee(@RequestBody Employee employee) {
		employeeRepository.save(employee);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value="/employees/{id}")
	public void deleteEmployee(@PathVariable  String id) {
		employeeRepository.deleteById(Integer.parseInt(id));
	}

}

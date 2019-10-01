package com.EmployeesMangementApi.controllers;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.EmployeesMangementApi.Entities.Departement;
import com.EmployeesMangementApi.Repositories.DepartementRepository;



@RestController

public class DepartementController {
	
	@Autowired
	DepartementRepository departementRepository;
	
	
	
	@RequestMapping("/departements")
	public List<Departement> getDepartement(){
		return departementRepository.findAll();
	}
	
	@RequestMapping("/departements/{id}")
	public Optional<Departement> getDepartementById(@PathVariable  String id){
		return departementRepository.findById(Integer.parseInt(id));
		
	}
	
	@RequestMapping(method = RequestMethod.POST, value="/departements")
	public void addDepartement(@RequestBody Departement departement) {
		departementRepository.save(departement);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value="/departements")
	public void updateDepartement(@RequestBody Departement departement) {
		departementRepository.save(departement);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value="/departements/{id}")
	public void deleteDepartement(@PathVariable  String id) {
		departementRepository.deleteById(Integer.parseInt(id));
	}

}

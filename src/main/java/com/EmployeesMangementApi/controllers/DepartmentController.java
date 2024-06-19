package com.EmployeesMangementApi.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.EmployeesMangementApi.Entities.Department;
import com.EmployeesMangementApi.Exception.DeptNotFoundException;
import com.EmployeesMangementApi.Repositories.DepartmentRepository;


@RestController
public class DepartmentController {

    @Autowired
    DepartmentRepository departmentRepository;

    @RequestMapping("/departments")
    public List<Department> getDepartments() {
        return departmentRepository.findAll();
    }

    @RequestMapping("/departments/{id}")
    public Optional<Department> getDepartmentById(@PathVariable String id) throws DeptNotFoundException {
        if (!departmentRepository.existsById(Integer.parseInt(id)))
            throw new DeptNotFoundException();
        else
            return departmentRepository.findById(Integer.parseInt(id));

    }

    @RequestMapping(method = RequestMethod.POST, value = "/departments")
    public void addDepartment(@RequestBody Department department) {
        departmentRepository.save(department);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/departments")
    public void updateDepartment(@RequestBody Department department) {
        departmentRepository.save(department);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/departments/{id}")
    public void deleteDepartment(@PathVariable String id) {
        departmentRepository.deleteById(Integer.parseInt(id));
    }

}

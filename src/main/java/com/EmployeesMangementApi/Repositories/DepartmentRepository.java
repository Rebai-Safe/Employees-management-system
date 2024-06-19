package com.EmployeesMangementApi.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.EmployeesMangementApi.Entities.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department,Integer> {

}

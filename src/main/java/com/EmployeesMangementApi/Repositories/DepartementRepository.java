package com.EmployeesMangementApi.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.EmployeesMangementApi.Entities.Departement;

public interface DepartementRepository extends JpaRepository<Departement,Integer> {

}

package com.EmployeesMangementApi.Entities;

import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import javax.persistence.Table;

@Entity
@Table(name="EMP")

public class Employee {
	
	@Id
	int EMPNO;
	@Column
	String ENAME;
	@Column
	String JOB;
	
	//Reflexive relation
	@ManyToOne
	@JoinColumn(name = "MGR")
	Employee MGR;
	@Column
	Date HIREDATE	;
	@Column
	Double SAL	;
	@Column
	Double COMM	;
	
	
	
	@ManyToOne
	@JoinColumn(name = "DEPTNO" )
    Departement departement	;
	
	@OneToMany(mappedBy = "MGR", cascade = CascadeType.ALL)
    private List<Employee> employee;
	
	//constructors
	
	
	
	public Employee(int eMPNO, String eNAME, String jOB, Employee mGR, Date hIREDATE, Double sAL, Double cOMM,
			 Departement dEPARTEMENT) {
		
		EMPNO = eMPNO;
		ENAME = eNAME;
		JOB = jOB;
		MGR = mGR;
		HIREDATE = hIREDATE;
		SAL = sAL;
		COMM = cOMM;
		departement= dEPARTEMENT;
	}

  
	public Employee() {
		super();
		
	}




	

}

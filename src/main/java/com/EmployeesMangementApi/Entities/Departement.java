package com.EmployeesMangementApi.Entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="DEPT")
public class Departement {
	
	@Id
	@Column(name = "DEPTNO")
	int DEPTNO	;
	String DNAME;	
	String LOC	;
	
	@OneToMany(mappedBy = "departement", cascade = CascadeType.ALL)
    private List<Employee> employee;
	
	
	//constructor
	
	
	public Departement(int dEPTNO, String dNAME, String lOC) {
		
		DEPTNO = dEPTNO;
		DNAME = dNAME;
		LOC = lOC;
	}
	
	public Departement() {
		
	}

	//getters && setters
	public int getDEPTNO() {
		return DEPTNO;
	}
	public void setDEPTNO(int dEPTNO) {
		DEPTNO = dEPTNO;
	}
	public String getDNAME() {
		return DNAME;
	}
	public void setDNAME(String dNAME) {
		DNAME = dNAME;
	}
	public String getLOC() {
		return LOC;
	}
	public void setLOC(String lOC) {
		LOC = lOC;
	}

	
	
}

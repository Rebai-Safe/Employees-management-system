package com.EmployeesMangementApi.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.EmployeesMangementApi.Exception.DeptNotFoundException;

/* to have all exception handlers in a single class instead of annotating multiple ones with @ControllerAdvice. */ 

@ControllerAdvice 
public class GlobalExceptionHandler {

	@ExceptionHandler()
	public ResponseEntity<Object> deptNotFoundExceptionHandler(DeptNotFoundException e) {
		 return new ResponseEntity<>("Departement Not Found",HttpStatus.NOT_FOUND);
	}
	
	
}

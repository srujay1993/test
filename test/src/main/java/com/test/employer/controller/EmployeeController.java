package com.test.employer.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.employer.entity.EmployerEntity;

@RestController

public class EmployeeController {
@GetMapping("/getTestData")
	public String getTestData() {
		return "getTestData";
	}

@GetMapping("/getAllEmployees")
public List<EmployerEntity> getAllEmployees(){ 
	EmployeeController emp1 = new EmployeeController(); 
	List<EmployerEntity> emplist = new ArrayList<EmployerEntity>();

	return emplist;
}
	
}

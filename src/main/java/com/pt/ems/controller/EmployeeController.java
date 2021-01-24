package com.pt.ems.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pt.ems.entity.Employee;
import com.pt.ems.service.EmployeeService;

@RestController
@RequestMapping("/employee/api")
public class EmployeeController {
	@Autowired
	EmployeeService employeeService;

	@GetMapping(value = "/getEmpBydeptId/{deptId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Employee> getEmpBydeptId(@PathVariable long deptId) {
		return employeeService.findByDeptId(deptId);

	}
	
	@PostMapping(value="/saveEmp",consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE )
	public Employee saveEmp(@RequestBody Employee e) {
		e=employeeService.saveEmployee(e);
		return e;
		
	}

}

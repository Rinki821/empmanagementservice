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

import com.pt.ems.entity.Department;
import com.pt.ems.service.DepartmentService;

@RestController
@RequestMapping("/department/api")
public class DepartmentController {
	@Autowired
	DepartmentService departmentService;

	@GetMapping(value = "/getDeptByOrgId/{orgId}")
	public List<Department> getDeptByOrgId(@PathVariable long orgId) {
		return departmentService.findByOrgId(orgId);

	}

	@PostMapping(value = "/saveDept", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Department saveDept(@RequestBody Department d) {
		d = departmentService.saveDept(d);
		return d;

	}
}

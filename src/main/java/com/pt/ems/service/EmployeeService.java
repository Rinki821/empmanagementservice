package com.pt.ems.service;

import java.util.List;

import com.pt.ems.entity.Employee;

public interface EmployeeService {

	List<Employee> findByDeptId(long deptId);
	Employee saveEmployee(Employee e);
}

package com.pt.ems.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pt.ems.entity.Employee;
import com.pt.ems.repository.EmployeeRepository;
@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public List<Employee> findByDeptId(long deptId) {
		return employeeRepository.findByDeptId(deptId);

	}

	@Override
	public Employee saveEmployee(Employee e) {
		e=employeeRepository.save(e);
		return e;
	}

}

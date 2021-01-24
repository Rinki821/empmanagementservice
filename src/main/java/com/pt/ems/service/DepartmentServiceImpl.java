package com.pt.ems.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pt.ems.entity.Department;
import com.pt.ems.repository.DepartmentRepository;
@Service
public class DepartmentServiceImpl implements DepartmentService {
	@Autowired
	DepartmentRepository departmentRepository;

	@Override
	public List<Department> findByOrgId(long orgId) {
		return departmentRepository.findByOrgId(orgId);
	}

	@Override
	public Department saveDept(Department d) {
		d=departmentRepository.save(d);
		return d;
	}

}

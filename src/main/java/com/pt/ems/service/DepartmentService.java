package com.pt.ems.service;

import java.util.List;

import com.pt.ems.entity.Department;

public interface DepartmentService {
	
	List<Department> findByOrgId(long orgId);
	Department saveDept(Department d);

}

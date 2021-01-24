package com.pt.ems.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.pt.ems.entity.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

	@Query("select d from Department d where d.orgId=:orgId")
	List<Department> findByOrgId(long orgId);
	

}

package com.pt.ems.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pt.ems.entity.Organization;
@Repository
public interface OrganizationRepository extends JpaRepository<Organization, Long>{

}

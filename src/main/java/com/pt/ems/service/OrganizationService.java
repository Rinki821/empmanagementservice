package com.pt.ems.service;

import java.util.List;

import com.pt.ems.entity.Organization;

public interface OrganizationService {

	List<Organization> findAll();
	Organization saveOrg(Organization o);
}

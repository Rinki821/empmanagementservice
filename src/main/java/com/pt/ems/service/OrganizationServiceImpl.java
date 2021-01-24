package com.pt.ems.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pt.ems.entity.Organization;
import com.pt.ems.repository.OrganizationRepository;
@Service
public class OrganizationServiceImpl implements OrganizationService {
	@Autowired
	OrganizationRepository organizationRepository;

	@Override
	public List<Organization> findAll() {
		return organizationRepository.findAll();
	}

	@Override
	public Organization saveOrg(Organization o) {
	o=organizationRepository.save(o);
	return o;
		
	}

}

package com.pt.ems.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pt.ems.entity.Organization;
import com.pt.ems.service.OrganizationService;

@RestController
@RequestMapping("/organization/api")
public class OrganizationController {

	@Autowired
	OrganizationService organizationService;

	@GetMapping(value = "/getAllOrg", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Organization> getAllOrg() {
		return organizationService.findAll();

	}

	@PostMapping(value = "/saveOrg", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Organization saveOrg(@RequestBody Organization o) {
		return organizationService.saveOrg(o);

	}

}

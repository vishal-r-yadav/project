package com.cg.healthinsurance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.healthinsurance.entities.Policy;
import com.cg.healthinsurance.service.PolicyService;

@RestController
@RequestMapping("/policy")
public class Policycontroller {
	
	@Autowired
	private PolicyService policyService;
	
	@GetMapping("/get/{id}")
	public ResponseEntity<Object> fetchAccountDetails(@PathVariable("id") int id) {

	Policy policy = policyService.findPolicyById(id);
		return new ResponseEntity<>(policy, HttpStatus.OK);

	}
	

}

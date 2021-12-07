package com.cg.healthinsurance.sprintproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.healthinsurance.sprintproject.entities.Policy;
import com.cg.healthinsurance.sprintproject.exception.PolicyNotFoundException;
import com.cg.healthinsurance.sprintproject.service.PolicyService;

@RestController
@RequestMapping("/healthinsurance-policy")
public class PolicyController {
	
	@Autowired
	private PolicyService policyService;
	
	@PostMapping("/createpolicy")
	public Policy addPolicy(@RequestBody Policy policy) {
		return policyService.addPolicy(policy);
	}
	
	@PutMapping("/updatepolicy")
	public Policy updatePolicy(@RequestBody Policy policy) throws PolicyNotFoundException {
		return policyService.updatePolicy(policy);
	}
	
	@GetMapping("/policy/{policyId}")
	public Policy findPolicyById(@PathVariable int policyId) throws PolicyNotFoundException {
		return policyService.findPolicyById(policyId);
	}
	
	@DeleteMapping("/deletepolicy/{policyId}")
	public Policy removePolicy(@PathVariable int policyId) throws PolicyNotFoundException {
		return policyService.removePolicy(policyId);
	}
	
	@GetMapping("/policy/all")
	public List<Policy> showAllPolicies() {
		return policyService.showAllPolicies();
	}
	

}

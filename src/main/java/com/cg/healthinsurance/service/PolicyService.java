package com.cg.healthinsurance.service;

import java.util.List;

import com.cg.healthinsurance.entities.Policy;
import com.cg.healthinsurance.exception.PolicyNotFoundException;

public interface PolicyService {
	
	
	public Policy addPolicy(Policy policy);
	
	public Policy updatePolicy(Policy policy)throws PolicyNotFoundException;
	
	public Policy findPolicyById(int policyId)throws PolicyNotFoundException;
	
	public Policy removePolicy(int policyId) throws PolicyNotFoundException;
	
	public List<Policy> showAllPolicies();
}
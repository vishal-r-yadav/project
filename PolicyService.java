package com.abchealthinsurance.service;

import java.util.List;

import com.abchealthinsurance.entity.Policy;
import com.abchealthinsurance.exceptions.PolicyNotFoundException;

public interface PolicyService {
	
	
	public Policy addPolicy(Policy policy);
	
	public Policy updatePolicy(Policy policy)throws PolicyNotFoundException;
	
	public Policy findPolicyById(int policyId)throws PolicyNotFoundException;
	
	public Policy removePolicy(int policyId) throws PolicyNotFoundException;
	
	public List<Policy> showAllPolicies();
}

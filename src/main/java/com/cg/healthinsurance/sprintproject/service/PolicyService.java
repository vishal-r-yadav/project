package com.cg.healthinsurance.sprintproject.service;

import java.util.List;

import com.cg.healthinsurance.sprintproject.entities.Policy;
import com.cg.healthinsurance.sprintproject.exception.PolicyNotFoundException;

/**
 * @author vishal
 *
 */



public interface PolicyService {
	
	
	/**
	 * @param policy
	 * @return
	 */
	public Policy addPolicy(Policy policy);
	
	public Policy updatePolicy(Policy policy)throws PolicyNotFoundException;
	
	public Policy findPolicyById(int policyId)throws PolicyNotFoundException;
	
	public Policy removePolicy(int policyId) throws PolicyNotFoundException;
	
	public List<Policy> showAllPolicies();
	
}
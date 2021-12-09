package com.cg.healthinsurance.sprintproject.service;

import java.util.List;

import com.cg.healthinsurance.sprintproject.entities.Policy;
import com.cg.healthinsurance.sprintproject.exception.PolicyNotFoundException;



/**
 * @author Vishal
 *
 */
public interface PolicyService {
	
	
	/**This method helps us to add new policy
	 * @param policy
	 * @return policy
	 */
	public Policy addPolicy(Policy policy);
	
	/**This method helps us to update any policy
	 * @param policy
	 * @return policy
	 * @throws PolicyNotFoundException
	 */
	public Policy updatePolicy(Policy policy)throws PolicyNotFoundException;
	
	/**
	 * @param policyId
	 * @return policy
	 * @throws PolicyNotFoundException
	 */
	public Policy findPolicyById(int policyId)throws PolicyNotFoundException;
	
	/**This method helps us to remove policy
	 * @param policyId
	 * @return policy
	 * @throws PolicyNotFoundException
	 */
	public Policy removePolicy(int policyId) throws PolicyNotFoundException;
	
	/**This method helps us to view all policy
	 * @return list of all policies
	 */
	public List<Policy> showAllPolicies();
	
}
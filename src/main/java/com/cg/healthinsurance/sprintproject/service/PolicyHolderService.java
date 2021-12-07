package com.cg.healthinsurance.sprintproject.service;

import java.util.List;

import com.cg.healthinsurance.sprintproject.entities.PolicyHolderDetails;
import com.cg.healthinsurance.sprintproject.exception.PolicyHolderDetailsNotFoundException;

public interface PolicyHolderService {
	
	public PolicyHolderDetails addPolicyHolder(PolicyHolderDetails policyHolderDetails);	
	
	public PolicyHolderDetails updatePolicyHolder(PolicyHolderDetails policyHolder) throws PolicyHolderDetailsNotFoundException;
     
	public PolicyHolderDetails findPolicyHolderById(int id) throws PolicyHolderDetailsNotFoundException;
	
	public PolicyHolderDetails removePolicyHolder(int id) throws PolicyHolderDetailsNotFoundException;
    
	public List<PolicyHolderDetails> showAllPolicyHolders();
	
	
}
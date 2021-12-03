package com.cg.healthinsurance.service;

import java.util.List;

import com.cg.healthinsurance.entities.PolicyHolderDetails;
import com.cg.healthinsurance.exception.PolicyHolderDetailsNotFoundException;

public interface PolicyHolderService {
	
	public PolicyHolderDetails addPolicyHolder(PolicyHolderDetails policyHolderDetails);	
	
	public PolicyHolderDetails updatePolicyHolder(PolicyHolderDetails policyHolder) throws PolicyHolderDetailsNotFoundException;
     
	public PolicyHolderDetails findPolicyHolderById(int id) throws PolicyHolderDetailsNotFoundException;
	
	public PolicyHolderDetails removePolicyHolder(int id) throws PolicyHolderDetailsNotFoundException;
    
	public List<PolicyHolderDetails> showAllPolicyHolders();
	
	
}
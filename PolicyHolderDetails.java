package com.abchealthinsurance.service;

import java.util.List;

import com.abchealthinsurance.exceptions.PolicyHolderDetailsNotFoundException;

public interface PolicyHolderDetails {
	
	public PolicyHolderService addPolicyHolder(PolicyHolderService policyHolderDetails);	
	
	public PolicyHolderDetails updatePolicyHolder(PolicyHolderDetails policyHolder) throws PolicyHolderDetailsNotFoundException;
     
	public PolicyHolderDetails findPolicyHolderById(int id) throws PolicyHolderDetailsNotFoundException;
	
	public PolicyHolderDetails removePolicyHolder(int id) throws PolicyHolderDetailsNotFoundException;
    
	public List<PolicyHolderDetails> showAllPolicyHolders();
	
	
}
	
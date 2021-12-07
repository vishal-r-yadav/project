package com.cg.healthinsurance.sprintproject.service;

import com.cg.healthinsurance.sprintproject.entities.Policy;
import com.cg.healthinsurance.sprintproject.entities.PolicyHolderDetails;
import com.cg.healthinsurance.sprintproject.entities.TransactionDetails;
import com.cg.healthinsurance.sprintproject.exception.PolicyCannotAffordException;
import com.cg.healthinsurance.sprintproject.exception.TransactionNotFound;

public interface TransactionService {
	
	public TransactionDetails buyPolicy(TransactionDetails transactionDetails, PolicyHolderDetails policyHolderDetails, Policy policy) throws PolicyCannotAffordException;
	
	public TransactionDetails renewPolicy(TransactionDetails transactionDetails, PolicyHolderDetails policyHolderDetails, Policy policy) throws TransactionNotFound;
	
	public TransactionDetails cancelPolicy(int id) throws TransactionNotFound;
	
	public double calculatePolicyPremium(PolicyHolderDetails policyHolderDetails, Policy policy);
	
	public TransactionDetails getTransactionById(int id);
	

}

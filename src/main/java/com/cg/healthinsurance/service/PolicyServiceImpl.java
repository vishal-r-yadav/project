package com.cg.healthinsurance.service;

import java.util.List;
import java.util.Optional;

import com.cg.healthinsurance.dao.PolicyDao;
import com.cg.healthinsurance.entities.Policy;
import com.cg.healthinsurance.exception.PolicyNotFoundException;

public class PolicyServiceImpl implements PolicyService {
	
	private PolicyDao policyDao;

	@Override
	public Policy addPolicy(Policy policy) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Policy updatePolicy(Policy policy) throws PolicyNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Policy findPolicyById(int policyId) throws PolicyNotFoundException {
	    Optional<Policy> optionalpolicy =  policyDao.findById(policyId);
	   if (optionalpolicy.isEmpty()) {
		   
		   throw new PolicyNotFoundException("Policy not existing with this Id "+ policyId);
	   }
	   Policy policy =optionalpolicy.get();
	return policy;
	
	}

	@Override
	public Policy removePolicy(int policyId) throws PolicyNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Policy> showAllPolicies() {
		// TODO Auto-generated method stub
		return null;
	}

}

package com.cg.healthinsurance.sprintproject.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.healthinsurance.sprintproject.dao.PolicyDaoRepository;
import com.cg.healthinsurance.sprintproject.entities.Policy;
import com.cg.healthinsurance.sprintproject.exception.PolicyNotFoundException;


/**
 * @author vishal
 *
 */
@Service("PolicyService")
public class PolicyServiceImpl implements PolicyService {
	
	@Autowired
	PolicyDaoRepository policyDao;

	
	@Override
	public Policy addPolicy(Policy policy) {
		policyDao.saveAndFlush(policy);
		return policy;
	}

	
	@Override
	public Policy updatePolicy(Policy policy) throws PolicyNotFoundException {
		Policy bean = null;
		try {
			bean = policyDao.findById(policy.getPolicyId()).get();
		}
		catch(PolicyNotFoundException e) {
			throw new PolicyNotFoundException("Policy details not found!");
		}
		policyDao.saveAndFlush(policy);
		return policy;
	}
	
	
	
	@Override
	public Policy findPolicyById(int policyId) throws PolicyNotFoundException {

	
	Optional<Policy> optionalPolicy = policyDao.findById(policyId);
		
		if(optionalPolicy.isEmpty()) {
			throw new PolicyNotFoundException("Policy details with given id is not found!");
		}
		
		return optionalPolicy.get();
	}

	@Override
	public Policy removePolicy(int policyId) throws PolicyNotFoundException {
		Policy policy = null;
		
			policy = policyDao.findById(policy.getPolicyId()).get();

		
		policyDao.deleteById(policyId);;
		return policy;
	}

	@Override
	public List<Policy> showAllPolicies() {
		return policyDao.findAll();
	}

}

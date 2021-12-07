package com.cg.healthinsurance.sprintproject.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.healthinsurance.sprintproject.dao.PolicyHolderRepository;
import com.cg.healthinsurance.sprintproject.entities.PolicyHolderDetails;
import com.cg.healthinsurance.sprintproject.exception.PolicyHolderDetailsNotFoundException;

@Service("PolicyHolderService")
public class PolicyHolderServiceImpl implements PolicyHolderService {

	@Autowired
	PolicyHolderRepository policyHolderRepository;
	
	@Override
	public PolicyHolderDetails addPolicyHolder(PolicyHolderDetails policyHolderDetails) {
		policyHolderRepository.saveAndFlush(policyHolderDetails);
		return policyHolderDetails;
	}

	@Override
	public PolicyHolderDetails updatePolicyHolder(PolicyHolderDetails policyHolder) throws PolicyHolderDetailsNotFoundException {
		PolicyHolderDetails bean = null;
		try {
			bean = policyHolderRepository.findById(policyHolder.getPolicyHolderId()).get();
		}
		catch(Exception e) {
			throw new PolicyHolderDetailsNotFoundException("Policy Holder details not found!");
		}
		policyHolderRepository.saveAndFlush(bean);
		return bean;
	}

	@Override
	public PolicyHolderDetails findPolicyHolderById(int id) throws PolicyHolderDetailsNotFoundException {
		PolicyHolderDetails bean = null;
		try {
			bean = policyHolderRepository.findById(id).get();
		}
		catch(Exception e) {
			throw new PolicyHolderDetailsNotFoundException("Policy Holder details with given Id is not found!");
		}
		return bean;
	}

	@Override
	public PolicyHolderDetails removePolicyHolder(int id) throws PolicyHolderDetailsNotFoundException {
		PolicyHolderDetails bean = null;
		try {
			bean = policyHolderRepository.findById(id).get();
		}
		catch(Exception e) {
			throw new PolicyHolderDetailsNotFoundException("Policy Holder details with given Id is not found!");
		}
		policyHolderRepository.deleteById(id);
		return bean;
	}

	@Override
	public List<PolicyHolderDetails> showAllPolicyHolders() {
		return policyHolderRepository.findAll();
	}

}
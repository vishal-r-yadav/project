package com.cg.healthinsurance.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.cg.healthinsurance.entities.Policy;
import com.cg.healthinsurance.exception.PolicyNotFoundException;
@Repository
public class PolicyDao {
	@PersistenceContext
	private EntityManager entityManger;
	public Policy addPolicy(Policy policy) {
		return null;
	}

	public Policy updatePolicy(Policy policy) throws PolicyNotFoundException {
		return null;
	}

	public Policy findPolicyById(int policyId) throws PolicyNotFoundException {
		return null;
	}

	public Policy removePolicy(int policyId) throws PolicyNotFoundException {
		return null;
	}

	public List<Policy> showAllPolicies() {
		return null;
	}

}


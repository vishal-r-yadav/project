package com.cg.healthinsurance.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.cg.healthinsurance.entities.Policy;
import com.cg.healthinsurance.entities.User;
@Repository
public class PolicyHolderDao {
	@PersistenceContext
	private EntityManager entityManger;
	public User addNewPolicy(User user) {
		return null;
	}

	public User signIn(Policy policy) {
		return null;
	}

	public User signOut(User user) {
		return null;
	}

}

package com.cg.healthinsurance.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.cg.healthinsurance.entities.User;
@Repository
public class UserDao {
	@PersistenceContext
	private EntityManager entityManger;
	public void addNewUser(User user) {
		
	}

	public User signIn(User user) {
		return null;
	}

	public User signOut(User user) {
		return null;
	}

}

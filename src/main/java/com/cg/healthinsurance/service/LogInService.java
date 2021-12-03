package com.cg.healthinsurance.service;

import com.cg.healthinsurance.entities.User;

public interface LogInService {

	
	public User addNewUser(User user);
	
	public User signIn(User user);
	
	public User signOut(User user);
}

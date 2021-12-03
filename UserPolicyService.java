package com.abchealthinsurance.service;

import com.abchealthinsurance.entity.User;

public interface UserPolicyService {

	
	public User addNewUser(User user);
	
	public User signIn(User user);
	
	public User signOut(User user);
}

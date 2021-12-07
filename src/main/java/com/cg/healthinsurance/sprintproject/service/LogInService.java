package com.cg.healthinsurance.sprintproject.service;

import java.util.List;

import com.cg.healthinsurance.sprintproject.entities.User;
import com.cg.healthinsurance.sprintproject.exception.UserNotFoundException;

public interface LogInService {

	
	public User addNewUser(User user);
	
	public User signIn(User user) throws UserNotFoundException;
	
	public User signOut(User user) throws UserNotFoundException;
	
	public User getUserById(int id) throws UserNotFoundException;
	
	public List<User> getAllUsers();
}

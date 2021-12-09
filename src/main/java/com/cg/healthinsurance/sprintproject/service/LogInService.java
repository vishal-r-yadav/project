package com.cg.healthinsurance.sprintproject.service;

import java.util.List;

import com.cg.healthinsurance.sprintproject.entities.User;
import com.cg.healthinsurance.sprintproject.exception.UserNotFoundException;

public interface LogInService {

	
	/**
	 * @param user
	 * @return
	 */
	public User addNewUser(User user);
	
	/**
	 * @param user
	 * @return
	 * @throws UserNotFoundException
	 */
	public User signIn(User user) throws UserNotFoundException;
	
	/**
	 * @param user
	 * @return
	 * @throws UserNotFoundException
	 */
	public User signOut(User user) throws UserNotFoundException;
	
	/**
	 * @param id
	 * @return
	 * @throws UserNotFoundException
	 */
	public User getUserById(int id) throws UserNotFoundException;
	
	/**
	 * @return
	 */
	public List<User> getAllUsers();
}

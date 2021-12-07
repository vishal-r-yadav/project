package com.cg.healthinsurance.sprintproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.healthinsurance.sprintproject.dao.UserDao;
import com.cg.healthinsurance.sprintproject.dao.UserDaoRepository;
import com.cg.healthinsurance.sprintproject.entities.User;
import com.cg.healthinsurance.sprintproject.exception.UserNotFoundException;

@Service("LogInService")
public class LogInServiceImpl implements LogInService {
	
	@Autowired
	UserDaoRepository userDaoRepository;

	@Override
	public User addNewUser(User user) {
		userDaoRepository.saveAndFlush(user);
		return user;
	}

	@Override
	public User signIn(User user) throws UserNotFoundException {
		User bean = null;
		try {
			bean = userDaoRepository.findById(user.getUserId()).get();
		}
		catch(Exception e) {
			throw new UserNotFoundException("User Details not found! Please Sign up to login successfully");
		}
		return user;
	}

	@Override
	public User signOut(User user) throws UserNotFoundException {
		User bean = null;
		try {
			bean = userDaoRepository.findById(user.getUserId()).get();
		}
		catch(Exception e) {
			throw new UserNotFoundException("User Details not found! Please Sign up to login successfully");
		}
		userDaoRepository.deleteById(user.getUserId());
		return bean;
	}

	@Override
	public User getUserById(int id) throws UserNotFoundException {
		User bean = null;
		try {
			bean = userDaoRepository.findById(id).get();
		}
		catch(Exception e) {
			throw new UserNotFoundException("User Details not found! Please Sign up to login successfully");
		}
		return bean;
	}

	@Override
	public List<User> getAllUsers() {
		return userDaoRepository.findAll();
	}



}

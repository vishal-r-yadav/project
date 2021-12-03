package com.cg.healthinsurance.service;

import com.cg.healthinsurance.dao.UserDao;
import com.cg.healthinsurance.entities.User;

public class LogInServiceImpl implements LogInService {
private UserDao userDao;
	@Override
	public void addNewUser(User user) {
		userDao.addNewUser(user);
		
	
	}

	@Override
	public User signIn(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User signOut(User user) {
		// TODO Auto-generated method stub
		return null;
	}

}

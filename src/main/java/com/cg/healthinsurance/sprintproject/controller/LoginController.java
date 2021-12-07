package com.cg.healthinsurance.sprintproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.healthinsurance.sprintproject.entities.User;
import com.cg.healthinsurance.sprintproject.exception.UserNotFoundException;
import com.cg.healthinsurance.sprintproject.service.LogInService;

@RestController
@RequestMapping("/healthinsurance-login")
public class LoginController {
	
	
	@Autowired
	LogInService logInService;
	
	@PostMapping("/addnewuser")
	public User addNewUser(@RequestBody User user) {
		return logInService.addNewUser(user);
	}
	
	@GetMapping("/signin")
	public User signIn(@RequestBody User user) throws UserNotFoundException {
		return logInService.signIn(user);
	}
	
	@DeleteMapping("/signout")
	public User signOut(@RequestBody User user) throws UserNotFoundException {
		return logInService.signOut(user);
	}
	
	@GetMapping("/getuserbyid/{userId}")
	public User getUserById(@PathVariable int userId) throws UserNotFoundException {
		return logInService.getUserById(userId);
	}

	@GetMapping("/getusers/all")
	public List<User> getAllUsers(){
		return logInService.getAllUsers();
	}

}

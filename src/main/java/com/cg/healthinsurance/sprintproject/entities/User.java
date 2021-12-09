package com.cg.healthinsurance.sprintproject.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "user_dtls")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name= "user_id")
	private int userId;
	
	@Column(name= "user_name")
	private String userName;
	
	@Column(name= "password")
	private String password;
	
	@Column(name= "role")
	private String role;
	
	@Column(name= "email")
	private String email;
	
	@Column(name= "mobile")
	private long mobileNo;
	
	@Column(name= "salary")
	private double salary;
	
	
	@Column(name= "date_of_birth")
	private LocalDate dateOfBirth;	
	
	public User() {
		super();
	}
	
	public User(int userId, String userName, String password, String role, String email, long mobileNo, double salary,
			LocalDate dateOfBirth) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		this.role = role;
		this.email = email;
		this.mobileNo = mobileNo;
		this.salary = salary;
		this.dateOfBirth = dateOfBirth;
	}
	
	public int getUserId() {
		return userId;
	}
	
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getRole() {
		return role;
	}
	
	public void setRole(String role) {
		this.role = role;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public long getMobileNo() {
		return mobileNo;
	}
	
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;

	}
	
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
}

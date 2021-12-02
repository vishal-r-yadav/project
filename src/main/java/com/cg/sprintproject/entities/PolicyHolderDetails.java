package com.cg.sprintproject.entities;

import java.time.LocalDate;

public class PolicyHolderDetails {
	
	private String policyHolderId;
	private String holderName;
	private String policyName;
	private String premiumType;
	private LocalDate dateOfBirth;
	private double annualIncome;
	private LocalDate startDate;
	private LocalDate endDate;
	
	
	
	//private User user;
	//private Policy policy;
	//private LocalDate startDate;
	//private LocalDate endDate;
	//private TransactionDetails transactiondetails;
	
	
	public String getPolicyHolderId() {
		return policyHolderId;
	}
	public void setPolicyHolderId(String policyHolderId) {
		this.policyHolderId = policyHolderId;
	}
	public String getHolderName() {
		return holderName;
	}
	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}
	public String getPolicyName() {
		return policyName;
	}
	public void setPolicyName(String policyName) {
		this.policyName = policyName;
	}
	public String getPremiumType() {
		return premiumType;
	}
	public void setPremiumType(String premiumType) {
		this.premiumType = premiumType;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public double getAnnualIncome() {
		return annualIncome;
	}
	public void setAnnualIncome(double annualIncome) {
		this.annualIncome = annualIncome;
	}
	public LocalDate getStartDate() {
		return startDate;
	}
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	public LocalDate getEndDate() {
		return endDate;
	}
	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}
	
	
	
	
	

}

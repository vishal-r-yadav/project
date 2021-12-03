package com.cg.healthinsurance.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="policy_holder_dtls")
public class PolicyHolderDetails {
	@Id
	@Column(name="policy_holder_id")
	private String policyHolderId;
	@Column(name="policy_holder_name")
	private String holderName;
	@Column(name="policy_name")
	private String policyName;
	@Column(name="premium_type")
	private String premiumType;
	
	@Column(name="policy_annual_income")
	private double annualIncome;
	@Column(name="start_date")
	private LocalDate startDate;
	@Column(name="end_date")
	private LocalDate endDate;
	@Column(name="transaction_id")
	private int transactionId;
	
	
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
	public int getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}
	
	
	
	
	
	

}

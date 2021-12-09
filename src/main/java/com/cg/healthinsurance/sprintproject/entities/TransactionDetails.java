package com.cg.healthinsurance.sprintproject.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="transaction_dtls")
public class TransactionDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="transaction_id")
	private int transactionId;
	
	@Column(name="amount")
	private double amount;
	
	@ManyToOne
	@JoinColumn(name = "policy_holder_id", referencedColumnName = "policy_holder_id")
	private PolicyHolderDetails policyHolderDetails;
	

	@Column(name="pay_date")
	private LocalDate paymentDate;
	
	public TransactionDetails() {
		super();
	}

	public TransactionDetails(int transactionId, double amount, PolicyHolderDetails policyHolderDetails,
			LocalDate paymentDate) {
		super();
		this.transactionId = transactionId;
		this.amount = amount;
		this.policyHolderDetails = policyHolderDetails;
		this.paymentDate = paymentDate;
	}
	
	public PolicyHolderDetails getPolicyHolderDetails() {
		return policyHolderDetails;
	}

	public void setPolicyHolderDetails(PolicyHolderDetails policyHolderDetails) {
		this.policyHolderDetails = policyHolderDetails;
	}

	public int getTransactionId() {
		return transactionId;
	}
	
	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}
	
	public double getAmount() {
		return amount;
	}
	
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	public LocalDate getPaymentDate() {
		return paymentDate;
	}
	
	public void setPaymentDate(LocalDate paymentDate) {
		this.paymentDate = paymentDate;
	}
	

}

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
@Table(name= "policy_dtls")
public class Policy {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="policy_id")
	private int policyId;
	
	@Column(name="policy_name")
	private String policyName;

	
	@ManyToOne
	@JoinColumn(name = "policy_holder_id", referencedColumnName = "policy_holder_id")
	private PolicyHolderDetails policyHolderDetails;
	
	
	@Column(name="policy_effective_date")
	private LocalDate startDate;

	@Column(name="policy_end_date")
	private LocalDate endDate ;
	
	@Column(name="policy_term")
	private String term;
	
	@Column(name="policy_price")
	private double price;
	
	@Column(name="policy_created_by")
	private String createdBy;
	
	public Policy() {
		super();
	}
	
	public Policy(int policyId, String policyName, PolicyHolderDetails policyHolderDetails, LocalDate startDate,
			LocalDate endDate, String term, double price, String createdBy) {
		super();
		this.policyId = policyId;
		this.policyName = policyName;
		this.policyHolderDetails = policyHolderDetails;
		this.startDate = startDate;
		this.endDate = endDate;
		this.term = term;
		this.price = price;
		this.createdBy = createdBy;
	}
	
	public int getPolicyId() {
		return policyId;
	}
	
	public void setPolicyId(int policyId) {
		this.policyId = policyId;
	}
	
	public String getPolicyName() {
		return policyName;
	}
	
	public void setPolicyName(String policyName) {
		this.policyName = policyName;
	}
	
	public LocalDate getStartDate() {
		return startDate;
	}
	
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	
	public String getTerm() {
		return term;
	}
	
	public void setTerm(String term) {
		this.term = term;
	}
	
	public LocalDate getEndDate() {
		return endDate;
	}
	
	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public String getCreatedBy() {
		return createdBy;
	}
	
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	

}

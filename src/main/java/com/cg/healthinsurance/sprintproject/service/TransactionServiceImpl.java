package com.cg.healthinsurance.sprintproject.service;

import java.time.temporal.ChronoUnit;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.healthinsurance.sprintproject.dao.PolicyHolderRepository;
import com.cg.healthinsurance.sprintproject.dao.TransactionDaoRepository;
import com.cg.healthinsurance.sprintproject.entities.Policy;
import com.cg.healthinsurance.sprintproject.entities.PolicyHolderDetails;
import com.cg.healthinsurance.sprintproject.entities.TransactionDetails;
import com.cg.healthinsurance.sprintproject.exception.PolicyCannotAffordException;
import com.cg.healthinsurance.sprintproject.exception.TransactionNotFound;

@Service("TransactionService")
public class TransactionServiceImpl implements TransactionService{
	
	@Autowired
	TransactionDaoRepository transactionDaoRepository;
	
	@Autowired
	PolicyHolderRepository policyHolderRepository;

	@Override
	public TransactionDetails buyPolicy(TransactionDetails transactionDetails, PolicyHolderDetails policyHolderDetails, Policy policy) throws PolicyCannotAffordException {
		try {
			if(policyHolderDetails.getAnnualIncome()<policy.getPrice()) {
				throw new PolicyCannotAffordException("Sorry, You cannot afford this Policy");
			}
		}
		catch(Exception e) {
			e.getStackTrace();
		}
		policyHolderDetails.setTransactionId(transactionDetails.getTransactionId());
		policyHolderDetails.setPolicyName(policy.getPolicyName());
		policyHolderDetails.setPremiumType(policy.getTerm());
		policyHolderDetails.setStartDate(policy.getStartDate());
		policyHolderDetails.setEndDate(policy.getEndDate());
		transactionDaoRepository.saveAndFlush(transactionDetails);
		return transactionDetails;
	}

	@Override
	public TransactionDetails renewPolicy(TransactionDetails transactionDetails ,PolicyHolderDetails policyHolderDetails, Policy policy) throws TransactionNotFound{
		PolicyHolderDetails bean = null;
		try {
			bean =  policyHolderRepository.findById(policyHolderDetails.getTransactionId()).get();
		}
		catch(Exception e) {
			throw new TransactionNotFound("Renewal Policy is not found! Please buy the policy");
		}
		policyHolderDetails.setTransactionId(transactionDetails.getTransactionId());
		policyHolderDetails.setPolicyName(policy.getPolicyName());
		policyHolderDetails.setPremiumType(policy.getTerm());
		policyHolderDetails.setStartDate(policy.getStartDate());
		policyHolderDetails.setEndDate(policy.getEndDate());
		transactionDaoRepository.saveAndFlush(transactionDetails);
		return transactionDetails;
	}

	@Override
	public TransactionDetails cancelPolicy(int id) throws TransactionNotFound{
		List<PolicyHolderDetails> policyHolderDetails = null;
		PolicyHolderDetails bean = null;
		TransactionDetails transactionDetails = null;
		try {
			transactionDetails = transactionDaoRepository.findById(id).get();
			if(transactionDetails != null) {
				policyHolderDetails =  policyHolderRepository.findAll();
				for(PolicyHolderDetails i : policyHolderDetails) {
					if(i.getTransactionId()==id) {
						bean = i;
					}
				}
			}
		}
		catch(Exception e) {
			throw new TransactionNotFound("Policy not brought yet!");
		}
		policyHolderRepository.deleteById(bean.getPolicyHolderId());
		transactionDaoRepository.deleteById(id);
		return null;
	}

	@Override
	public double calculatePolicyPremium(PolicyHolderDetails policyHolderDetails, Policy policy) {
		PolicyHolderDetails bean = null;
		try {
			bean = policyHolderRepository.findById(policyHolderDetails.getPolicyHolderId()).get();
		}
		catch(Exception e) {
			throw new TransactionNotFound("Policy not brought yet!");
		}
		long monthsBetween = ChronoUnit.MONTHS.between(
				policyHolderDetails.getStartDate().withDayOfMonth(1),
				policyHolderDetails.getEndDate().withDayOfMonth(1));
		return (double)monthsBetween*policy.getPrice();
	}

	@Override
	public TransactionDetails getTransactionById(int id) {
		TransactionDetails transactionDetails = null;
		try {
			transactionDetails = transactionDaoRepository.findById(id).get();
		}
		catch(Exception e) {
			throw new TransactionNotFound("Policy not brought yet!");
		}
		return transactionDetails;
	}

	

}

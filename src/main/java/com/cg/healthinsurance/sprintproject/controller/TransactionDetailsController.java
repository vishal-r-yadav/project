package com.cg.healthinsurance.sprintproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.healthinsurance.sprintproject.entities.Policy;
import com.cg.healthinsurance.sprintproject.entities.PolicyHolderDetails;
import com.cg.healthinsurance.sprintproject.entities.TransactionDetails;
import com.cg.healthinsurance.sprintproject.exception.PolicyCannotAffordException;
import com.cg.healthinsurance.sprintproject.exception.TransactionNotFound;
import com.cg.healthinsurance.sprintproject.service.TransactionService;

@RestController
@RequestMapping("/healthinsurance-transactiondetailscontroller")
public class TransactionDetailsController {
	
	@Autowired
	TransactionService transactionService;
	
	@PostMapping("/createtransaction")
	public TransactionDetails buyPolicy(@RequestBody TransactionDetails transactionDetails,@RequestBody PolicyHolderDetails policyHolderDetails, @RequestBody Policy policy) throws PolicyCannotAffordException{
		return transactionService.buyPolicy(transactionDetails, policyHolderDetails, policy);
	}
	
	@PutMapping("/updatetransaction")
	public TransactionDetails renewPolicy(@RequestBody TransactionDetails transactionDetails,@RequestBody PolicyHolderDetails policyHolderDetails,@RequestBody Policy policy) throws TransactionNotFound {
		return transactionService.renewPolicy(transactionDetails, policyHolderDetails, policy);
	}
	
	@DeleteMapping("/deletetransaction/{transactionId}")
	public TransactionDetails cancelPolicy(@PathVariable int transactionId) throws TransactionNotFound {
		return transactionService.cancelPolicy(transactionId);
	}
	
	@GetMapping("/getpolicypremium")
	public double calculatePolicyPremium(@RequestBody PolicyHolderDetails policyHolderDetails,@RequestBody  Policy policy) {
		return transactionService.calculatePolicyPremium(policyHolderDetails, policy);
	}
	
	@GetMapping("/gettransactionbyid/{transactionId}")
	public TransactionDetails getTransactionById(@PathVariable int transactionId) {
		return transactionService.getTransactionById(transactionId);
	}

}

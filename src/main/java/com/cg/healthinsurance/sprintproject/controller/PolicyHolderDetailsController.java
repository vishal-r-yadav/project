package com.cg.healthinsurance.sprintproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.healthinsurance.sprintproject.entities.PolicyHolderDetails;
import com.cg.healthinsurance.sprintproject.exception.PolicyHolderDetailsNotFoundException;
import com.cg.healthinsurance.sprintproject.service.PolicyHolderService;

@RestController
@RequestMapping("/healthinsurance-policyholderdetails")
public class PolicyHolderDetailsController {
	
	@Autowired
	private PolicyHolderService policyHolderService;
	
	@PostMapping("/createpolicyholder")
	public PolicyHolderDetails addPolicyHolder(@RequestBody PolicyHolderDetails policyHolderDetails) {
		return policyHolderService.addPolicyHolder(policyHolderDetails);
	}
	
	@PutMapping("/updatepolicyholder")
	public PolicyHolderDetails updatePolicyHolder(@RequestBody PolicyHolderDetails policyHolder) throws PolicyHolderDetailsNotFoundException {
		return policyHolderService.updatePolicyHolder(policyHolder);
	}
    
	@GetMapping("/getpolicyholderbyid/{policyHolderId}")
	public PolicyHolderDetails findPolicyHolderById(@PathVariable int policyHolderId) throws PolicyHolderDetailsNotFoundException {
		return policyHolderService.findPolicyHolderById(policyHolderId);
	}
	
	@DeleteMapping("/policyholder/{policyHolderId}")
	public PolicyHolderDetails removePolicyHolder(@PathVariable int policyHolderId) throws PolicyHolderDetailsNotFoundException {
		return policyHolderService.removePolicyHolder(policyHolderId);
	}
    
	@GetMapping("/policyholder/all")
	public List<PolicyHolderDetails> showAllPolicyHolders() {
		return policyHolderService.showAllPolicyHolders();
	}
}

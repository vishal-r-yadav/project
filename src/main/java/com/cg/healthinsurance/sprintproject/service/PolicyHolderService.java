package com.cg.healthinsurance.sprintproject.service;

import java.util.List;

import com.cg.healthinsurance.sprintproject.entities.PolicyHolderDetails;
import com.cg.healthinsurance.sprintproject.exception.PolicyHolderDetailsNotFoundException;


public interface PolicyHolderService {
	
	/**This method helps us to add new policyHolder
	 *  @author Vishal
	 * @param policyHolderDetails
	 * @return
	 */
	public PolicyHolderDetails addPolicyHolder(PolicyHolderDetails policyHolderDetails);	
	
	/**This method helps us to update policyHolderDetails
	 * @param policyHolder
	 * @return
	 * @throws PolicyHolderDetailsNotFoundException
	 */
	public PolicyHolderDetails updatePolicyHolder(PolicyHolderDetails policyHolder) throws PolicyHolderDetailsNotFoundException;
     
	/**This method helps us to Find policyHolder
	 * @author Vishal
	 * @param id
	 * @return
	 * @throws PolicyHolderDetailsNotFoundException
	 */
	public PolicyHolderDetails findPolicyHolderById(int id) throws PolicyHolderDetailsNotFoundException;
	
	/**This method helps us to remove policyHolder
	 *  
	 * @param id
	 * @return
	 * @throws PolicyHolderDetailsNotFoundException
	 */
	public PolicyHolderDetails removePolicyHolder(int id) throws PolicyHolderDetailsNotFoundException;
    
	/**This method helps us to view all policyHolder
	 *  @author Vishal
	 * @return list of policyHolder
	 */
	public List<PolicyHolderDetails> showAllPolicyHolders();
	
	
}
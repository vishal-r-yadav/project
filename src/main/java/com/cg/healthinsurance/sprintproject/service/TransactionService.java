package com.cg.healthinsurance.sprintproject.service;

import com.cg.healthinsurance.sprintproject.entities.Policy;
import com.cg.healthinsurance.sprintproject.entities.PolicyHolderDetails;
import com.cg.healthinsurance.sprintproject.entities.TransactionDetails;
import com.cg.healthinsurance.sprintproject.exception.PolicyCannotAffordException;
import com.cg.healthinsurance.sprintproject.exception.TransactionNotFound;

public interface TransactionService {
	
	/**This method helps us to buy policy
	 * @author Vaibhav
	 * @param transactionDetails
	 * @param policyHolderDetails
	 * @param policy
	 * @return TransactionDetails
	 * @throws PolicyCannotAffordException
	 */
	public TransactionDetails buyPolicy(TransactionDetails transactionDetails, PolicyHolderDetails policyHolderDetails, Policy policy) throws PolicyCannotAffordException;
	
	/**This method helps us to renew policy
	 * @author Vaibhav
	 * @param transactionDetails
	 * @param policyHolderDetails
	 * @param policy
	 * @return Transaction details
	 * @throws TransactionNotFound
	 */
	public TransactionDetails renewPolicy(TransactionDetails transactionDetails, PolicyHolderDetails policyHolderDetails, Policy policy) throws TransactionNotFound;
	
	/**This method helps us to cancel policy
	 *  @author Vaibhav
	 * @param id
	 * @return TransactionDetails
	 * @throws TransactionNotFound
	 */
	public TransactionDetails cancelPolicy(int id) throws TransactionNotFound;
	
	/**This method helps us to calculate the premium
	 * @author Rushikesh
	 * @param policyHolderDetails
	 * @param policy
	 * @return amount; 
	 */
	public double calculatePolicyPremium(PolicyHolderDetails policyHolderDetails, Policy policy);
	
	/**This method helps us to get Transaction  
	 * @author Rushikesh
	 * @param id
	 * @return TransactionDetails 
	 */
	public TransactionDetails getTransactionById(int id);
	

}

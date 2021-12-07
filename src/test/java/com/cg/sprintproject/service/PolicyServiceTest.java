/**
 * 
 */
package com.cg.sprintproject.service;

/**
 * @author vishal
 *
 */
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;

import java.time.LocalDate;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.ContextConfiguration;

import com.cg.healthinsurance.sprintproject.dao.PolicyDaoRepository;
import com.cg.healthinsurance.sprintproject.entities.Policy;
import com.cg.healthinsurance.sprintproject.exception.PolicyNotFoundException;
import com.cg.healthinsurance.sprintproject.service.PolicyServiceImpl;

@ContextConfiguration
public class PolicyServiceTest {
	
	@Mock
	private PolicyDaoRepository policyDaoRepository ;
	@InjectMocks
	private PolicyServiceImpl policyServiceImpl;
	@Test
	public void testFindPolicyById() {
		
		Policy policy = new Policy();
		policy.setPolicyId(1);
		policy.setPolicyName("Child Care");
		policy.setPrice(500);
		policy.setCreatedBy("vishal");
		policy.setStartDate(LocalDate.of(2021,12,01));
		policy.setEndDate(LocalDate.of(2023, 12, 01));
		policy.setTerm("2");
		
		Optional<Policy> optionalPolicy = Optional.of(policy);
		when(policyDaoRepository.findById(1)).thenReturn(optionalPolicy);
		Policy vPolicy = policyServiceImpl.findPolicyById(1);
		assertEquals(policy.getPolicyName(),vPolicy.getPolicyName());
		
	}
	
	@Test
	public void testFindPolicyByIdThrowingException() {
		
		when(policyDaoRepository.findById(1)).thenThrow(PolicyNotFoundException.class);
		assertThrows(PolicyNotFoundException.class, () -> policyServiceImpl.findPolicyById(1));
	}
	
	

}

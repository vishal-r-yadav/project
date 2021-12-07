package com.cg.healthinsurance.sprintproject.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.healthinsurance.sprintproject.entities.PolicyHolderDetails;

@Repository("PolicyHolderDao")
public interface PolicyHolderRepository extends PolicyHolderDao, JpaRepository<PolicyHolderDetails,Integer>{

}

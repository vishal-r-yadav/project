package com.cg.healthinsurance.sprintproject.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.healthinsurance.sprintproject.entities.Policy;

@Repository("PolicyDao")
public interface PolicyDaoRepository extends PolicyDao, JpaRepository<Policy,Integer>{

}

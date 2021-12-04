package com.cg.healthinsurance.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.healthinsurance.entities.Policy;

public interface PolicyDao extends JpaRepository<Policy,Integer> {
	

}


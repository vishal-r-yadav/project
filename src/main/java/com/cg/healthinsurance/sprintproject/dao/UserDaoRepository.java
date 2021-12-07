package com.cg.healthinsurance.sprintproject.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.healthinsurance.sprintproject.entities.User;

@Repository("UserDao")
public interface UserDaoRepository extends UserDao, JpaRepository<User, Integer> {

}

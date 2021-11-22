package com.wolken.wolkenProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.wolken.wolkenProject.entity.UserEntity;
public interface UserRepository extends JpaRepository<UserEntity, Integer>{

	UserEntity getByAddress(String address);

	UserEntity getByEmailId(String emailId);

	
	

	
}

package com.wolken.wolkenProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wolken.wolkenProject.entity.MappingEntity;
import com.wolken.wolkenProject.entity.TicketEntity;


public interface MappingRepository extends JpaRepository<MappingEntity, Integer> {

	MappingEntity findByUserId(int userId);

}


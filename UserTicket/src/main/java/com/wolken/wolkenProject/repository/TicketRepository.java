package com.wolken.wolkenProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wolken.wolkenProject.entity.TicketEntity;


public interface TicketRepository extends JpaRepository<TicketEntity, Integer>{

	TicketEntity getByName(String name);


}

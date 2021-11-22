package com.wolken.wolkenProject.service;

import java.util.List;

import com.wolken.wolkenProject.dto.MappingDto;
import com.wolken.wolkenProject.dto.TicketDto;
import com.wolken.wolkenProject.dto.UserDto;
import com.wolken.wolkenProject.entity.MappingEntity;
import com.wolken.wolkenProject.entity.TicketEntity;
import com.wolken.wolkenProject.entity.UserEntity;

public interface MappingService {
       	public List<MappingDto> getAllTicket();

		public MappingEntity addToMap(UserEntity entity);

		public void addTicketToMap(TicketEntity entity);

	

	

	
}

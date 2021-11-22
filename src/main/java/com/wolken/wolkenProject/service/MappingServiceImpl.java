package com.wolken.wolkenProject.service;

import java.util.ArrayList;
import java.util.List;


import org.hibernate.TypeMismatchException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wolken.wolkenProject.dto.MappingDto;
import com.wolken.wolkenProject.dto.TicketDto;
import com.wolken.wolkenProject.dto.UserDto;
import com.wolken.wolkenProject.entity.MappingEntity;
import com.wolken.wolkenProject.entity.TicketEntity;
import com.wolken.wolkenProject.entity.UserEntity;

import com.wolken.wolkenProject.repository.MappingRepository;


@Service
public class MappingServiceImpl implements MappingService {
	@Autowired

	MappingRepository Repo;
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Override
	public List<MappingDto> getAllTicket() {
		
       List<MappingDto> mappingDTOs = new ArrayList<>();
		
		try {
			List<MappingEntity> mappingEntities = Repo.findAll();
			logger.info("Find ALL"+Repo.findAll());
			
			for (MappingEntity mappingEntity : mappingEntities) {
				MappingDto mappingDTO = new MappingDto();
				BeanUtils.copyProperties(mappingEntity, mappingDTO);
				logger.info(""+mappingDTOs);
				mappingDTOs.add(mappingDTO);
				logger.info("Mapping"+mappingDTOs);
				
			}
		} catch (NullPointerException | TypeMismatchException e) {
			logger.error(e.getMessage(),e.getClass().getName());
		}
		return mappingDTOs;
	}

	@Override
	public MappingEntity addToMap(UserEntity uentity) {
		// TODO Auto-generated method stub
		MappingEntity entity=new MappingEntity();
		logger.info(""+uentity);
		BeanUtils.copyProperties(uentity, entity);
		logger.info("user id"+uentity.getUser_id());
		entity.setUserId(uentity.getUser_id());
		Repo.save(entity);
		return null;
	}

	@Override
	public void addTicketToMap(TicketEntity entity) {
		// TODO Auto-generated method stub
		
		MappingEntity mentity=new MappingEntity();
		
		mentity=Repo.findByUserId(entity.getUser_id());
		
		mentity.setDescription(entity.getDescription());
		mentity.setEndDate(entity.getEndDate());
		mentity.setName(entity.getName());
		mentity.setPriority(entity.getPriority());
		mentity.setStartDate(entity.getStartDate());
		mentity.setStatus(entity.isStatus());
		mentity.setTicketId(entity.getT_id());
		mentity.setTicketRaisedBy(entity.getTicketRaisedBy());
		mentity.setTimeToClose(entity.getTimeToClose());
		mentity.setType(entity.getType());
		
		Repo.save(mentity);
		
		
	}
	

	

}

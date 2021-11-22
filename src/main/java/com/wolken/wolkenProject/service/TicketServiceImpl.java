package com.wolken.wolkenProject.service;

import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wolken.wolkenProject.dto.TicketDto;
import com.wolken.wolkenProject.entity.TicketEntity;
import com.wolken.wolkenProject.repository.TicketRepository;

@Service
public class TicketServiceImpl implements TicketService {

	@Autowired(required=true)
	TicketRepository repo;
   
    @Autowired
    MappingService service;
    
	@Override

	public String validateAndSave(TicketDto dto) {
		TicketEntity entity = new TicketEntity();
	
		if (dto != null) {
			BeanUtils.copyProperties(dto, entity);

				entity=repo.save(entity);
			  service.addTicketToMap(entity);
          
			return "Ticket added";
		}
		return null;

	}

	@Override
	public String validateAndUpdateTicket(TicketDto dto) {
		// TODO Auto-generated method stub
		TicketEntity entity = new TicketEntity();
		entity = repo.getByName(dto.getName());
		if (dto != null) {
			if (dto.getType() != null) {

				entity.setType(dto.getType());
			}
			if (dto.getDescription() != null) {
				entity.setDescription(dto.getDescription());
			}
			if (dto.getStartDate() != null) {
				entity.setStartDate(dto.getStartDate());
			}
			if (dto.getEndDate() != null) {
				entity.setEndDate(dto.getEndDate());
			}
			if (dto.getTimeToClose() != 0) {
				entity.setTimeToClose(dto.getTimeToClose());
			}
			if (dto.getPriority() != 0) {
				entity.setPriority(dto.getPriority());
			}
			if (dto.getTicketRaisedBy() != null) {
				entity.setTicketRaisedBy(dto.getTicketRaisedBy());
			}

			if ((dto.isStatus() == true)) {

				entity.setStatus(dto.isStatus());
			}
			if (dto.isStatus() == false) {

				entity.setStatus(dto.isStatus());
			}

			repo.save(entity);
			return "User added";
		}
		return null;

	}

	@Override
	public List<TicketDto> validateAndGet() {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
		List<TicketDto> dtos = new ArrayList<>();
		List<TicketEntity> entity;
		entity = repo.findAll();
		for (TicketEntity Ticketentity : entity) {
			TicketDto dto = new TicketDto();
			BeanUtils.copyProperties(Ticketentity, dto);
			dtos.add(dto);

		}

		return dtos;

	}

}

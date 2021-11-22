package com.wolken.wolkenProject.Controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.wolken.wolkenProject.dto.TicketDto;
import com.wolken.wolkenProject.dto.UserDto;
import com.wolken.wolkenProject.service.TicketService;

@RestController
public class TicketController {
	@Autowired 
	TicketService service;
	private Logger logger = LoggerFactory.getLogger(TicketController.class);
	@PostMapping("Addticket")
	String save(@RequestBody TicketDto dto) {
		String msg = null;
		try {
			logger.info(""+dto);
			msg=service.validateAndSave(dto);
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
		
		return msg;
	}
	@PostMapping("updateTicket")
	String updateUser(@RequestBody TicketDto dto) {
		String msg=null;
		try {
			logger.info(""+dto);
			msg=service.validateAndUpdateTicket(dto);
		}
		catch(Exception e) {
			logger.error(e.getMessage());
			}
		
		return msg;
		
	}
	@GetMapping("GetAllTicket")
	List<TicketDto> GetAll() {
		List<TicketDto> dto=null;
		 dto=service.validateAndGet();
		return dto;	
	}

}

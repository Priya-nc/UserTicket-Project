package com.wolken.wolkenProject.Controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wolken.wolkenProject.dto.MappingDto;
import com.wolken.wolkenProject.service.MappingService;


@RestController
public class MappingController {
	@Autowired 
	MappingService service;
	private Logger logger = LoggerFactory.getLogger(MappingController.class);
	@GetMapping("alltickets")
	List<MappingDto> alltickets(){
		List<MappingDto> dto=null;
		try {
			dto = service.getAllTicket();
		} catch (Exception e) {
			logger.error(e.getMessage(),e.getClass().getSimpleName());
		}
		return dto;
	}
	
	
}
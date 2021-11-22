package com.wolken.project.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.wolken.project.dto.UserDto;
import com.wolken.project.service.UserService;



@RestController
public class UserController {

	@Autowired 
	UserService service;
	private Logger logger = LoggerFactory.getLogger(UserController.class);
	@PostMapping("create")
	String save(@RequestBody UserDto dto) {
		String msg = null;
		try {
			logger.info(""+dto);
			msg=service.validateAndSave(dto);
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
		
		return msg;
	}
	
	@GetMapping("alltickets")
	List<UserDto> alltickets(){
		List<UserDto> dto=null;
		try {
			dto = service.getAllTicket();
		} catch (Exception e) {
			logger.error(e.getMessage(),e.getClass().getSimpleName());
		}
		return dto;
	}
	
}

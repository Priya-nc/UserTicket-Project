package com.wolken.wolkenProject.Controller;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.wolken.wolkenProject.dto.UserDto;
import com.wolken.wolkenProject.service.UserService;


@RestController
public class UserController {
	@Autowired 
	UserService service;
	private Logger logger = LoggerFactory.getLogger(UserController.class);
	@PostMapping("createAccount")
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
	@PostMapping("update")
	String updateUser(@RequestBody UserDto dto) {
		String msg=null;
		try {
			logger.info(""+dto);
			msg=service.validateAndUpdate(dto);
		}
		catch(Exception e) {
			logger.error(e.getMessage());
			}
		
		return msg;
		
	}
	
	@GetMapping("GetAllUser")
	List<UserDto> GetAll() {
		List<UserDto> dto=null;
		 dto=service.validateAndGet();
		return dto;	
	}
	
}

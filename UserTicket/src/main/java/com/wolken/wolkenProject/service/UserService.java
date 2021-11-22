package com.wolken.wolkenProject.service;



import java.util.List;

import com.wolken.wolkenProject.dto.UserDto;



public interface UserService {
	String validateAndSave(UserDto dto);

	String validateAndUpdate(UserDto dto);
	
	List<UserDto> validateAndGet();
}

package com.wolken.project.service;

import java.util.List;

import com.wolken.project.dto.UserDto;

public interface UserService {

	String validateAndSave(UserDto dto);

	List<UserDto> getAllTicket();
}

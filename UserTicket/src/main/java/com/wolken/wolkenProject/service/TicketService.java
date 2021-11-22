package com.wolken.wolkenProject.service;

import java.util.List;

import com.wolken.wolkenProject.dto.TicketDto;
import com.wolken.wolkenProject.dto.UserDto;


public interface TicketService {

	String validateAndSave(TicketDto dto);

	String validateAndUpdateTicket(TicketDto dto);

	List<TicketDto> validateAndGet();

}

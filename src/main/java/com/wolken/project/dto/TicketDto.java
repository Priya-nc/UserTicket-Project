package com.wolken.project.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString

public class TicketDto {
	private int ticketId;
	private String name;
	private String type;
	private boolean status;
	private String description;
	private String startDate;
	private String endDate;
	private int timeToClose;
	private int priority;
	private String ticketRaisedBy;
}
package com.wolken.wolkenProject.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@ToString
public class MappingDto {

	
	private int userId;
	private String firstName;
	private String lastName;
	private long contactNo;
	private String dob;
	private byte age;
	private String gender;
	private String emailId;
	private String password;
	private String address;
	private long pincode;
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

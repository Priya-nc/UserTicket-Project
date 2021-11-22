package com.wolken.project.dto;

import java.util.List;

import com.wolken.project.entity.TicketEntity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class UserDto {

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
	private List<TicketEntity> ticket;
}

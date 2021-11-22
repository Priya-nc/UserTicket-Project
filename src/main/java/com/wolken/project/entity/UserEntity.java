package com.wolken.project.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Entity
@Table

public class UserEntity {
	@Id
	@GenericGenerator(name = "wolken", strategy = "increment")
	@GeneratedValue(generator = "wolken")
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

	@OneToMany(targetEntity=TicketEntity.class,cascade = CascadeType.ALL)

	@JoinColumn(name = "user_id", referencedColumnName = "userId")
	private List<TicketEntity> ticket;

	/*
	 * @OneToMany(mappedBy = "user", cascade = CascadeType.ALL) private
	 * Set<TicketEntity> tEntity;
	 */

}

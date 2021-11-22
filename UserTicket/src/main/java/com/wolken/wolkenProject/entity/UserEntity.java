package com.wolken.wolkenProject.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
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
	    @GenericGenerator(name="wolken", strategy="increment")
		@GeneratedValue(generator = "wolken")
	private int user_id;
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
	/*
	 * @OneToMany(mappedBy = "user", cascade = CascadeType.ALL) private
	 * Set<TicketEntity> tEntity;
	 */
	
}

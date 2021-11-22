package com.wolken.wolkenProject.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
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
public class TicketEntity {

	@Id

	@GenericGenerator(name = "wolken", strategy = "increment")

	@GeneratedValue(generator = "wolken")
	private int t_id;
	private String name;
	private String type;
	private boolean status;
	private String description;
	private String startDate;
	private String endDate;
	private int timeToClose;
	private int priority;
	private String ticketRaisedBy;
	private int user_id;
	/*
	 * @ManyToOne(cascade=CascadeType.ALL)
	 * 
	 * @JoinColumn(name = "user_id",referencedColumnName="user_id", nullable =
	 * false) private UserEntity user;
	 */
	   
	
   
	
	 

}

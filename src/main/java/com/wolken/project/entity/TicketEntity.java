package com.wolken.project.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
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
}

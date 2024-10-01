package com.googlesheets.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity // This tells Hibernate to make a table out of this class
@Table(name="PLAYER")
public class Player {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Getter
	@Setter
	private Integer id;

	@Getter
	@Setter
	private String name;

	@Getter
	@Setter
	private String phone;
	
	@Getter
	@Setter
	private int age;

	@Getter
	@Setter
	private String batting;
	
	@Getter
	@Setter
	private String bowling;
	
}

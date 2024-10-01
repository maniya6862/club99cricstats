package com.googlesheets.demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity // This tells Hibernate to make a table out of this class
public class MatchInfo {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Getter
	@Setter
	@JsonIgnore
	private Integer id;

	@Getter
	@Setter
	@Column(name="match_date")
	private String matchDate;

	@Getter
	@Setter
	private String venue;
	
	@Getter
	@Setter
	private String opponent;

	@Getter
	@Setter
	private int mom;
	
	@Getter
	@Setter
	private String toss;

	@Getter
	@Setter
	private String result;

	@Getter
	@Setter
	private String diff;
	
	@Getter
	@Setter
	private Integer total;
}

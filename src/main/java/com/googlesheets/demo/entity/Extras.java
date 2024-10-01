package com.googlesheets.demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="extras")
public class Extras {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Getter
	@Setter
	@JsonIgnore
	private Integer id;
	
	@Getter
	@Setter
	@ManyToOne
	@JoinColumn(name = "match_id", referencedColumnName = "ID")
	private MatchInfo matchId;
	
	@Getter
	@Setter
	private Integer wides;
	
	@Getter
	@Setter
	private Integer nb;
	
	@Getter
	@Setter
	private Integer byes;
	
	@Getter
	@Setter
	private Integer others;
	
}

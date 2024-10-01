package com.googlesheets.demo.model;

import lombok.Getter;
import lombok.Setter;

public class TeamBowlingVO {
	
	@Getter
	@Setter
	private String playerName;
	
	@Getter
	@Setter
	private Integer overs;
	
	@Getter
	@Setter
	private Integer wickets;
	
	@Getter
	@Setter
	private Integer scores;
		
	@Getter
	@Setter
	private Integer wides;
	
	@Getter
	@Setter
	private Integer nbs;

	@Getter
	@Setter
	private Integer byes;
	
	@Getter
	@Setter
	private Double economy;

	@Getter
	@Setter
	private Integer maiden;

	@Getter
	@Setter
	private Integer dotBalls;
}

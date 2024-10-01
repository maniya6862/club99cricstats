package com.googlesheets.demo.model;

import lombok.Getter;
import lombok.Setter;

public class DetailsPlayerStatsPerMatchVO {

	@Getter
	@Setter
	private String date;

	@Getter
	@Setter
	private String runs;

	@Getter
	@Setter
	private String strikeRate;

	@Getter
	@Setter
	private String battingPos;

	@Getter
	@Setter
	private String ballsFaced;
	
	@Getter
	@Setter
	private String player;
	
	@Getter
	@Setter
	private String against;
	
	@Getter
	@Setter
	private String kindOut;
	
	/* Bowling data */
	@Getter
	@Setter
	private Double overs;
	
	@Getter
	@Setter
	private Integer scores;
	
	@Getter
	@Setter
	private Integer wickets;
		
	@Getter
	@Setter
	private Integer wides;
	
	@Getter
	@Setter
	private Integer nbs;
	
	@Getter
	@Setter
	private Double economy;
	
	@Getter
	@Setter
	private Integer maiden;
}

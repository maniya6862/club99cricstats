package com.googlesheets.demo.model;

import lombok.Getter;
import lombok.Setter;

public class PlayerStatsVO {

	@Getter
	@Setter
	private String runs;

	@Getter
	@Setter
	private String player;

	@Getter
	@Setter
	private String strikeRate;

	@Getter
	@Setter
	private String battingPos;

	@Getter
	@Setter
	private String avg;
	
	@Getter
	@Setter
	private String innings;
	
	@Getter
	@Setter
	private String topScore;
	
	@Getter
	@Setter
	private String boundaries;
	
	@Getter
	@Setter
	private String sixes;
	
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
	
	@Getter
	@Setter
	private Double avgInWin;

	@Getter
	@Setter
	private String partOfTeamInWin;
	
	@Getter
	@Setter
	private Double ecoInWin;
}

package com.googlesheets.demo.model;

import lombok.Getter;
import lombok.Setter;

public class TeamBattingVO {
	
	@Getter
	@Setter
	private String playerName;
	
	@Getter
	@Setter
	private Integer runs;
	
	@Getter
	@Setter
	private Integer ballsFaced;
	
	@Getter
	@Setter
	private Integer ones;
	
	@Getter
	@Setter
	private Integer twos;
	
	@Getter
	@Setter
	private Integer threes;
	
	@Getter
	@Setter
	private Integer fours;
	
	@Getter
	@Setter
	private Integer sixes;
	
	@Getter
	@Setter
	private Double strikeRate;
	
	@Getter
	@Setter
	private Integer battingPos;
	
	@Getter
	@Setter
	private String kindOut;
	
	@Getter
	@Setter
	private String dotballs;	
}

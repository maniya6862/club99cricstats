package com.googlesheets.demo.model;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

public class PlayerVO {

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
	
	@Getter
	@Setter
	private PlayerStatsVO stats;

	@Getter
	@Setter
	PlayerScatteredScoresVO scatteredScoresUser;
	
	@Getter
	@Setter
	List<DetailsPlayerStatsPerMatchVO> performance;
	
	@Getter
	@Setter
	private RunsPercentageStatsVO runsPercentageStatsVO;
}

package com.googlesheets.demo.model;

import lombok.Getter;
import lombok.Setter;

public class ScorecardVO {

	@Getter
	@Setter
	private TeamBaowlingScorecardVO teamBownling;
	
	@Getter
	@Setter
	private TeamBattingScorecardVO teamBatting;
	
	@Getter
	@Setter
	private boolean won;
	
	@Getter
	@Setter
	private String matchDate;
}

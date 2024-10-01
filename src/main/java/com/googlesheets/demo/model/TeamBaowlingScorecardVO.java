package com.googlesheets.demo.model;

import java.util.List;
import lombok.Getter;
import lombok.Setter;

public class TeamBaowlingScorecardVO {

	@Getter
	@Setter
	private List<TeamBowlingVO> teamBownling;
	
	@Getter
	@Setter
	private Extras extras;
	
	@Getter
	@Setter
	private Integer total;
	
}

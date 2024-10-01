package com.googlesheets.demo.model;

import java.util.List;
import lombok.Getter;
import lombok.Setter;

public class TeamBattingScorecardVO {

	@Getter
	@Setter
	private List<TeamBattingVO> teamBatting;
	
	@Getter
	@Setter
	private Extras extras;
	
	@Getter
	@Setter
	private Integer total;
	
}

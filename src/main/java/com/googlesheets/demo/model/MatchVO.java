package com.googlesheets.demo.model;

import lombok.Getter;
import lombok.Setter;

public class MatchVO {
	@Getter
	@Setter
	private String matchDate;

	@Getter
	@Setter
	private String venue;
	
	@Getter
	@Setter
	private String opponent;

	@Getter
	@Setter
	private String momName;
	
	@Getter
	@Setter
	private String toss;

	@Getter
	@Setter
	private String result;

}

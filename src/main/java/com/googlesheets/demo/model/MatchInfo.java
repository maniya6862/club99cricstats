package com.googlesheets.demo.model;

import lombok.Getter;
import lombok.Setter;

public class MatchInfo {
	@Getter
	@Setter
	private Integer id;

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
	private int mom;
	
	@Getter
	@Setter
	private String toss;

	@Getter
	@Setter
	private String result;

	@Getter
	@Setter
	private String diff;
	
	@Getter
	@Setter
	private Integer total;
}

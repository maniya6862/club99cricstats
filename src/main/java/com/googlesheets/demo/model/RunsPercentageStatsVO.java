package com.googlesheets.demo.model;

import lombok.Getter;
import lombok.Setter;

public class RunsPercentageStatsVO {

	@Getter
	@Setter
	private String total;
	
	@Setter
	@Getter
	private String Name;
	@Setter
	@Getter
	private Double Ones;
	@Setter
	@Getter
	private Double twos;
	@Setter
	@Getter
	private Double threes;
	@Setter
	@Getter
	private Double fours;
	@Setter
	@Getter
	private Double sixes;
	@Setter
	@Getter
	private String ballsFaced;
	@Setter
	@Getter
	private Double dots;
	
	/* Kind out */
	@Setter
	@Getter
	private Integer dnb;
	@Setter
	@Getter
	private Integer caught;
	@Setter
	@Getter
	private Integer bowled;
	@Setter
	@Getter
	private Integer notOut;
	@Setter
	@Getter
	private Integer runOut;
	@Setter
	@Getter
	private Integer stumped;
	
}

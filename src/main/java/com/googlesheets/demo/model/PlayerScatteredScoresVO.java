package com.googlesheets.demo.model;

import lombok.Getter;
import lombok.Setter;

public class PlayerScatteredScoresVO {

	@Getter
	@Setter
	private int zeroToTen;

	@Getter
	@Setter
	private int tenToTwenty;

	@Getter
	@Setter
	private int twentyToThirty;

	@Getter
	@Setter
	private int thirtyToFourty;
	
	@Getter
	@Setter
	private int fourtyToFifty;
	
	@Getter
	@Setter
	private int fiftyToSixty;
	
	@Getter
	@Setter
	private int moreThanSixty;
}

package com.googlesheets.demo.model;

import java.util.Comparator;

public class IndividualScoreSortingComparatorVO implements Comparator<PlayerVO> {

	@Override
	public int compare(PlayerVO o1, PlayerVO o2) {
		PlayerVO s1 = (PlayerVO) o1;
		PlayerVO s2 = (PlayerVO) o2;

		int s1TopIndividualScore = Integer.parseInt(s1.getStats().getTopScore());
		int s2TopIndividualScore = Integer.parseInt(s2.getStats().getTopScore());
		if (s1TopIndividualScore == s2TopIndividualScore)
			return 0;
		else if (s1TopIndividualScore > s2TopIndividualScore)
			return 1;
		else
			return -1;

	}

}

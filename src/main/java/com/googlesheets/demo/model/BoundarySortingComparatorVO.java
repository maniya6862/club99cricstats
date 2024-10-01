package com.googlesheets.demo.model;

import java.util.Comparator;

public class BoundarySortingComparatorVO implements Comparator<PlayerVO> {

	@Override
	public int compare(PlayerVO o1, PlayerVO o2) {
		PlayerVO s1 = (PlayerVO) o1;
		PlayerVO s2 = (PlayerVO) o2;

		int s1Boundaries = Integer.parseInt(s1.getStats().getBoundaries());
		int s2Boundaries = Integer.parseInt(s2.getStats().getBoundaries());
		if (s1Boundaries == s2Boundaries)
			return 0;
		else if (s1Boundaries > s2Boundaries)
			return 1;
		else
			return -1;

	}

}

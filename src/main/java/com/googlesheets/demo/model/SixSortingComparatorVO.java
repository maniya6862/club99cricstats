package com.googlesheets.demo.model;

import java.util.Comparator;

public class SixSortingComparatorVO implements Comparator<PlayerVO> {

	@Override
	public int compare(PlayerVO o1, PlayerVO o2) {
		PlayerVO s1 = (PlayerVO) o1;
		PlayerVO s2 = (PlayerVO) o2;

		int s1Sixes = Integer.parseInt(s1.getStats().getSixes());
		int s2Sixes = Integer.parseInt(s2.getStats().getSixes());
		if (s1Sixes == s2Sixes)
			return 0;
		else if (s1Sixes > s2Sixes)
			return 1;
		else
			return -1;

	}

}

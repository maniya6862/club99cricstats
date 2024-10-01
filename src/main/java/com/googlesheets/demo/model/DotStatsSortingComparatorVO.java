package com.googlesheets.demo.model;

import java.util.Comparator;

public class DotStatsSortingComparatorVO implements Comparator<PlayerVO> {

	@Override
	public int compare(PlayerVO o1, PlayerVO o2) {
		PlayerVO s1 = (PlayerVO) o1;
		PlayerVO s2 = (PlayerVO) o2;

		Double s1DotStats = (s1.getRunsPercentageStatsVO().getDots());
		Double s2DotStats = (s2.getRunsPercentageStatsVO().getDots());
		if (s1DotStats == s2DotStats)
			return 0;
		else if (s1DotStats > s2DotStats)
			return 1;
		else
			return -1;


	}

}

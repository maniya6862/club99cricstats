package com.googlesheets.demo.model;

import java.util.Comparator;

public class WicketSortingComparatorVO implements Comparator<PlayerVO> {

	@Override
	public int compare(PlayerVO o1, PlayerVO o2) {
		PlayerVO s1 = (PlayerVO) o1;
		PlayerVO s2 = (PlayerVO) o2;

		if(s1.getStats()==null || s2.getStats()==null || s1.getStats().getWickets() ==null || s2.getStats().getWickets() == null) {
			return 0;
		}

		int s1Wickets = s1.getStats().getWickets();
		int s2Wickets = s2.getStats().getWickets();
		if (s1Wickets == s2Wickets)
			return 0;
		else if (s1Wickets > s2Wickets)
			return 1;
		else
			return -1;

	}

}

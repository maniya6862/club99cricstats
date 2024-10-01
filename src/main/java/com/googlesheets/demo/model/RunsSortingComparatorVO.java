package com.googlesheets.demo.model;

import java.util.Comparator;

public class RunsSortingComparatorVO implements Comparator<PlayerVO> {

	@Override
	public int compare(PlayerVO o1, PlayerVO o2) {
		PlayerVO s1 = (PlayerVO) o1;
		PlayerVO s2 = (PlayerVO) o2;
		int s1Runs =0;
		int s2Runs =0;
		PlayerStatsVO stats1 = s1.getStats();
		if(null!=stats1) {			
			s1Runs=Integer.parseInt(stats1.getRuns());
		}
		PlayerStatsVO stats2 = s2.getStats();
		if(null!=stats2) {
			s2Runs=Integer.parseInt(stats2.getRuns());
		}
		
		if (s1Runs == s2Runs)
			return 0;
		else if (s1Runs > s2Runs)
			return 1;
		else
			return -1;

	}

}

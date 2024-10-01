package com.googlesheets.demo.model;

import java.util.Comparator;

public class BattingPosSortingComparatorVO implements Comparator<TeamBattingVO> {

	@Override
	public int compare(TeamBattingVO o1, TeamBattingVO o2) {
		TeamBattingVO s1 = (TeamBattingVO) o1;
		TeamBattingVO s2 = (TeamBattingVO) o2;

		int s1WinContribution = (s1.getBattingPos());
		int s2WinContribution = (s2.getBattingPos());
		if (s1WinContribution == s2WinContribution)
			return 0;
		else if (s1WinContribution > s2WinContribution)
			return 1;
		else
			return -1;


	}

}

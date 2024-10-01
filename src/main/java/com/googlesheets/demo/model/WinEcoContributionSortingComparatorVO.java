package com.googlesheets.demo.model;

import java.util.Comparator;

public class WinEcoContributionSortingComparatorVO implements Comparator<PlayerVO> {

	@Override
	public int compare(PlayerVO o1, PlayerVO o2) {
		PlayerVO s1 = (PlayerVO) o1;
		PlayerVO s2 = (PlayerVO) o2;

		Double s1WinContribution = (s1.getStats().getEcoInWin());
		Double s2WinContribution = (s2.getStats().getEcoInWin());
		if (s1WinContribution == s2WinContribution)
			return 0;
		else if (s1WinContribution > s2WinContribution)
			return 1;
		else
			return -1;


	}

}

package com.googlesheets.demo.model;

import java.util.Comparator;

public class EconomySortingComparatorVO implements Comparator<PlayerVO> {

	@Override
	public int compare(PlayerVO o1, PlayerVO o2) {
		PlayerVO s1 = (PlayerVO) o1;
		PlayerVO s2 = (PlayerVO) o2;
		
		Double s1TopEconomy = (s1.getStats().getEconomy());
		Double s2TopEconomy = (s2.getStats().getEconomy());
		if (s1TopEconomy == s2TopEconomy)
			return 0;
		else if (s1TopEconomy > s2TopEconomy)
			return 1;
		else
			return -1;
	}

}

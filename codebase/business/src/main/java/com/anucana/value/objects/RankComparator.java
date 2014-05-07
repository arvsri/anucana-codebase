package com.anucana.value.objects;

import java.util.Comparator;


public class RankComparator implements Comparator<IRankable>{

	@Override
	public int compare(IRankable r1, IRankable r2) {
		return r2.getTotalRank().compareTo(r1.getTotalRank());
	}

}

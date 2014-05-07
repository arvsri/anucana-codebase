package com.anucana.value.objects;

import org.apache.commons.collections.Closure;


public class BestMatchClosure implements Closure {

	private String matchParam = null;
	private MatchRank highestRank = MatchRank.NO_MATCH;
	
	public BestMatchClosure(String matchParam){
		this.matchParam = matchParam.toUpperCase();
	}
	
	@Override
	public void execute(Object input) {
		MatchRank matchRank = getMatchRank((CommunityKeyword)input);
		if(highestRank.getRankValue() < matchRank.getRankValue()){
			highestRank = matchRank;
		}
	}
	
	private MatchRank getMatchRank(CommunityKeyword input) {
		String keyWord = input.getKeyword().toUpperCase();
		if (keyWord.equals(matchParam)) {
			return MatchRank.USER_KEYWORD_EXACT_MATCH;
		} else if (keyWord.startsWith(matchParam)
				|| matchParam.startsWith(keyWord)) {
			return MatchRank.START_WITH_KEYWORD;
		} else if (keyWord.endsWith(matchParam) || matchParam.endsWith(keyWord)) {
			return MatchRank.END_WITH_KEYWORD;
		} else if (keyWord.contains(matchParam) || matchParam.contains(keyWord)) {
			return MatchRank.HAS_KEYWORD;
		}
		return MatchRank.NO_MATCH;
	}

	public MatchRank getHighestRank() {
		return highestRank;
	}

}

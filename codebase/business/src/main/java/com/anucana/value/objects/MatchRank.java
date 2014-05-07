package com.anucana.value.objects;

public enum MatchRank {

	USER_KEYWORD_EXACT_MATCH(8,"Exact match with user set keyword"),
	
	SYSTEM_KEYWORD_EXACT_MATCH(5,"Exact match with system set keyword"),
	
	START_WITH_KEYWORD(3,"Starts with the keyword"),
	
	END_WITH_KEYWORD(2,"Ends with the keyword"),
	
	HAS_KEYWORD(1,"In between the keyword"),
	
	NO_MATCH(0,"Not matched");
	
	
	private Integer rankValue;
	private String desciption;
	
	
	private MatchRank(int rankValue, String description){
		this.rankValue = rankValue;
		this.desciption = description;
	}


	public int getRankValue() {
		return rankValue;
	}


	public String getDesciption() {
		return desciption;
	}
}

package com.ecw.cricket.match;

import java.util.HashMap;
import java.util.Map;

public class MatchRepository {
	
	private Map<Integer,Match> matches =  new HashMap<Integer, Match>();
	
	public void defineMap(Match match){
		matches.put(match.getMatchId(), match);
	}

}

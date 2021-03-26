package com.ecw.cricket.score;

import java.util.HashMap;
import java.util.Map;

import com.ecw.cricket.Team.Team;

public class ScoringRepository {
	
	private Map<Integer,Score> scores = new HashMap<>();
	
	public void score(int teamId,Score score){
		scores.put(teamId, score);
	}
	
	public void downWicket(int teamId, Score score){
		scores.put(teamId, score);
	}

	public Score getScore(Team team){
		return scores.get(team.getTeamId());
	}
}

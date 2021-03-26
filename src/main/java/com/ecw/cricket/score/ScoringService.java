package com.ecw.cricket.score;

import com.ecw.cricket.Team.Team;
import com.ecw.cricket.exception.InvalidScoreException;
import com.ecw.cricket.exception.InvalidWicketException;

public interface ScoringService {
	
	public void score(Team team, int runs) throws InvalidScoreException;
	public void downWicket(Team team, int wicket) throws InvalidWicketException;
	public Score getScore(Team team);
}

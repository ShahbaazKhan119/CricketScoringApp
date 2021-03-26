package com.ecw.cricket.match;

import java.util.Date;

public class Match {

	private int matchId;
	private Date matchDate;
	private int firstTeamId;
	private int secondTeamId;
	
	public int getMatchId() {
		return matchId;
	}
	public void setMatchId(int matchId) {
		this.matchId = matchId;
	}
	public Date getMatchDate() {
		return matchDate;
	}
	public void setMatchDate(Date matchDate) {
		this.matchDate = matchDate;
	}
	public int getFirstTeamId() {
		return firstTeamId;
	}
	public void setFirstTeamId(int firstTeamId) {
		this.firstTeamId = firstTeamId;
	}
	public int getSecondTeamId() {
		return secondTeamId;
	}
	public void setSecondTeamId(int secondTeamId) {
		this.secondTeamId = secondTeamId;
	}
	
	
	
}

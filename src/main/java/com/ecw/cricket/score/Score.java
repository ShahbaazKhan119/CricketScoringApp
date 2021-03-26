package com.ecw.cricket.score;

//Entity is used to store Score information
public class Score {
	
	private int id;
	private int teamId;
	private int totalRuns;
	private int ballCount;
	private int dotBallCount;
	private int fourCount;
	private int sixCount;
	private int wicketCount;
	
	

	public Score(int teamId, int totalRuns, int ballCount, int fourCount, int wicketCount) {
		super();
		this.teamId = teamId;
		this.totalRuns = totalRuns;
		this.ballCount = ballCount;
		this.fourCount = fourCount;
		this.sixCount = sixCount;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getTeamId() {
		return teamId;
	}
	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}
	public int getTotalRuns() {
		return totalRuns;
	}
	public void setTotalRuns(int totalRuns) {
		this.totalRuns += totalRuns;
	}
	
	public int getBallCount() {
		return ballCount;
	}
	public void setBallCount(int ballCount) {
		this.ballCount = ballCount;
	}
	public int getDotBallCount() {
		return dotBallCount;
	}
	public void setDotBallCount(int dotBallCount) {
		this.dotBallCount = dotBallCount;
	}
	public int getFourCount() {
		return fourCount;
	}
	public void setFourCount(int fourCount) {
		this.fourCount = fourCount;
	}
	public int getWicketCount() {
		return wicketCount;
	}
	public void setWicketCount(int wicketCount) {
		this.wicketCount = wicketCount;
	}
	
	public int getSixCount() {
		return sixCount;
	}
	public void setSixCount(int sixCount) {
		this.sixCount = sixCount;
	}	

}

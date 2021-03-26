package com.ecw.cricket.tournament;

import java.util.List;

import com.ecw.cricket.Team.Team;

/**
 * @author Shahbaaz Khan
 * 
 */
public class Tournament {

	private int tournamentId;
	private String tournamentName;
	private List<TeamGroups> groups;
	
	public int getTournamentId() {
		return tournamentId;
	}
	public void setTournamentId(int tournamentId) {
		this.tournamentId = tournamentId;
	}
	public String getTournamentName() {
		return tournamentName;
	}
	public void setTournamentName(String tournamentName) {
		this.tournamentName = tournamentName;
	}
	public List<TeamGroups> getGroups() {
		return groups;
	}
	public void setGroups(List<TeamGroups> groups) {
		this.groups = groups;
	}
}

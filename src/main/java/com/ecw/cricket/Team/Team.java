package com.ecw.cricket.Team;

import java.util.ArrayList;
import java.util.List;

import com.ecw.cricket.player.Player;

// Entity to store team information
public class Team {
	
	private int teamId;
	private String teamName;
	List<Player> players = new ArrayList();
	
	public Team(String teamName,List<Player> players){
		this.teamName = teamName;
		this.players = players;
	}
	
	public int getTeamId() {
		return teamId;
	}
	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public List<Player> getPlayers() {
		return players;
	}
	public void setPlayers(List<Player> players) {
		this.players = players;
	}
}

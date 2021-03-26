package com.ecw.cricket.Team;

import java.util.HashMap;
import java.util.Map;

public class TeamRepository {
	
    private Map<Integer, Team> teams = new HashMap();

	
	public void save(Team team){
		teams.put(team.getTeamId(), team);
	}
	
	public Team getTeam(int teamId){
		return teams.get(teamId);
	}

}

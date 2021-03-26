package com.ecw.cricket.tournament;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.ecw.cricket.Team.Team;

public class TournamentRepository {
	
	private Map<Integer,Tournament> tournaments = new HashMap<>();
	
	public void createGroup(Tournament tounament,List<TeamGroups> group){
		tounament.setGroups(group);
	}
	
	public void save(Tournament tournament){
		tournaments.put(tournament.getTournamentId(),tournament);
	}
	

}

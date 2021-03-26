package com.ecw.cricket.tournament;

import java.util.ArrayList;
import java.util.List;

import com.ecw.cricket.Team.Team;
import com.ecw.cricket.Team.TeamServiceImpl;

public class TournamentServiceImpl {
	
	TeamServiceImpl teamServiceImpl;
	List<TeamGroups> groups = new ArrayList<>();
	TournamentRepository tournamentRepository;
	public TournamentServiceImpl(TeamServiceImpl teamServiceImpl,TournamentRepository tournamentRepository) {
		super();
		this.teamServiceImpl = teamServiceImpl;
		this.tournamentRepository = tournamentRepository;
	}

	public void createGroup(TeamGroups group,int teamId)
	{
		List<Team> teams = new ArrayList<Team>();
		teams.add(teamServiceImpl.getTeam(teamId));
		group.setTeams(teams);
		groups.add(group);
		Tournament tournament = new Tournament();
		tournament.setTournamentName("Worldcup");
		tournament.setGroups(groups);
		tournamentRepository.save(tournament);
	}

}

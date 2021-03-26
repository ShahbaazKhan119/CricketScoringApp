package com.ecw.cricket.Team;

import java.util.ArrayList;
import java.util.List;

import com.ecw.cricket.player.Player;
import com.ecw.cricket.player.PlayerServiceImpl;

public class TeamServiceImpl implements TeamService {

	private PlayerServiceImpl playerService;
	private TeamRepository teamRepository;
	
	
	public TeamServiceImpl(PlayerServiceImpl playerService, TeamRepository teamRepository) {
		super();
		this.playerService = playerService;
		this.teamRepository = teamRepository;
	}
	
	public void addTeam(String teamName){
		
		List<Player> players = new ArrayList();
		
		Player kohli = playerService.getPlayer(1);
		Player hardik = playerService.getPlayer(2);
		Player dhoni = playerService.getPlayer(3);
		
		players.add(kohli);
		players.add(hardik);
		players.add(dhoni);
		
		teamRepository.save(new Team(teamName, players));
	}

	@Override
	public Team getTeam(int teamId) {
		return teamRepository.getTeam(teamId);
		
	}
	
	
}

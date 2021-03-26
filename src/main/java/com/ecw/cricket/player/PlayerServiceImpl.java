package com.ecw.cricket.player;

import java.util.HashMap;
import java.util.Map;

public class PlayerServiceImpl implements PlayerService {

	public static final Player kohli = PlayerBuilder.aBatsMan().withId(1).withName("Virat Kohli").build();
	public static final Player hardik = PlayerBuilder.aBowler().withId(2).withName("Hardik Pandya").build();
	public static final Player dhoni = PlayerBuilder.aWicketKeeper().withId(3).withName("MS Dhoni").build();

	Map<Integer,Player> players = new HashMap<Integer, Player>(){
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		{
			put(kohli.getPlayerId(), kohli);
			put(hardik.getPlayerId(), hardik);
			put(dhoni.getPlayerId(), dhoni);
		}
	};
	
	private PlayerRepository playerRepository; 
	
	public Player getPlayer(Integer playerId){
		return players.get(playerId);
	}
	
	public void addPlayer(Player player)
	{
		playerRepository.save(player);
	}

}

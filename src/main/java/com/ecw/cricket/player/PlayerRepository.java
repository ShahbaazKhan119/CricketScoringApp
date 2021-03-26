package com.ecw.cricket.player;

import java.util.HashMap;
import java.util.Map;

public class PlayerRepository {
	
	public Map<Integer,Player> players = new HashMap<Integer, Player>();

	public void save(Player player){
		players.put(player.getPlayerId(), player);
	}
	
}

package com.ecw.cricket.player;

public interface PlayerService {

	Player getPlayer(Integer playerId);
	
	void addPlayer(Player player);
	
}

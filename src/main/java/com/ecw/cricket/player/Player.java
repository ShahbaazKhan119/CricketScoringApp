package com.ecw.cricket.player;

// Entity to store player information
public class Player {
	
	private int playerId;
	private String playerName;
	private PlayerType playerType;
	
	
	/**
	 * 
	 * 
	 * @param playerId
	 * @param playerName
	 * @param playerType
	 */
	public Player(int playerId,String playerName,PlayerType playerType) {
		super();
		this.playerId = playerId;
		this.playerName = playerName;
		this.playerType=playerType;
	}
	
	public int getPlayerId() {
		return playerId;
	}
	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	
	
	

}

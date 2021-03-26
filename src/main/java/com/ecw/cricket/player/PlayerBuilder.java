package com.ecw.cricket.player;

public class PlayerBuilder {
	
	private PlayerType playerType = PlayerType.BATSMAN;
	private String playerName = "";
	private int playerId;
	
	private PlayerBuilder(PlayerType playerType) {
		this.playerType = playerType;
	}

	public static PlayerBuilder aBatsMan() {
        return new PlayerBuilder(PlayerType.BATSMAN);
    }
	
	public static PlayerBuilder aBowler() {
        return new PlayerBuilder(PlayerType.BOWLER);
    }
	
	public static PlayerBuilder aWicketKeeper() {
        return new PlayerBuilder(PlayerType.WICKET_KEEPER);
    }
	
	public PlayerBuilder withId(int playerId){
		this.playerId = playerId;
		return this;
	}
	
	public PlayerBuilder withName(String playerName){
		this.playerName = playerName;
		return this;
	}

	public Player build(){
		return new Player(playerId,playerName, playerType);
	}

}

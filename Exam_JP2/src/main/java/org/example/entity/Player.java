package org.example.entity;

public class Player {
	private int PlayerId;
    private int NationalId;
    private String PlayerName;
    private int HighScore;
    private int Level;

    public Player() {
    }

	public Player(int nationalId, String playerName, int highScore, int level) {
		NationalId = nationalId;
		PlayerName = playerName;
		HighScore = highScore;
		Level = level;
	}

	public Player(int playerId, int nationalId, String playerName, int highScore, int level) {
		PlayerId = playerId;
		NationalId = nationalId;
		PlayerName = playerName;
		HighScore = highScore;
		Level = level;
	}

	public int getPlayerId() {
		return PlayerId;
	}

	public void setPlayerId(int playerId) {
		PlayerId = playerId;
	}

	public int getNationalId() {
		return NationalId;
	}

	public void setNationalId(int nationalId) {
		NationalId = nationalId;
	}

	public String getPlayerName() {
		return PlayerName;
	}

	public void setPlayerName(String playerName) {
		PlayerName = playerName;
	}

	public int getHighScore() {
		return HighScore;
	}

	public void setHighScore(int highScore) {
		HighScore = highScore;
	}

	public int getLevel() {
		return Level;
	}

	public void setLevel(int level) {
		Level = level;
	}

	@Override
	public String toString() {
		return "Player{" +
				"PlayerId=" + PlayerId +
				", NationalId=" + NationalId +
				", PlayerName='" + PlayerName + '\'' +
				", HighScore=" + HighScore +
				", Level=" + Level +
				'}';
	}
}

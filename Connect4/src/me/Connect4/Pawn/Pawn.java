package me.Connect4.Pawn;

public class Pawn {
	/**
	 * The graphic pawn of the game
	 */
	private int PlayerNumber;

	public Pawn(int PlayerNumber) {
		this.PlayerNumber = PlayerNumber;
	}

	public int getPlayerNumber() {
		return PlayerNumber;
	}

	public void setPlayerNumber(int playerNumber) {
		PlayerNumber = playerNumber;
	}

}

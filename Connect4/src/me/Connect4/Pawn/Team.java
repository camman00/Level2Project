package me.Connect4.Pawn;

public class Team {
	private int TeamNum;
	/**
	 * 
	 * @param TeamNum
	 * TeamNum represents the color of the team and indicates it throughout the code
	 * 0 = Red
	 * 1 = Black
	 * Red always plays first!
	 */
	public Team(int TeamNum) {
		this.setTeamNum(TeamNum);
	}
	public int getTeamNum() {
		return TeamNum;
	}
	public void setTeamNum(int teamNum) {
		TeamNum = teamNum;
	}

}

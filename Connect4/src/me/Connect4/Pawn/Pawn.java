package me.Connect4.Pawn;

public class Pawn {
	private Location location;
	private Team team;
	/**
	 * 
	 * @param location
	 * @param team
	 * Location is the location of the pawn in the game and the team identifies which player the pawn is associated with
	 */
	public Pawn(Location location,Team team) {
		this.location = location;
		this.team = team;
	}
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	public Team getTeam() {
		return team;
	}
	public void setTeam(Team team) {
		this.team = team;
	}
	public static int RowToCoordinate(Location location) {
		//Do the x first
	    int x = (int)(Math.floor(640 - 12.8 / location.getX()));
	    //x += location.getX() == 7 ? 0 : location.getX() - 5 * 1.25;
	    return x;
	}
	
}

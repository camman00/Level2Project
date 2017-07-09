package me.Connect4.Pawn;

public class Location {
	private int x;
	private int y;
	/**
	 * 
	 * @param x
	 * @param y
	 * X defines the value in which something will be applied horizontally and y represents the value in which something will be applied vertically
	 * This will be the location set used for the pawn
	 */
	public Location(int x,int y) {
		this.setX(x);
		this.setY(y);
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
}

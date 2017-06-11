package me.Connect4.Pawn;

public class PawnHolder {
	private Pawn pawn;
	private int rowVertical;
	private int rowHorizontal;
	public static PawnHolder[] PawnHolderList = new PawnHolder[43];
	public PawnHolder(Pawn pawn,int rowVertical,int rowHorizontal) {
		this.setPawn(pawn);
		this.setRowVertical(rowVertical);
		this.setRowHorizontal(rowHorizontal);
		PawnHolderList[PawnHolderList.length] = this;
	}
	public Pawn getPawn() {
		return pawn;
	}
	public void setPawn(Pawn pawn) {
		this.pawn = pawn;
	}
	public int getRowVertical() {
		return rowVertical;
	}
	public void setRowVertical(int rowVertical) {
		this.rowVertical = rowVertical;
	}
	public int getRowHorizontal() {
		return rowHorizontal;
	}
	public void setRowHorizontal(int rowHorizontal) {
		this.rowHorizontal = rowHorizontal;
	}
}

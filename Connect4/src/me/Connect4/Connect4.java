package me.Connect4;

import javax.swing.JFrame;

public class Connect4 {
	private JFrame frame;
	private Connect4Panel connect4Panel;

	/*
	 * 1x Game board $ 1x Red pawn 1x Blue pawn $ = Complete
	 */
	public Connect4() {
		frame = new JFrame();
		connect4Panel = new Connect4Panel();
		frame.add(connect4Panel);
		frame.setTitle("Connect 4");
		frame.setVisible(true);
		frame.setSize(connect4Panel.getWidth(), connect4Panel.getHeight() + 22);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(3 /* Yea bru i figure dis out maaaaaaaaaan */);
	}

	public static void main(String[] args) {
		Connect4 connect4 = new Connect4();
	}
}

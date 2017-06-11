package me.Connect4;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Connect4Panel extends JPanel {
	private BufferedImage Connect4PanelImage;
	private BufferedImage test;

	public Connect4Panel() {
		try {
			Connect4PanelImage = ImageIO.read(new File("src/Connect4Board.png"));
			test = ImageIO.read(new File("src/redpawn.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	protected void paintComponent(Graphics g) {
		g.drawImage(Connect4PanelImage, 0, 0, this);
		g.drawImage(test, (640 / 7) - 70 - 6, 6, this);
		//640/7 = The lenght -70 is compensation and -6 is a graphic porporiton fix
		repaint();
	}

	public int getWidth() {
		return 640;
	}

	public int getHeight() {
		return 480;
	}
	

}

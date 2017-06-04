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

	public Connect4Panel() {
		try {
			Connect4PanelImage = ImageIO.read(new File("src/Connect4Board.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	protected void paintComponent(Graphics g) {
		g.drawImage(Connect4PanelImage, 0, 0, this);
		repaint();
	}

	public int getWidth() {
		return Connect4PanelImage.getWidth();
	}

	public int getHeight() {
		return Connect4PanelImage.getHeight();
	}

}

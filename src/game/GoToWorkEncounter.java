package game;

import java.awt.Color;
import java.awt.Graphics;

public class GoToWorkEncounter {

	private int obX;
	private int obY;
	private int obW;
	private int obH;
	
	
	
	
	
	
	GoToWorkEncounter(int x, int y, int w, int h){
		obY = y;
		obX = x;
		obW = w;
		obH = h;
	}
	
	public void draw(Graphics g) {
		g.setColor(Color.GREEN);
		g.fillRect(obX, obY, obW, obH);
	}
	
	
	
	
	
	
	
	
	
	
	
}

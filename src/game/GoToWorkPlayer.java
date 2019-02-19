package game;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Window;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.peer.MouseInfoPeer;

public class GoToWorkPlayer  implements KeyListener{

	private int hp;
	private int x;
	private int y;
	private int w;
	private int h;
	
	
	GoToWorkPlayer(){
	hp = 100;
	x = 100;
	y = 400;
	w = 50;
	h = 50;
		
	}
	
	
	
	public void draw(Graphics g) {
		g.setColor(Color.RED);
		g.fillRect(x, y, w, h);
		
		
		
	}
	
	//coordinate change methods
	public void playerMoveRight() {
		
		x += 10 ;
	}
	public void playerMoveLeft() {
		
		x -= 10;
	}
	public void playerMoveUp() {
		y -= 10;
	}
	public void playerMoveDown() {
		y += 10;
	}
	public void playerXResetRight() {
		x = 100;
	}
	public void playerXResetLeft() {
		x = 1;
	}
	public void stopYHigh() {
		y = 1;
	}
	public void stopYLow() {
		
		y = 740;
	}
	
	
	
	
	
	
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
			}
	

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	
	
	
		public int getHp() {
		
		return hp;
		}
		public int getX() {
			return x;
		}
		public int getY() {
			return y;
		}
		public int getW() {
			return w;
		}
		public int getH() {
			return h;
		}
		public int setHp(int heal) {
			hp = heal;
			return hp;
		}
		public int setX(int xs) {
			x = xs;	
			return x;
		}
		public int setY(int ys) {
			y = ys;
			return y;
		}
			
}

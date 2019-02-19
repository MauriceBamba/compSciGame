package game;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class GoToWork extends JPanel implements KeyListener, ActionListener{
	JFrame frame = new JFrame();
	private final int HEIGHT = 1080;
	private final int WIDTH = 1920;
	public Timer time = new Timer(60/1000, this);
	GoToWorkPlayer player = new GoToWorkPlayer();
	ArrayList <GoToWorkEncounter>  encounters = new ArrayList <GoToWorkEncounter>();
	

	
	
	
	public static void main(String[] args) {
		GoToWork gtw = new GoToWork();
		gtw.fillEncounters();
		gtw.randEncPos();
		gtw.run();
		
	} 
	
	
	public void run() {
	frame.setSize(WIDTH, HEIGHT);
	frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
	frame.add(this);
	frame.setVisible(true);
	frame.addKeyListener(this);
	time.start();
	
	}
	public void fillEncounters() {
	encounters.add(new GoToWorkEncounter(100, 100, 100, 100));
	encounters.add(new GoToWorkEncounter(500, 100, 100, 100));
	}
	
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		drawGameState(g);
		
		
	}
	
	
	public void drawGameState(Graphics g) {
		player.draw(g);
		
		for(GoToWorkEncounter gtwe : encounters) {
			gtwe.draw(g);
		}
		
		
		if(player.getX() >= 1300) {
			player.playerXResetRight();
		}
		if(player.getY() <= 0) {
			player.stopYHigh();
		}
		if(player.getY() >= 741) {
			player.stopYLow();
		}
		if(player.getX() <= 0) {
			player.playerXResetLeft();
		}
	}
	
	private void randEncPos() {
	
		for(int i = 0; i < 100; i++) {
			int randint = 1 + (((int)Math.random() * 100));
			System.out.println(randint);
		}
	}
	
	
	
	
	
	
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		repaint();
		
	}


	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
		
	}


	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if(e.getKeyCode() == KeyEvent.VK_D) {
			player.playerMoveRight();
		}
		if(e.getKeyCode() == KeyEvent.VK_A) {
			player.playerMoveLeft();
		}
		if(e.getKeyCode() == KeyEvent.VK_W) {
			player.playerMoveUp();
		}
		if(e.getKeyCode() == KeyEvent.VK_S) {
			player.playerMoveDown();
		}
		if(e.getKeyCode() == KeyEvent.VK_ESCAPE) {
			frame.dispose();
			time.stop();
			
		}
	}


	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	}


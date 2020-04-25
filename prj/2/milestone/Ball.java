import java.awt.Color;
import java.awt.Graphics;

public class Ball {
	public static final int SIZE=16;
	private int x,y;
	private int xVEL,yVEL;//either 1 or -1
	private int speed=5;
	public Ball() {
		reset();
	}
	private void reset() {
		//initial position
		x=Game.WIDTH/2-SIZE/2;
		y=Game.HEIGHT-65-SIZE/2;
		yVEL=1;
		xVEL=Game.sign(Math.random()*2.0-1);
	}
	public void changeYDir() {
		yVEL *=-1;
	}
	public void changeXDir() {
		xVEL *=-1;
	}
	public void draw(Graphics g) {
		g.setColor(Color.white);
		g.fillRect(x,y,SIZE,SIZE);
		
	}
	
}

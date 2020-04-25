import java.awt.Color;
import java.awt.Graphics;

public class Paddle {
	private int x,y;
	private int vel=0;
	private int speed = 10;
	private int width=85,height =10;
	private int score =0;
	private Color color;
	
	public Paddle(Color c) {
		color=c;
		
		x=Game.WIDTH/2-width/2;
		y=730;
	}
	public void addPoint() {
		score++;
	}
	public void draw(Graphics g) {
		//draw paddle
		g.setColor(color);
		g.fillRect(x,y,width,height);
		//draw score
		
	}
	
}

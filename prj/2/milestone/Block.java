import java.awt.Color;
import java.awt.Graphics;

public class Block {
	private int x,y;
	private int WIDTH=100;
	private int HEIGHT=30;
	private boolean alive;
	
	public Block(int x,int y) {
		this.x=x;
		this.y=y;
		alive=true;
	}
	public void draw(Graphics g) {
		//draw paddle
		g.setColor(Color.red);
		g.fillRect(x,y,WIDTH,HEIGHT);
		//draw score
		
	}
}

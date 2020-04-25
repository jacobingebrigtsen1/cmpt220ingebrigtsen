import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferStrategy;

public class Game extends Canvas implements Runnable {
	private static final long serialVersionUID = -8921419424614180143L;
	public static final int WIDTH = 500;
	public static final int HEIGHT = 750;
	
	public boolean running=false;
	private Thread gameThread;
	
	private Ball ball;
	private Paddle paddle;
	private Block block1;private Block block2;private Block block3;private Block block4;
	private Block block5;private Block block6;private Block block7;private Block block8;
	
	
	public Game(){
		 
		canvasSetup();
		initalize();
		
		new Window("Brick Breaker",this);
	}

	private void initalize() {
		//initalize ball
		ball=new Ball();
		//initalize paddle
		paddle=new Paddle(Color.blue);
		//initalize bricks
		block1 = new Block(0,0);block2 = new Block(125,0);block3 = new Block(250,0);block4 = new Block(375,0);
		block5 = new Block(25,100);block6 = new Block(150,100);block7 = new Block(275,100);block8 = new Block(400,100);
		
	}

	private void canvasSetup() {
		this.setPreferredSize(new Dimension(WIDTH,HEIGHT));
		this.setMaximumSize(new Dimension(WIDTH,HEIGHT));
		this.setMinimumSize(new Dimension(WIDTH,HEIGHT));
		
	}

	@Override
	public void run() {
		this.requestFocus();
		long lastTime = System.nanoTime();
		double amountOfTicks=60.0;
		double ns=1000000000 / amountOfTicks;
		double delta=0;
		long timer = System.currentTimeMillis();
		int frames=0;
		while(running) {
			long now=System.nanoTime();
			delta += (now-lastTime)/ns;
			lastTime=now;
			while(delta >=1) {
				update();
				delta--;
			}
			if(running) draw();
			frames++;
			if(System.currentTimeMillis()-timer>1000) {
				timer+=1000;
				System.out.println("FPS:"+frames);
			}
		}
		stop();
		
	}

	private void update() {
		//update ball
		
		//update paddles
	}

	private void draw() {
		//initilize drawing tools
		BufferStrategy buffer = this.getBufferStrategy();
		
		if(buffer==null) {
			this.createBufferStrategy(3);
			return;
		}
		Graphics g=buffer.getDrawGraphics();
		//draw backgrounds
		drawBackground(g);
		//draw ball
		ball.draw(g);
		//draw paddles and score
		paddle.draw(g);
		//draw bricks
		block1.draw(g);block2.draw(g);block3.draw(g);block4.draw(g);
		block5.draw(g);block6.draw(g);block7.draw(g);block8.draw(g);
		//dispose, Actually draw
		g.dispose();
		buffer.show();
	}
	public void drawBackground(Graphics g) {
		//black background
		g.setColor(Color.black);
		g.fillRect(0,0,WIDTH,HEIGHT);
	}

	public void start() {
		gameThread = new Thread(this);
		gameThread.start();
		running=true;
	}
	public void stop() {
		try {
			gameThread.join();
			running=false;
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public static int sign(double d) {
		if (d <= 0)
			return -1;
		return 1;
	}
	
	public static void main(String[] args) {
		new Game();
	}
}

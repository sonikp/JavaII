import java.awt.Color;

public class Chapt_3_exercises extends Turtle
{
	public Chapt_3_exercises(int x, int y, ModelDisplay modelDisplayer) 
	{
		super(x, y, modelDisplayer);
	}

	// ex 3.11 draw rectangle passing size parameters
	public void drawRectangleSize(int length, int bredth)
	{
		this.forward(length);
		this.turnRight();
		this.forward(bredth);
		this.turnRight();
		this.forward(length);
		this.turnRight();
		this.forward(bredth);
		this.turnRight();
	}
	
	// ex 3.12 draw hexagon passing dimensions
	public void drawHexagon(int length, double angle)
	{
		this.forward(length);
		this.turn(angle);
		this.forward(length);
		this.turn(angle);
		this.forward(length);
		this.turn(angle);
		this.forward(length);
		this.turn(angle);
		this.forward(length);
		this.turn(angle);
		this.forward(length);
		this.turn(angle);
	}
	
	public void drawPentagon(int length, double angle)
	{
		this.forward(length);
		this.turn(angle);
		this.forward(length);
		this.turn(angle);
		this.forward(length);
		this.turn(angle);
		this.forward(length);
		this.turn(angle);
		this.forward(length);
		this.turn(angle);
	}
	
	public void drawEquilateralTriangle(int length, double angle)
	{
		this.forward(length);
		this.turn(angle);
		this.forward(length);
		this.turn(angle);
		this.forward(length);
		this.turn(angle);
	}
	
	public void drawStar(int length, int point, int valley)
	{
		this.turn(18);
		this.forward(length);
		this.turn(point);
		this.forward(length);
		this.turn(-valley);
		this.forward(length);
		this.turn(point);
		this.forward(length);
		this.turn(-valley);
		this.forward(length);
		this.turn(point);
		this.forward(length);
		this.turn(-valley);
		this.forward(length);
		this.turn(point);
		this.forward(length);
		this.turn(-valley);
		this.forward(length);
		this.turn(point);
		this.forward(length);
		this.turn(-valley);
		this.forward(length);
	}
	
	public static void main(String[] args)
	{
		System.out.println("REMOVED: random change");
		System.out.println("REMOVED: Another random change");
		System.out.println("ADDED: Another (NEW) random change, with a different");
		World starWorld = new World();
		Chapt_3_exercises starTurtle = new Chapt_3_exercises(320,240,starWorld);
		starTurtle.drawStar(100, 144, 72);
		
		
		// create objects
		World worldObj = new World();
		Chapt_3_exercises turtle = new Chapt_3_exercises(320,240,worldObj);
		
		// movement
		turtle.penUp();
		turtle.forward(100);
		turtle.penDown();
		turtle.drawRectangleSize(30, 60);
		turtle.penUp();
		
		turtle.moveTo(100, 100);
		turtle.penDown();
		turtle.setColor(Color.cyan);
		turtle.drawHexagon(50, 60);
		turtle.penUp();
		
		turtle.moveTo(300, 321);
		turtle.penDown();
		turtle.setColor(Color.orange);
		turtle.drawPentagon(50, 72);
		turtle.penUp();
		
		turtle.moveTo(95, 421);
		turtle.penDown();
		turtle.setColor(Color.red);
		turtle.drawEquilateralTriangle(60, 120);
		turtle.penUp();
		

	}
}
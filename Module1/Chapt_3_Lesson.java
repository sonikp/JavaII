public class Chapt_3_Lesson extends Turtle
{
	
	// constructors
	public Chapt_3_Lesson(int x, int y, ModelDisplay modelDisplayer) 
	{
		super(x, y, modelDisplayer);
		// TODO Auto-generated constructor stub
	}

	public void drawSquare()
	{
		this.forward(200);
		this.turnRight();
		this.forward(200);
		this.turnRight();
		this.forward(200);
		this.turnRight();
		this.forward(200);
		this.turnRight();
	
	}
	

	
	public static void main(String[] args)
	{
		// 3.6.1  ---Start---
		System.out.println(new Picture());
		String pictureFile = "/Users/Shared/Java-Libraries/CourseCD/mediasources/beach.jpg";
		String soundFile = "/Users/Shared/Java-Libraries/CourseCD/mediasources/croak.wav";
		Picture pictureDisplay = new Picture(pictureFile);
		Sound effect = new Sound(soundFile);
		pictureDisplay.show();
		effect.play();

		
		//System.out.println(FileChooser.pickAFile());
		
		/*
		// 3.3.2  ---Start---
		System.out.println("New world ..." + new World());
		World worldObj = new World();
		System.out.println(worldObj);
		Turtle turtle1 = new Turtle(150,200,worldObj);
		Turtle turtle2 = new Turtle(350,200,worldObj);
		Turtle turtle3 = new Turtle(250,300,worldObj);
		System.out.println(turtle1 + "\n" + turtle2);
		
		turtle1.forward(100);
		turtle1.turnRight();
		turtle1.forward(100);
		turtle1.turnRight();
		turtle1.forward(100);
		turtle1.turnRight();
		turtle1.forward(100);
		turtle1.turnRight();
		
		turtle2.backward(100);
		turtle2.turnLeft();
		turtle2.backward(100);
		turtle2.turnLeft();
		turtle2.backward(100);
		turtle2.turnLeft();
		turtle2.backward(100);
		turtle2.turnLeft();
		
		Chapt_3_Lesson localObj = new Chapt_3_Lesson(250,100,worldObj);
		localObj.drawSquare();
		
		// get class info
		System.out.println(worldObj.getClass());
		System.out.println(turtle1.getClass());
		// 3.3.2  ---End---
		*/
		
		
		
	}
}
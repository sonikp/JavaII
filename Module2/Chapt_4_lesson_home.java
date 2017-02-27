import java.awt.Color;

public class Chapt_4_lesson_home extends Picture
{
	
	//////////////// constructors /////////////////////
	
	public Chapt_4_lesson_home() 
	{
		super();
	}
	
	
	public Chapt_4_lesson_home(String filename) 
	{
		super(filename);
	}
	
	
	public Chapt_4_lesson_home(Picture filename) 
	{
		super(filename);
	}

	public void decreaseRed()
	{
		Pixel[] pixelArray = this.getPixels();
		int value = 0;
		
		for (Pixel pixelObj : pixelArray)
		{
			// get the red value
			value = pixelObj.getRed();
			
			// decrease value by 50%
			value = (int)(value * 0.5);
			
			// set new value
			pixelObj.setRed(value);
		}
	}
	
	public void increaseGreen()
	{
		Pixel[] pixelArray = this.getPixels();
		Pixel pixelObj;
		int value = 0;
		int index = 0;
		// loop through the array
		while (index < pixelArray.length)
		{
			pixelObj = pixelArray[index];
			value = pixelObj.getGreen();
			double valuePlus = value * 1.3;
			if ( valuePlus <= 255 )
			{
				System.out.println(value + " " + valuePlus);
				pixelObj.setGreen((int)valuePlus);
			}
		}
	}
	
	public static void main(String[] args)
	{
		String filename = "/Users/Shared/Java-Libraries/CourseCD/mediasources/caterpillar.jpg";

		// local object
		Chapt_4_lesson_home localObject = new Chapt_4_lesson_home(filename);
		System.out.println(localObject);
		localObject.explore();
		localObject.increaseGreen();
		localObject.explore();
		
		/*
		localObject.decreaseRed();
		localObject.explore();
	
		//localObject.show();
		System.out.println("width & height: " + localObject.getWidth() + " & " + localObject.getHeight());
	
		//get pixel using the pixel class
		Pixel pixelObject = localObject.getPixel(2, 0);
		System.out.println(pixelObject);
		Pixel[] pixelArray = localObject.getPixels();
		System.out.println(pixelArray[2]);

		// using the Color library
		// get color
		Color colorObj = pixelObject.getColor();
		System.out.println(colorObj);
		
		// set color
		Color newColorObj = new Color(0,100,0);
		System.out.println(newColorObj);
		pixelObject.setColor(newColorObj);
		System.out.println(pixelObject.getColor());
		//pictureObject.explore();
		*/
	}
}
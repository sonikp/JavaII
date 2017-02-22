import java.awt.Color;

public class Chapt_4_lesson_home extends Picture
{
	
	//////////////// constructors /////////////////////
	
	public Chapt_4_lesson_home(String filename) 
	{
		super();
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
	
	public static void main(String[] args)
	{
		String filename = "/Users/Shared/Java-Libraries/CourseCD/mediasources/caterpillar.jpg";
		//Picture pictureObject = new Picture(filename);
		Chapt_4_lesson_home localObject = new Chapt_4_lesson_home(filename);
		localObject.explore();
		localObject.decreaseRed();
		localObject.explore();
		
		//pictureObject.show();
		//System.out.println("width & height: " + pictureObject.getWidth() + " & " + pictureObject.getHeight());
		
		
		/*
		//get pixel using the pixel class
		Pixel pixelObject = pictureObject.getPixel(2, 0);
		System.out.println(pixelObject);
		Pixel[] pixelArray = pictureObject.getPixels();
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
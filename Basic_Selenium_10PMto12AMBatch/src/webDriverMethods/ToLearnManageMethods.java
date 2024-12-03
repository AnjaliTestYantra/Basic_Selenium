package webDriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnManageMethods {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver= new ChromeDriver();
	Thread.sleep(3000);
//	driver.manage().window().maximize();
//	Thread.sleep(3000);
//	driver.manage().window().minimize();
//	Thread.sleep(3000);
//	driver.manage().window().fullscreen();
	
	//getSize method
	
	Dimension sizeOfBrowser = driver.manage().window().getSize();
	System.out.println("Before maximizing: "+sizeOfBrowser);
	Thread.sleep(3000);
//	driver.manage().window().maximize();
//	Thread.sleep(2000);
//	
//	Dimension newSize = driver.manage().window().getSize();
//	System.out.println("Size of the Browser after maximizing: "+newSize);
//	System.out.println("Width of web page: "+newSize.getWidth());
//	System.out.println("Height of web page: "+newSize.getHeight());
//	
//	//setSize Method
//	driver.manage().window().setSize(new Dimension(700, 700));
	
	//getPosition method
	Point positionOfBrowser = driver.manage().window().getPosition();
	System.out.println("Position of Browser is : "+positionOfBrowser);
	System.out.println("x coordinate is: "+positionOfBrowser.getX());
	System.out.println("y coordinate is: "+positionOfBrowser.getY());
	
	//setPosition method
	Point position= new Point(300, 300);
	driver.manage().window().setPosition(position);
	
	Thread.sleep(5000);
	driver.quit();
	
	}

}

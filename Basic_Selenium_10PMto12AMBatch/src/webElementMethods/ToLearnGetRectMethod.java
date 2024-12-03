package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetRectMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		Thread.sleep(3000);
		WebElement loginBtn = driver.findElement(By.xpath("//button[@type='submit']"));
		 Rectangle rectOfLoginBtn = loginBtn.getRect();
		
		 System.out.println("Size: "+rectOfLoginBtn.getDimension());
		 System.out.println("Height: "+rectOfLoginBtn.getHeight());
		 System.out.println("Width: "+rectOfLoginBtn.getWidth());
		 System.out.println("Location: "+rectOfLoginBtn.getPoint());
		 System.out.println("x coordinate: "+rectOfLoginBtn.getX());
		 System.out.println("y coordinate: "+rectOfLoginBtn.getY());
		 
		 Thread.sleep(5000);
		 driver.quit();
	}

}

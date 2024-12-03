package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetTheLocationOfWebElement {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		Thread.sleep(3000);
		WebElement loginBtn = driver.findElement(By.xpath("//button[@type='submit']"));
		Point locOfLoginBtn = loginBtn.getLocation();
		System.out.println("Location of Login button is:"+locOfLoginBtn);
		System.out.println("x coordinate of Login Button: "+locOfLoginBtn.getX());
		System.out.println("y coordinate of Login Button: "+locOfLoginBtn.getY());
		Thread.sleep(5000);
		driver.quit();
	}

}

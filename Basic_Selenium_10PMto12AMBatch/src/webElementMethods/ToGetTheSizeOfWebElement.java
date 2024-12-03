package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetTheSizeOfWebElement {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.instagram.com/");
	Thread.sleep(3000);
	WebElement loginBtn = driver.findElement(By.xpath("//button[@type='submit']"));
	Dimension sizeOfLoginBtn = loginBtn.getSize();
	System.out.println("Size of Login button is:"+sizeOfLoginBtn);
	System.out.println("Height of Login Button: "+sizeOfLoginBtn.getHeight());
	System.out.println("Width of Login Button: "+sizeOfLoginBtn.getWidth());
	Thread.sleep(5000);
	driver.quit();
	}

}

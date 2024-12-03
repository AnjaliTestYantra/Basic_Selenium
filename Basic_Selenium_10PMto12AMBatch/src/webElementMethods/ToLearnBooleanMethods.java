package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnBooleanMethods {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		Thread.sleep(3000);
		WebElement loginBtn = driver.findElement(By.xpath("//button[@type='submit']"));
		System.out.println("Before Entering the data");
		System.out.println(loginBtn.isDisplayed()); //true
		System.out.println(loginBtn.isEnabled()); //false
		Thread.sleep(2000);
		System.out.println("After Entering the data");
		driver.findElement(By.name("username")).sendKeys("Anjali");
		driver.findElement(By.name("password")).sendKeys("1234567890");
		System.out.println(loginBtn.isDisplayed()); //true
		System.out.println(loginBtn.isEnabled()); //true
		
		Thread.sleep(5000);
		driver.quit();
	}

}

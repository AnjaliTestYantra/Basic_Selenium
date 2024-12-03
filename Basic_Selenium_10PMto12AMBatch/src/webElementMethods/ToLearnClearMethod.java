package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnClearMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.vtiger.com/vtigercrm/");
		Thread.sleep(3000);
		WebElement usernameTF = driver.findElement(By.id("username"));
		WebElement passwordTF = driver.findElement(By.id("password"));
		usernameTF.clear();
		Thread.sleep(2000);
		usernameTF.sendKeys("anjali@123");
		Thread.sleep(2000);
		passwordTF.clear();
		Thread.sleep(2000);
		passwordTF.sendKeys("1234567890");
		Thread.sleep(5000);
		driver.quit();
	}

}

package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class ToLearnToLeftOfRelativeLocator {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);
		WebElement searchBtn = driver.findElement(By.xpath("//input[@value='Search']"));
		WebElement searchTF = driver.findElement(RelativeLocator.with(By.tagName("input")).toLeftOf(searchBtn));
		searchTF.sendKeys("mobiles");
		Thread.sleep(5000);
		driver.quit();
	}

}

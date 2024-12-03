package testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ToLearnGroupExecution2 {
	@Test(groups = "SmokeTest")
	public void scroll() throws InterruptedException {
		
			WebDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get("https://demowebshop.tricentis.com/");
			Actions act= new Actions(driver);
			WebElement myAccount = driver.findElement(By.xpath("//h3[text()='My account']"));
			act.scrollToElement(myAccount).perform();
			Thread.sleep(3000);
			driver.quit();

		}
	@Test(groups = "RegressionTest")
	public void youtube() throws InterruptedException {
		
			WebDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.youtube.com/");
			Thread.sleep(5000);
			driver.findElement(By.name("search_query")).sendKeys("Devara Fear");
			driver.findElement(By.id("search-icon-legacy")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//yt-formatted-string[contains(@aria-label, 'Fear Song')]")).click();
			Thread.sleep(3000);
			driver.quit();
	
	}
	@Test(groups = {"SmokeTest", "RegressionTest"})
	public void doubleClick() throws InterruptedException {
		
			WebDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get("https://demoapp.skillrary.com/product.php");
			WebElement addBtn = driver.findElement(By.id("add"));
			Actions act= new Actions(driver);
			act.doubleClick(addBtn).perform();
			Thread.sleep(3000);
			driver.quit();

			
		}

	

}

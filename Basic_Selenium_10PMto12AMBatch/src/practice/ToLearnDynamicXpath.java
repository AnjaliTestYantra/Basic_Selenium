package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ToLearnDynamicXpath {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		String monthName="February 2025";
		String date="14";
		driver.get("https://www.makemytrip.com/");
		//to close the ad popup
		driver.findElement(By.xpath("//span[@data-cy='closeModal']")).click();
		//click on departure
		driver.findElement(By.xpath("//span[text()='Departure']")).click();
		for(;;) {
				try {
					driver.findElement(By.xpath("//div[text()='"+monthName+"']/../..//p[text()='"+date+"']")).click();
					break;
				}catch (Exception e) {
					driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
				}
		}

		Thread.sleep(3000);
		driver.quit();
	}

}

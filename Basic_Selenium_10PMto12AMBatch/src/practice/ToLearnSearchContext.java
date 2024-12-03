package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnSearchContext {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.findElement(By.id(""));
		driver.findElement(By.name(""));
		driver.findElement(By.linkText(""));
		driver.findElement(By.className(""));
		driver.findElement(By.tagName(""));
		driver.findElement(By.partialLinkText(""));
		driver.findElement(By.cssSelector(""));
		driver.findElement(By.xpath(""));
		

	}

}

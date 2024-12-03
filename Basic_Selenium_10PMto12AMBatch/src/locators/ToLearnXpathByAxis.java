package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnXpathByAxis {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);
		WebElement searchBtn = driver.findElement(By.xpath("//input[@id='small-searchterms']/following-sibling::input"));
		searchBtn.click();
		Thread.sleep(3000);
		driver.quit();
	}

}

package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetTagnameMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.actitime.com/");
		Thread.sleep(3000);
		WebElement tryFreeBtn = driver.findElement(By.linkText("Try Free"));
		System.out.println(tryFreeBtn.getTagName());
		Thread.sleep(5000);
		driver.quit();
	}

}

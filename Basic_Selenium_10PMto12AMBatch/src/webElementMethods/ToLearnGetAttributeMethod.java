package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetAttributeMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.actitime.com/");
		Thread.sleep(3000);
		WebElement tryFreeBtn = driver.findElement(By.linkText("Try Free"));
		System.out.println(tryFreeBtn.getAttribute("href"));
		System.out.println(tryFreeBtn.getAttribute("class"));
		Thread.sleep(5000);
		driver.quit();
	}

}

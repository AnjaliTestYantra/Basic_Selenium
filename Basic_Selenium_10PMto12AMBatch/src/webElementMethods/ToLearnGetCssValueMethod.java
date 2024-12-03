package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetCssValueMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.actitime.com/");
		Thread.sleep(3000);
		WebElement tryFreeBtn = driver.findElement(By.linkText("Try Free"));
		System.out.println(tryFreeBtn.getCssValue("background-color"));
		System.out.println(tryFreeBtn.getCssValue("font-weight"));
		System.out.println(tryFreeBtn.getCssValue("padding"));
		Thread.sleep(5000);
		driver.quit();

	}

}

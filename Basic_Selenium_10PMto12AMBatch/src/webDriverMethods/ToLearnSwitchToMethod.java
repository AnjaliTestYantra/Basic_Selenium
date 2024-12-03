package webDriverMethods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnSwitchToMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shoppersstack.com/products_page/17");
		Thread.sleep(35000);
		driver.findElement(By.id("compare")).click();
		Thread.sleep(3000);
		//To get parent window id
		String parentId = driver.getWindowHandle();
		
		//To get both parent and child window IDs
		Set<String> allWindowIds = driver.getWindowHandles();
		allWindowIds.remove(parentId);
		for(String windowId:allWindowIds ) {
			driver.switchTo().window(windowId);
			driver.close();
			Thread.sleep(3000);
		}
		driver.switchTo().window(parentId);
		driver.close();

	}

}

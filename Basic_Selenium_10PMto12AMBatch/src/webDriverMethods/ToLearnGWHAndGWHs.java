package webDriverMethods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ToLearnGWHAndGWHs {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shoppersstack.com/products_page/17");
		Thread.sleep(15000);
		driver.findElement(By.id("compare")).click();
		//To get parent window id
		String parentId = driver.getWindowHandle();
		System.out.println("Parent ID: "+parentId);
		
		//To get both parent and child window IDs
		Set<String> allWindowIds = driver.getWindowHandles();
		System.out.println("Child winodw Ids: "+allWindowIds);
		
		driver.quit();

	}

}

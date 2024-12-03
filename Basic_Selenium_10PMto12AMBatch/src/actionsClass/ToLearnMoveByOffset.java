package actionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToLearnMoveByOffset {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demowebshop.tricentis.com/");
	
		Actions act= new Actions(driver);
		act.moveByOffset(1105, 119).click().perform();
		
//		WebElement searchBtn = driver.findElement(By.xpath("//input[@value='Search']"));
//		act.moveToElement(searchBtn, 1105, 119).perform();
	}

}

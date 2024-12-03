package actionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToLearnKeyUpAndKeyDownMethods {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demowebshop.tricentis.com/");
		WebElement searchTF = driver.findElement(By.id("small-searchterms"));
		Actions act= new Actions(driver);
		act.click(searchTF).keyDown(Keys.SHIFT).sendKeys("mobiles").keyUp(Keys.SHIFT).perform();

	}

}

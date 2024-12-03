package iframe;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnToSwitchBackFromFrames {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.dream11.com/");
		
		//iframe methods
		
		driver.switchTo().frame(0);
		driver.findElement(By.id("regEmail")).sendKeys("9876543210");
		
		//Switch the control Back to Main Page
		//driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("About Us")).click();

	}

}

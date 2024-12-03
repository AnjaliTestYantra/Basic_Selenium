package javascriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleHiddenElement {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.facebook.com/r.php");
		WebElement hiddenEle = driver.findElement(By.id("custom_gender"));
		JavascriptExecutor jse= (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].value='Prefer Not to Mention'", hiddenEle);
		
	}

}

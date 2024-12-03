package javascriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnScrollIntoViewMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.worldometers.info/geography/flags-of-the-world/");
		Thread.sleep(3000);
		WebElement indianFlag = driver.findElement(By.xpath("//img[@src='/img/flags/small/tn_in-flag.gif']"));
		JavascriptExecutor jse= (JavascriptExecutor) driver;
		//jse.executeScript("arguments[0].scrollIntoView(true)", indianFlag);
		jse.executeScript("arguments[0].scrollIntoView(false)", indianFlag);


	}

}

package javascriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnScrollByMethodInGoogle {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.google.co.in/");
		driver.findElement(By.name("q")).sendKeys("Flowers", Keys.ENTER);
		driver.findElement(By.xpath("//div[text()='Images']")).click();
		//typecasting
		JavascriptExecutor jse= (JavascriptExecutor) driver;
	
		for(;;) {
			try {
				driver.findElement(By.xpath("//div[text()='6 Blue Flowers – Hoselink']")).click();
				break;
			}catch(Exception e) {
				jse.executeScript("window.scrollBy(0,500);");
			}
		}
		}

}

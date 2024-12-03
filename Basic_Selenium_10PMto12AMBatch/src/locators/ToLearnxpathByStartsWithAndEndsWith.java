package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnxpathByStartsWithAndEndsWith {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
		//starts-with
		
		WebElement errorMsg = driver.findElement(By.xpath("//span[starts-with(text(),'Login was')]"));
		
		//ends-with
		
		//WebElement errorMsg = driver.findElement(By.xpath("//span[ends-with(text(),'try again.')]"));
		System.out.println(errorMsg.getText());
		Thread.sleep(3000);
		driver.quit();

	}

}

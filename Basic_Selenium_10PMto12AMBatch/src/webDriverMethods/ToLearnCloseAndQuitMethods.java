package webDriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ToLearnCloseAndQuitMethods {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.shoppersstack.com/products_page/17");
		Thread.sleep(15000);
		//driver.quit();
		driver.findElement(By.id("compare")).click();//click on compare button
		//driver.close(); //Closed parent window
		
		driver.quit(); // Closed both parent and child windows

	}

}

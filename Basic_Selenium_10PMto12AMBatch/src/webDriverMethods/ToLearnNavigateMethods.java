package webDriverMethods;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnNavigateMethods {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		// to navigate to application
		driver.navigate().to("https://www.amazon.in/");
		Thread.sleep(3000);
		
		driver.navigate().to(new URL("https://www.instagram.com/"));
		
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		
		Thread.sleep(3000);
		driver.quit();

	}

}

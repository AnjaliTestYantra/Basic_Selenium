package takesScreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ToTakeSSOfUdemyLogo {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.udemy.com/");
		Thread.sleep(3000);
		
		//To take the screenshot
		
		//Step 1: Locate the WE
		WebElement udemyLogo = driver.findElement(By.xpath("//img[@alt='Udemy' and @loading='lazy']"));
		
		//Step 2: Take SS
		File temp = udemyLogo.getScreenshotAs(OutputType.FILE);
		
		//Step 3: Create Permanent Loc
		File perm= new File("./errorShots/udemyLogo.jpeg");
		
		//Step 4: Copy the SS from Temp to  permanent loc
		FileHandler.copy(temp, perm); 
		
	}

}

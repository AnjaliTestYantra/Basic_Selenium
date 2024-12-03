package practice;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToConvertMTintoATS {

	public static void main(String[] args) throws IOException {
		// Expected Data
		String expectedLoginPageTitle= "Facebook – log in or sign up";
		String expectedUsername="sukanya";
		String expectedPassword="anjali@123";
		
		//read the data from properties
		
				FileInputStream fis= new FileInputStream("C:\\Users\\Anjali Unnikrishnan\\Desktop\\Online PPT\\10PM-12AM\\facebookData.properties");
				Properties prop= new Properties();
				prop.load(fis);
				String UNAME = prop.getProperty("Username");
				String PWD = prop.getProperty("Password");
				String URL = prop.getProperty("Url");
				
			//Step 1: 	Launch and maximize the Browser
				WebDriver driver= new ChromeDriver();
				System.out.println("Launched the Browser successfully");
				driver.manage().window().maximize();
				System.out.println("Maximized the Browser successfully");
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				
		  // Step 2: Navigate to facebook url
				driver.get(URL);
				String actualLoginPageTitle = driver.getTitle();
				if(actualLoginPageTitle.equals(expectedLoginPageTitle)) {
					System.out.println("Successfully Navigated to Facebook Login Page");
				}else {
					System.out.println("Failed to navigate to Facebook Login Page");
				}
				
		//Step 3: enter valid username
				WebElement unameTF = driver.findElement(By.id("email"));
				unameTF.clear();
				unameTF.sendKeys(UNAME);
				String actualUserName = unameTF.getAttribute("value");
				if (actualUserName.equals(expectedUsername)) {
					System.out.println("UsernameTF accepted the Username successfully");
				}else {
					System.out.println("UsernameTF failed to accept the Username");
				}
				
		//Step 4: enter valid Password
		//Step 5: click on login Button
	    //Step 6: Close the Browser
				driver.quit();
				
	}

}

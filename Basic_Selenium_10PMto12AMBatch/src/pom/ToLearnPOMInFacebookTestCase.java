package pom;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnPOMInFacebookTestCase {

	public static void main(String[] args) throws IOException {
		//Read the data from properties
		FileInputStream fis= new FileInputStream("C:\\Users\\Anjali Unnikrishnan\\Desktop\\Online PPT\\10PM-12AM\\testData.properties");
		Properties prop= new Properties();
		prop.load(fis);
		String URL = prop.getProperty("Url");
		String UNAME = prop.getProperty("Username");
		String PWD = prop.getProperty("Password");
		
			
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Fetching the web elements from POM class
				LoginPage lp= new LoginPage(driver);
								
		driver.get(URL);
		lp.getUsernameTF().sendKeys(UNAME);
		lp.getPasswordTF().sendKeys(PWD);
		lp.getLoginBtn().click();

	}

}

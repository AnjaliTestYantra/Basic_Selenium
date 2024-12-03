package testNG;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ToLearnConfigAnnotationsInRealTS {
public WebDriver driver;
public String expectedLoginPageTitle= "Facebook – log in or sign up";
public String expectedUsername="sukanya";
public String expectedPassword="anjali@123";

	@BeforeSuite
	public void configBS() {
		Reporter.log("Established the DB Connection, Report Config", true);
	}
	@AfterSuite
	public void configAS() {
		Reporter.log("Closed the DB Connection, Report Backup", true);
	}
	@BeforeTest
	public void configBT() {
		Reporter.log("Pre-condition", true);
	}
	@AfterTest
	public void configAT() {
		Reporter.log("Post-condition", true);
	}
	@BeforeClass
	public void configBC() {
		 driver= new ChromeDriver();
		System.out.println("Launched the Browser successfully");
		driver.manage().window().maximize();
		System.out.println("Maximized the Browser successfully");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.facebook.com/");
		String actualLoginPageTitle = driver.getTitle();
		if(actualLoginPageTitle.equals(expectedLoginPageTitle)) {
			Reporter.log("Successfully Navigated to Facebook Login Page", true);
		}else {
			Reporter.log("Failed to navigate to Facebook Login Page", true);
		}
	}
	@AfterClass
	public void configAC() {
		Reporter.log("Successfully closes the Browser", true);
		driver.quit();
	}
	@BeforeMethod
	public void configBM() {
		WebElement unameTF = driver.findElement(By.id("email"));
		unameTF.clear();
		unameTF.sendKeys("Anjali");
		String actualUserName = unameTF.getAttribute("value");
		if (actualUserName.equals(expectedUsername)) {
			Reporter.log("UsernameTF accepted the Username successfully", true);
		}else {
			Reporter.log("UsernameTF failed to accept the Username", true);
	}
		driver.findElement(By.id("pass")).sendKeys("anjali@123");
		
		driver.findElement(By.name("login")).click();
		Reporter.log("Successfully Logged in", true);
		
	}
		
	
	@AfterMethod
	public void configAM() {
		
		Reporter.log("Successfully Logged Out", true);
		
	}
	@Test
	public void facebookTC() throws IOException {
	
		Reporter.log("Actual Test script 1 Executed", true);
				
	}	
	@Test
	public void fbTC2() {
		Reporter.log("Actual Test script 2 Executed", true);
	}

}

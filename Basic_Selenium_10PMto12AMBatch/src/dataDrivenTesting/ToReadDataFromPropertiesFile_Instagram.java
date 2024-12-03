package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToReadDataFromPropertiesFile_Instagram {

	public static void main(String[] args) throws IOException {
		//Read the Data From Properties File
		
		//Step 1:  Create object of java representation file(FileInputStream)
		FileInputStream fis= new FileInputStream("C:\\Users\\Anjali Unnikrishnan\\Desktop\\Online PPT\\10PM-12AM\\testData.properties");
		//Step 2: Create File type Object
		Properties prop= new Properties();
		//Step 3: Load all the Keys
		prop.load(fis);
		//Step 4: Call the Read methods
		String BROWSER = prop.getProperty("Browser");
		String UNAME = prop.getProperty("Username");
		String PWD = prop.getProperty("Password");
		String URL = prop.getProperty("Url");
		
		System.out.println("Browser is: "+BROWSER);
		System.out.println("Username is: "+UNAME);
		System.out.println("Password is: "+PWD);
		System.out.println("Url is: "+URL);
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(URL);
		driver.findElement(By.name("username")).sendKeys(UNAME);
		driver.findElement(By.name("password")).sendKeys(PWD);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

}

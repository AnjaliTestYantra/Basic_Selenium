package takesScreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ToTakeSSOfYoutubeWebPage {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.youtube.com/");
		Thread.sleep(3000);
		//take screeshot
		
		//Step 1: TypeCasting
			TakesScreenshot tks= (TakesScreenshot) driver;
			
			//Step 2: Take the ss
			File temp = tks.getScreenshotAs(OutputType.FILE);
			
			//Step 3: Create permanent Loc
			File perm= new File("./errorShots/YoutubSS1.png");
			
			//Step 4: Copy the SS from temp loc to permannet loc
			FileHandler.copy(temp, perm);
		
		

	}

}

package selectClass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class ToHandleDropDownInFacebookSignup {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.facebook.com/r.php");
		WebElement dayDropdown = driver.findElement(By.id("day"));
		WebElement monthDropdown = driver.findElement(By.id("month"));
		WebElement yearDropdown = driver.findElement(By.id("year"));
				//handle the dropdowns
		Select daySel= new Select(dayDropdown);
		daySel.selectByIndex(26);
		Select monthSel= new Select(monthDropdown);
		monthSel.selectByValue("6");
		Select yearSel = new Select(yearDropdown);
		yearSel.selectByVisibleText("2022");
				//to get the all options
		List<WebElement> allOptions = monthSel.getOptions();
		for(WebElement month:allOptions) {
			System.out.println(month.getText());
			Thread.sleep(1000);
		}
		boolean status = yearSel.isMultiple();
		System.out.println(status); //false
		
		yearSel.deselectByVisibleText("2022");

	}

}

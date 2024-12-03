package selectClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToHandleMultiselectdDropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demoapp.skillrary.com/");
		WebElement priceListBox = driver.findElement(By.id("cars"));
		Select multiSel= new Select(priceListBox);
		System.out.println(multiSel.isMultiple());//true
		//select methods
		multiSel.selectByIndex(0);
		multiSel.selectByValue("99");
		multiSel.selectByVisibleText("INR 100 - INR 199 ( 16 ) ");
		
		//deselect methods
		Thread.sleep(2000);
//		multiSel.deselectByIndex(2);
//		Thread.sleep(2000);
//		multiSel.deselectByValue("99");
//		Thread.sleep(2000);
//		multiSel.deselectByVisibleText("Free ( 90 ) ");
//	
		WebElement firstOpt = multiSel.getFirstSelectedOption();
		System.out.println(firstOpt.getText());
//		
		//multiSel.deselectAll();
	}


}

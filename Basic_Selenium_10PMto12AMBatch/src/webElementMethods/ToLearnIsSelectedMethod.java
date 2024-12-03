package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnIsSelectedMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		Thread.sleep(3000);
		WebElement selectOpt = driver.findElement(By.xpath("//option[@value='99']"));
		System.out.println("Before Selecting: ");
		System.out.println(selectOpt.isSelected()); //false
		System.out.println("After selecting: ");
		selectOpt.click();
		System.out.println(selectOpt.isSelected());// true
		Thread.sleep(5000);
		driver.quit();
	}

}

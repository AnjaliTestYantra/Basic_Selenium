package actionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToLearnDragAndDropActions {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
	Actions act= new Actions(driver);
	//To locate the src WE
	WebElement srcRome = driver.findElement(By.id("box6"));
	WebElement srcMadrid = driver.findElement(By.id("box7"));
	WebElement srcWashington = driver.findElement(By.id("box3"));
	
	//To locate target WE
	WebElement targetItaly = driver.findElement(By.id("box106"));
	WebElement targetSpain = driver.findElement(By.id("box107"));
	WebElement targetUS = driver.findElement(By.id("box103"));
	
	//Drag and drop
	act.dragAndDrop(srcRome, targetItaly).perform();
	Thread.sleep(2000);
	act.dragAndDrop(srcMadrid, targetSpain).perform();
	Thread.sleep(2000);
	act.dragAndDrop(srcWashington, targetUS).perform();
	Thread.sleep(5000);
	driver.quit();
	
	}

}

package webDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetTitle_CurrentUrl_PageSourceMethods {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		String title = driver.getTitle();
		System.out.println("Title of the web page is: "+ title);
		String url = driver.getCurrentUrl();
		System.out.println("Url of the web page is: "+url);
//		String pageSource = driver.getPageSource();
//		System.out.println("Page source of web page is: "+pageSource);
	}

}

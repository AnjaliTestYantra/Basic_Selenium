package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToReadDataFromExcelSheet_Instagram {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//Step 1: Create object of FIS
		FileInputStream fis= new FileInputStream("C:\\Users\\Anjali Unnikrishnan\\Desktop\\Online PPT\\10PM-12AM\\testData.xlsx");
		
		//Step 2: Open the excel sheet in Read mode
		Workbook wb = WorkbookFactory.create(fis);
		
//		//Step 3: get the control of sheet
//		Sheet sh = wb.getSheet("Instagram");
//		
//		//Step 4: get the control of row
//		Row r = sh.getRow(1);
//		
//		//Step 5: get the control of cell and read the data
//		String BROWSER = r. getCell(0).getStringCellValue();
//		String URL = r.getCell(1).getStringCellValue();
//		String UNAME = r.getCell(2).getStringCellValue();
//		String PWD = r.getCell(3).getStringCellValue();
		
		String BROWSER = wb.getSheet("Instagram").getRow(1).getCell(0).getStringCellValue();
		String URL= wb.getSheet("Instagram").getRow(1).getCell(1).getStringCellValue();
		String UNAME= wb.getSheet("Instagram").getRow(1).getCell(2).getStringCellValue();
		String PWD= wb.getSheet("Instagram").getRow(1).getCell(3).getStringCellValue();
		
		System.out.println("Browser is: "+BROWSER);
		System.out.println("Username is: "+UNAME);
		System.out.println("Password is: "+PWD);
		System.out.println("Url is: "+URL);
		
		//Step 6:- Close the Workbook
		wb.close();
		
		//Actual test script
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(URL);
		driver.findElement(By.name("username")).sendKeys(UNAME);
		driver.findElement(By.name("password")).sendKeys(PWD);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	}

}

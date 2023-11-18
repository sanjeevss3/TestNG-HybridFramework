package sni_mpi;

import java.io.*;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import javax.servlet.Registration.Dynamic;

import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.JavascriptExecutor;
/**
*
*@author Sanjeev Chaudhary
*https://github.com/sanjeevss3/
*
*/

public class ReadURLandOpenInBrowser {

	public static void main(String[] args) throws IOException {
		String data1;
		String key = "webdriver.chrome.driver";
		String value = "./drivers/chromedriver.exe";
		//
		System.setProperty(key, value);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		File file = new File("D:\\Workspace_Selenium\\TestData.xls");

		FileInputStream fis = new FileInputStream(file);
		HSSFWorkbook workbook = new HSSFWorkbook(fis);

		HSSFSheet sheet = workbook.getSheet("sheetname2");

		for (int i = 0; i <= sheet.getLastRowNum(); i++) {
			data1 = sheet.getRow(i).getCell(0).getStringCellValue();
			driver.get(data1);
			System.out.println(data1);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.open(/)");
	
		//	DynamicArray d=new DynamicArray();       
//			 for(int i=0;i<100;i++){
//		            d.add(i+10);       
//		            }
			
//	ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
//			driver.switchTo().window(tabs.get(1));
//	     driver.get(data1);	
	//		tabs=tab+1;

	
//			driver.quit();
			
//			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

			// driver.get(data1);
			// System.out.println(data1);

		}
	//	((JavascriptExecutor) driver).executeScript("window.open()");

	//	ArrayList<String> tabs3 = new ArrayList<String>(driver.getWindowHandles());
		// driver.switchTo().window(tabs3.get(3));
		// driver.get(data1);

		workbook.close();

		// ((JavascriptExecutor) driver).executeScript("window.open()");
		// ArrayList<String> tabs3 = new ArrayList<String>(driver.getWindowHandles());
		// driver.switchTo().window(tabs3.get(3));

		// searchbox.sendKeys(keyword);
		// searchbox.submit();
		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

}

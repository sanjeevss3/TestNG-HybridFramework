package com.readexceldata;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Login {

	public static void main(String[] args) throws Exception {
		
	    String value = "webdriver.chrome.driver";
		String key = "./drivers/chromedriver.exe";
		System.setProperty(value, key);
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.friday-ad.co.uk/");

		/*WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://fmti.friday-ad.co.uk");
		Thread.sleep(5000); */

		driver.findElement(By.id("onesignal-popover-cancel-button")).click();
		driver.findElement(By.xpath(".//*[@id='login-header-id']")).click();
		
		File scr = new File("D:\\Workspace_Selenium\\readdatafromspreadsheet.xls");
		FileInputStream fis = new FileInputStream(scr);
		
		//Read data from .xls workbook
		HSSFWorkbook xlswb = new HSSFWorkbook(fis);
		
		// Read data from .xlsx workbook
		//XSSFWorkbook xlsxwb = new XSSFWorkbook(fis);
		
		HSSFSheet sheet1 = xlswb.getSheet("lmpcredentials");
		String data0 = sheet1.getRow(0).getCell(0).getStringCellValue();
		String data1 = sheet1.getRow(0).getCell(1).getStringCellValue();
		System.out.println("Excel data:  \n "+ data0 +"\n "+ data1);
		
		//Prevent the memory leak.
		xlswb.close();
		
		/*driver.findElement(By.xpath(".//*[@id='username']")).sendKeys("siva.pelleti@fridaymediagroup.com");
		driver.findElement(By.xpath(".//*[@id='user_login_password']")).sendKeys("Password@1");
		driver.findElement(By.xpath(".//*[@id='login-dialog']/div[1]/div[1]/form/button")).click();

		// Click on Place an Ad button
		driver.findElement(By.xpath(".//*[@id='top_bar_nav']/section/ul[2]/li/a")).click();

		// Select menu for sale
		driver.findElement(By.xpath(".//*[@id='maincategory_2']")).click();
		driver.findElement(By.xpath(".//*[@id='fa_paa_category_select_category_2-button']/span[1]")).click();
		driver.findElement(By.xpath(".//*[@id='fa_paa_category_select_category_2-button']/span[1]")).click();
		driver.findElement(By.id("ui-id-13")).click(); */

	}

}

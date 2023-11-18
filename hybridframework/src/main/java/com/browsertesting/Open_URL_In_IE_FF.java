package com.browsertesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.hybridFramework.testBase.TestBase;
import com.lib.exceldataconfiguration.ExcelDataConfig;

/**
 *
 * @author Sanjeev Chaudhary https://github.com/sanjeevss3/
 *
 */

public class Open_URL_In_IE_FF {

	public static void main(String[] args) {


		//Firefox browser property details:-
		/*
		 String key="webdriver.gecko.driver";
		 String value="./drivers/geckodriver.exe";
		 System.setProperty(key, value);
		 WebDriver driver=new FirefoxDriver(); 
		
		// IE browser property details:-
		String key = "webdriver.ie.driver";
		String value = "./drivers/IEDriverServer.exe";
		System.setProperty(key, value);
		WebDriver driver = new InternetExplorerDriver(); */
		
		// Chrome browser property details:-
		
		System.setProperty("webdriver.chrome.driver","D:\\Selenium_Drivers\\chromedriver.exe");
		String value = "webdriver.chrome.driver";
		String key = "./drivers/chromedriver.exe";
		System.setProperty(value, key); 
		WebDriver driver=new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("http://www.simplylawjobs.com");
		System.out.println(driver.getTitle());
	}

}

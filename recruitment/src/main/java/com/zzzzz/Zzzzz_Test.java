package com.zzzzz;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.lib.exceldataconfiguration.ExcelDataConfig;

/**
 *
 * @author Sanjeev Chaudhary https://github.com/sanjeevss3/
 *
 */

public class Zzzzz_Test {

	public static void main(String[] args) {
		System.out.println("111111111");
		// System.setProperty("webdriver.gecko.driver", "C:\\Users\\QA
		// Team\\git\\Recruitment\\recruitment\\drivers\\geckodriver.exe");
		// String key="webdriver.gecko.driver";
		// String value="./drivers/geckodriver.exe";
		// System.setProperty(key, value);
		// System.out.println("222222");
		// WebDriver driver=new FirefoxDriver();

		// System.setProperty("webdriver.gecko.driver", "C:\\Users\\QA
		// Team\\git\\Recruitment\\recruitment\\drivers\\geckodriver.exe");
		
		String key = "webdriver.IE.driver";
		String value = "./drivers/IEDriverServer.exe";
		System.setProperty(key, value);
		WebDriver driver = new InternetExplorerDriver();
		driver.get("http://www.google.com/");
	}

}

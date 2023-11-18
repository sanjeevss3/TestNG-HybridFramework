package com.testngscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 *
 * @author Sanjeev Chaudhary 
 * https://github.com/sanjeevss3/
 *
 */

public class CrossBrowserTesting {

	WebDriver driver;

	@Test(threadPoolSize = 3, invocationCount = 3,  timeOut = 10000)
	@Parameters("browser")
	public void verifyPageTitle(String browsername) {

		if (browsername.equalsIgnoreCase("chrome")) {
			String key = "webdriver.chrome.driver";
			String value = "./drivers/chromedriver.exe";
			System.setProperty(key, value);
			driver = new ChromeDriver();
		}

		else if (browsername.equalsIgnoreCase("firefox")) {
			String key = "webdriver.gecko.driver";
			String value = "./drivers/geckodriver.exe";
			System.setProperty(key, value);
			//System.setProperty("webdriver.gecko.driver","D:\\Selenium_Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		}

		else if (browsername.equalsIgnoreCase("IE")) {
			String key = "webdriver.ie.driver";
			String value = "./drivers/IEDriverServer.exe";
			System.setProperty(key, value);
			driver = new InternetExplorerDriver();
		}

		driver.manage().window().maximize();
		driver.get("http://beta.aviationjobsearch.com/");
		System.out.println(driver.getTitle());
		//driver.quit();
	}

}

package com.testngscripts;

import java.util.ArrayList;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 *
 * @author Sanjeev Chaudhary 
 * https://github.com/sanjeevss3/
 *
 */

public class OpenRecruitmentSites {

	WebDriver driver;

	/*@Test
	public void openChromeBrowser() {
		String key = "webdriver.chrome.driver";
		String value = "./drivers/chromedriver.exe";
		System.setProperty(key, value);

		driver = new ChromeDriver();
		driver.manage().window().maximize();
	} */

	@Test
	@Parameters("sites")
	public void openSites(String sitename) {
		if (sitename.equalsIgnoreCase("smj")) {
			String key = "webdriver.chrome.driver";
			String value = "./drivers/chromedriver.exe";
			System.setProperty(key, value);

			driver = new ChromeDriver();
			driver.get("http://beta.simplymarketingjobs.co.uk/");
		}

		else if (sitename.equalsIgnoreCase("ssj")) {
			((JavascriptExecutor) driver).executeScript("window.open()");
			ArrayList<String> tabs1 = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(tabs1.get(1));
			driver.get("http://beta.simplysalesjobs.co.uk/");
		}

		else if (sitename.equalsIgnoreCase("slj")) {
		((JavascriptExecutor) driver).executeScript("window.open()");
		ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs2.get(2));
		driver.get("http://beta.simplysalesjobs.co.uk/");
		}
	}

}

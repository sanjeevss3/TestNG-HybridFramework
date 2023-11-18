package com.testngscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

/**
 *
 * @author Sanjeev Chaudhary 
 * https://github.com/sanjeevss3/
 *
 */
@Listeners(com.testngscripts.TestNGListener.class)
public class TestcaseToCallListener {

	WebDriver driver;

	@Test
	public void getAJSTitle() {
		String key = "webdriver.chrome.driver";
		String value = "./drivers/chromedriver.exe";
		System.setProperty(key, value);
		driver = new ChromeDriver();
		driver.get("http://beta.aviationjobsearch.com");
		System.out.println(driver.getTitle());
		driver.quit();

	}

	@Test
	public void titleMatch() {
		System.out.println("In method we are checking Failed condition");
		Assert.assertEquals("Aviation", "Aviation");
	}
	
	@Test(dependsOnMethods="titleMatch")
	public void titleMatch1() {
		System.out.println("In method we are checking Failed condition");
		Assert.assertEquals("Aviation", "Sanjeev");
	}

}

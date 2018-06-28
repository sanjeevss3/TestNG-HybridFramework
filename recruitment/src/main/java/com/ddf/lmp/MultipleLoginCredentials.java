package com.ddf.lmp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.hybridFramework.testBase.TestBase;

import page_factory.browser.BrowserFactory;

public class MultipleLoginCredentials {
	WebDriver driver;

	@Test(dataProvider = "aviationjobsearch")
	public void logintofridayad(String username, String password) throws Exception {

		String value = "webdriver.chrome.driver";
		String key = "./drivers/chromedriver.exe";
		System.setProperty(value, key);
		driver = new ChromeDriver();
		driver.manage().window().maximize(); 
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://www.aviationjobsearch.com/");
		driver.findElement(By.id("login_click")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("signin_email")).sendKeys(username);
		driver.findElement(By.id("signin_password")).sendKeys(password);
		driver.findElement(By.name("signin_button")).click();

		System.out.println(driver.getTitle());
		Thread.sleep(5000);
		Assert.assertTrue(driver.getTitle().contains("Aviation"), "User is not able to login - Invalid Credentails");
		System.out.println("Page title verified - User able to login successfully");
	}

	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}

	@DataProvider(name = "aviationjobsearch")
	public Object[][] passdata() {
		Object[][] credentails = new Object[2][2];

		credentails[0][0] = "sanjeev.chaudhary@fridaymediagroup.com";
		credentails[0][1] = "test123";
		
		credentails[1][0] = "siva.pelleti@fridaymediagroup.com";
		credentails[1][1] = "Password@1";
		
		return credentails;

	}

}

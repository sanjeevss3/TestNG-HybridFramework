package com.testngscripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.hybridFramework.testBase.TestBase;

/**
 *
 * @author Sanjeev Chaudhary https://github.com/sanjeevss3/
 *
 */

public class MyApp_DepdAnnot_RealTime {

	WebDriver driver;

	@BeforeClass
	public void startBrowser() {
		String key = "webdriver.chrome.driver";
		String value = "./drivers/chromedriver.exe";
		System.setProperty(key, value);
		driver = new ChromeDriver();
		System.out.println("*************Browser Launched********************");
	}
	
	@Test(description = "Staring Application")
	public void statApp() {
		driver.navigate().to("http://beta.aviationjobsearch.com/recruiters/log-in");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String currentURL = driver.getCurrentUrl();
		Assert.assertTrue(currentURL.contains("ecruiters/log-in"));
	}

	@Test(dependsOnMethods = "statApp", description = "Login to Application")
	public void loginApp() {
		driver.findElement(By.xpath(".//*[@id='signin_email']")).sendKeys("rajendrabadri@outlook.com");
		driver.findElement(By.xpath(".//*[@id='signin_password']")).sendKeys("test123");
		driver.findElement(By.xpath(".//*[@id='center_column']/form/div[2]/div[3]/input")).click();

		boolean status = driver.findElement(By.xpath(".//*[@id='header_row']/div/div[5]")).isDisplayed();
		Assert.assertTrue(status);
	}

	//@Test(dependsOnMethods = "loginApp", description = "Log out from application")
	public void logoutApp() {
		driver.findElement(By.xpath(".//*[@id='header_row']/div/div[5]/a")).click();
		Assert.assertTrue(driver.findElement(By.xpath(".//*[@id='login_click']")).isDisplayed());
	}
	
	@AfterClass
	public void closeBrowser() {
		driver.quit();
		System.out.println("**************Browser Closed*******************");
	}
}

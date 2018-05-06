package com.ddf.lmp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MultipleLoginCredentials {
	WebDriver driver;

	@Test(dataProvider = "fridayad")
	public void logintofridayad(String username, String password) throws Exception {

		String value = "webdriver.chrome.driver";
		String key = "./drivers/chromedriver.exe";
		System.setProperty(value, key);

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.friday-ad.co.uk/login/");
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("user_login_password")).sendKeys(password);
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='login-header-id']")).click();

		driver.findElement(By.linkText("")).click();
		// driver.findElement(By.className("primary-btn-1 button expand")).click();

		Thread.sleep(3000);

		System.out.println(driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Dashboard"), "User is not able to login - Invalid Credentails");
		System.out.println("Page title verified - User able to login successfully");
	}

	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}

	@DataProvider(name = "fridayad")
	public Object[][] passdata() {
		Object[][] credentails = new Object[2][2];

		credentails[0][0] = "siva.pelleti@fridaymediagroup.com";
		credentails[0][1] = "Password@1";

		credentails[1][0] = "sanjeev.chaudhary@fridaymediagroup.com";
		credentails[1][1] = "test123";
		return credentails;

	}

}

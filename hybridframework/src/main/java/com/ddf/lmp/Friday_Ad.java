package com.ddf.lmp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.lib.exceldataconfiguration.ExcelDataConfig;

public class Friday_Ad {
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
		driver.findElement(By.xpath(".//*[@id='login-dialog']/div[1]/div[1]/form/button")).click();

		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

		Assert.assertTrue(driver.getTitle().contains("Dashboard"), "User is not able to login - Invalid Credentails");
		System.out.println("Page title verified - User able to login successfully");
	}

	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}

	@DataProvider(name = "fridayad")
	public Object[][] passdata() {
		ExcelDataConfig config = new ExcelDataConfig("./exceltestdata/inputcredentails.xls");

		// ExcelDataConfig config = new
		// ExcelDataConfig("/.exceltestdata/inputcredentails.xls");

		int rows = config.getRowCount(0);

		Object[][] credentails = new Object[rows][2];

		for (int i = 0; i < rows; i++) {
			credentails[i][0] = config.getdata(0, i, 0);
			credentails[i][1] = config.getdata(0, i, 1);
		}
		return credentails;

	}

}

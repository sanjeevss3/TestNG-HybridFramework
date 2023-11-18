package com.testngscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 *
 * @author Sanjeev Chaudhary https://github.com/sanjeevss3/
 *
 */

public class VerifyErrorMessage {

	/*
	 * public static void main(String[] args) throws InterruptedException {
	 * WebDriver driver; String key = "webdriver.chrome.driver"; String value =
	 * "./drivers/chromedriver.exe"; System.setProperty(key, value); driver = new
	 * ChromeDriver(); driver.manage().window().maximize();
	 * 
	 * driver.get("http://beta.aviationjobsearch.com/");
	 * driver.findElement(By.xpath(".//*[@id='login_click']")).click(); ;
	 * driver.findElement(By.xpath(".//*[@id='login_box']/div[2]/div/form/input[3]")
	 * ).click();
	 * 
	 * Thread.sleep(3000); // driver.manage().timeouts().implicitlyWait(20,
	 * TimeUnit.SECONDS);
	 * 
	 * String actual_error =
	 * driver.findElement(By.xpath(".//*[@id='login_box']/div[2]/div/form/ul[1]/li")
	 * ).getText(); String expected_error = "Email address is required";
	 * 
	 * System.out.println(actual_error);
	 * 
	 * Assert.assertEquals(actual_error, expected_error);
	 * Assert.assertTrue(actual_error.contains("Email address is required"));
	 * System.out.println("Test completed and error message is:" + expected_error);
	 */

	// TestNG - Get error message using getAttribute
	@Test
	public void verifyText() throws InterruptedException {
		WebDriver driver;
		String key = "webdriver.chrome.driver";
		String value = "./drivers/chromedriver.exe";
		System.setProperty(key, value);
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://beta.aviationjobsearch.com/");
		driver.findElement(By.xpath(".//*[@id='login_click']")).click();
		driver.findElement(By.xpath(".//*[@id='login_box']/div[2]/div/form/input[3]")).click();

		Thread.sleep(3000);
		// capture the error message using getAttribute() method. 
		String actual_error = driver.findElement(By.xpath(".//*[@id='login_box']/div[2]/div/form/ul[1]/li")).getAttribute("innerHTML");
		String expected_error = "Email address is required";

		//Below are two ways to compare actual error message vs expected error message. 
		Assert.assertEquals(actual_error, expected_error);
		Assert.assertTrue(actual_error.contains("Email address is required"));
		System.out.println("Test completed and error message is:" + expected_error);

	}

}

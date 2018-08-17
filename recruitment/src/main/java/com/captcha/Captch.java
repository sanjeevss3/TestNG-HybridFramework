package com.captcha;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
*
* @author Sanjeev Chaudhary 
*
*/
public class Captch {

	public static void main(String[] args) throws InterruptedException {
		String value = "webdriver.chrome.driver";
		String key = "./drivers/chromedriver.exe";
		System.setProperty(value, key);

		/*
		 * DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		 * ChromeOptions options = new ChromeOptions();
		 * options.addArguments("incognito");
		 * capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		 */

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://beta.traveljobsearch.com/");
		driver.findElement(By.linkText("Job alerts")).click();

		int i = 0;
		do {
			driver.findElement(By.xpath(".//*[@id='candidate_job_search_name']")).sendKeys("Job Alert_123");

			driver.findElement(By.xpath(".//*[@id='candidate_job_search_email']")).sendKeys("sanjeev@gmail.com");
			Thread.sleep(2000);

			WebElement oCheckBox = driver.findElement(By.className("recaptcha-checkbox-checkmark"));
			oCheckBox.click();

			driver.findElement(By.xpath(".//*[@id='anonymous_jbe_submit_btn']")).click();
			Thread.sleep(2000);
			// driver.findElement(By.xpath(".//*[@id='candidate_job_search_name']")).clear();
			// driver.findElement(By.xpath(".//*[@id='candidate_job_search_email']")).clear();
		} while (i < 5);

	}

}

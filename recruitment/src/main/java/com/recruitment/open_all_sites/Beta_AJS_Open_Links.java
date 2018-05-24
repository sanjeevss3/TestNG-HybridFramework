package com.recruitment.open_all_sites;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Beta_AJS_Open_Links {

	public static void main(String agrs[]) throws InterruptedException {

		// Firefox browser property details
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\QA Team\\git\\Recruitment\\recruitment\\drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.aviationjobsearch.com/");

		// Chrome browser property details
		// System.setProperty("webdriver.chrome.driver","D:\\Selenium_Drivers\\chromedriver.exe");
		// String value = "webdriver.chrome.driver";
		// String key = "./drivers/chromedriver.exe";
		// System.setProperty(value, key);

		// WebDriver driver=new ChromeDriver();

		String baseUrl = "https://www.aviationjobsearch.com/";
		// WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		String underConsTitle = "Under Construction: Mercury Tours";

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		driver.get(baseUrl);

		Thread.sleep(3000);
		//System.out.println("Pushing code to GitHub test.");
		driver.findElement(By.xpath(".//*[@id='top_line']/div/div[2]/div/span")).click();

		driver.findElement(By.xpath(".//*[@id='cookie_policy']/div/div[3]/span")).click();

		List<WebElement> linkElements = driver.findElements(By.tagName("a"));
		String[] linkTexts = new String[linkElements.size()];
		int i = 0;

		// extract the link texts of each link element
		for (WebElement e : linkElements) {
			linkTexts[i] = e.getText();
			i++;
		}

		// test each link
		for (String t : linkTexts) {
			driver.findElement(By.linkText(t)).click();

			if (driver.getTitle().equals(underConsTitle)) {
				System.out.println("\"" + t + "\"" + " is under construction.");
			} else {
				System.out.println("\"" + t + "\"" + " is working.");
			}

			// driver.navigate().back(); ((JavascriptExecutor)
			// driver).executeScript("window.open()"); ArrayList<String> tabs1 = new
			// ArrayList<String>(driver.getWindowHandles());
			// driver.switchTo().window(tabs1.get(0)); Thread.sleep(3000); } driver.quit();

		}

	}
}

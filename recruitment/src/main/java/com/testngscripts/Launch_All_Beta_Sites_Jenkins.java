package com.testngscripts;

import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Launch_All_Beta_Sites_Jenkins {

	@Test
	public void openBetaSite() {

		String key="webdriver.chrome.driver";
		String value="./drivers/chromedriver.exe";
		System.setProperty(key, value);
		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("http://beta.simplymarketingjobs.co.uk/");

		((JavascriptExecutor) driver).executeScript("window.open()");
		ArrayList<String> tabs1 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs1.get(1));
		driver.get("http://beta.simplysalesjobs.co.uk/");
		
		System.out.println("All BETA sites are opened in Browser");  
	
	}
}

package com.loadtime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageLoadTesTime {

	public static void main(String[] args) {
		String value = "webdriver.chrome.driver";
		String key = "./drivers/chromedriver.exe";
		System.setProperty(value, key);

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		long starttime = System.currentTimeMillis();
		driver.get("http://www.aviationjobsearch.com/");
		//driver.get("http://www.aviationjobsearch.com/careers/minisites-ajs-test");
		long finishtime = System.currentTimeMillis();

		long loadtime = finishtime - starttime;
		System.out.println("Page load time: " + loadtime);
		
		//driver.findElement(By.id("user_name"));
		//driver.navigate().to("http://www.simplymarketingjobs.co.uk/");
		
		
	}

}

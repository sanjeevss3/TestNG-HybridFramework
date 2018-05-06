package com.testngscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
*
*@author Sanjeev Chaudhary
*https://github.com/sanjeevss3/
*
*/

public class VerifyTitle {

	@Test
	public void getTitle() {
		String key="webdriver.chrome.driver";
		String value="./drivers/chromedriver.exe";
		System.setProperty(key, value);
		
		WebDriver driver;
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://beta.aviationjobsearch.com/");
		//String actual_title= driver.getTitle(); //Get Title using getTitle() method.
		String page_source_title=driver.getPageSource(); // Get Title using getPageSource() method.
		//String expected_title="Aviation Jobs | Aviation Job Search";
		
		//Type 1
		//Assert.assertEquals(actual_title, expected_title);
		
		//Type 2
		//Assert.assertTrue(actual_title.contains(actual_title));
		Assert.assertTrue(page_source_title.contains("Aviation"));
		System.out.println("Title Matched: ");
		
	}
}

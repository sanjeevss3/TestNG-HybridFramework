package com.htmlunitdrivertesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 *
 * @author Sanjeev Chaudhary 
 * https://github.com/sanjeevss3/
 *
 */

public class TitleVerifyHtmlUnitDriver {

	@Test
	public void verifyAjsTitle() {
		WebDriver driver = new HtmlUnitDriver();
		driver.get("http://beta.aviationjobsearch.com/");
		System.out.println(driver.getTitle());
		String title=driver.getTitle();
		Assert.assertTrue(title.contains("Aviation"));

	}
	
	@Test
	public void verifyAjsTitle1() {
		WebDriver driver = new HtmlUnitDriver();
		driver.get("http://beta.aviationjobsearch.com/");
		System.out.println(driver.getTitle());
		String title=driver.getTitle();
		Assert.assertTrue(title.contains("Selenium"));

	}

}

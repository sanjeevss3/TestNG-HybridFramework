package com.ddf.lmp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page_factory.browser.BrowserFactory;

/**
 *
 * @author Sanjeev Chaudhary https://github.com/sanjeevss3/
 *
 */

public class LoginTest {

	@Test
	public void CallTwoClasses() throws Exception {
		WebDriver driver = BrowserFactory.startBrowser("chrome", "https://www.aviationjobsearch.com/");

		MultipleLoginCredentials login = PageFactory.initElements(driver, MultipleLoginCredentials.class);
		login.logintofridayad("sanjeev.chaudhary@fridaymediagroup.com", "test123");

	}

}

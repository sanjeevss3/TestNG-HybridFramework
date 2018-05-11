package page_factory.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import page_factory.healper.BrowserFactory;
import page_factory.javapages.Login_Page_PageFactory;

/**
 *
 * @author Sanjeev Chaudhary 
 * https://github.com/sanjeevss3/
 *
 */

public class VerifyAJSLogin_PageFactory {

	@Test
	public void checkValidUser() {

		// This will launch browser and specific URL
		WebDriver driver = BrowserFactory.startBrowser("firefox", "https://beta.aviationjobsearch.com/");

		// Created page object using page factory
		Login_Page_PageFactory loginpage = PageFactory.initElements(driver, Login_Page_PageFactory.class);

		// Call Method
		loginpage.login_AJS_Pagefactory("sanjeev.chaudhary@fridaymediagroup.com", "test123");
	}

}

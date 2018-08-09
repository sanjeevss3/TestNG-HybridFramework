package page_factory.testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.javascript.host.file.File;
import com.hybridFramework.testBase.TestBase;
import com.relevantcodes.extentreports.ExtentReports;

import page_factory.browser.BrowserFactory;
import page_factory.javapages.Login_Page_PageFactory;

/**
 *
 * @author Sanjeev Chaudhary https://github.com/sanjeevss3/
 *
 */

public class VerifyAJSLogin_PageFactory {

	WebDriver driver;
	
	@Test
	public void checkValidUser() throws IOException, InterruptedException {

		// This will launch browser and specific URL
		//WebDriver driver = BrowserFactory.startBrowser("chrome", "http://www.simplysalesjobs.co.uk/");
		
		TestBase browser = new TestBase();
		TestBase screenshot =new TestBase();
		screenshot.getscreenshot(driver,"browserstarted");
		driver = browser.startBrowser("chrome", "https://beta.aviationjobsearch.com/");
		 //screenshot.getscreenshot(driver,"aviationhomepage");
		
		// WebDriver driver = TestBase.getBrowser("ie");
		// driver.get( "https://beta.aviationjobsearch.com/");

		// Created page object using page factory
		Login_Page_PageFactory loginpage = PageFactory.initElements(driver, Login_Page_PageFactory.class);
		
		// Call Method
		loginpage.login_AJS_Pagefactory("sanjeev.chaudhary@fridaymediagroup.com", "test123");
		Thread.sleep(5000);
		//screenshot.getscreenshot(driver,"user loggedIn");
		driver.findElement(By.xpath("//*[@id='file_upload_button']")).sendKeys("d:\\logos.jpg");
		//driver.close();

	}
	
//	@AfterMethod
//	public void teardown(ITestResult result) {
//		if(ITestResult.FAILURE==result.getStatus()) {
//			TestBase screenshot =new TestBase();
//			screenshot.getscreenshot(driver, result.getName());
//		}
//		
//	}

}

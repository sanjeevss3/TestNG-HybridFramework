package page_factory.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.hybridFramework.testBase.TestBase;

import page_factory.javapages.Login_Page_POM;

/**
 *
 * @author Sanjeev Chaudhary 
 * https://github.com/sanjeevss3/
 *
 */

public class VerifyAJSLogin_POM extends TestBase{

	@Test
	public void verifyLoginPage() {

//		String key = "webdriver.chrome.driver";
//		String value = "./drivers/chromedriver.exe";
//		System.setProperty(key, value);
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();

		TestBase objbrowser=new TestBase();
		objbrowser.startBrowser("firefox","https://beta.aviationjobsearch.com/");
		//driver.get("https://beta.aviationjobsearch.com/");
		Login_Page_POM objlogin = new Login_Page_POM(driver);

		/* Normal ways to call method
		objlogin.login_click();
		objlogin.usename();
		objlogin.password(); 			
		objlogin.clickOnLoginButton(); */
		
	/*	objlogin.login_click();
		objlogin.usename("sanjeev.chaudhary@fridaymediagroup.com");
		objlogin.password("test123"); 
		objlogin.clickOnLoginButton(); */
		
		objlogin.loginToPage("sanjeev.chaudhary@fridaymediagroup.com", "test123");
		driver.quit();

	}
}

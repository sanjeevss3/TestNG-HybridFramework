package zzzzz;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import com.hybridFramework.testBase.TestBase;

/**
*
*@author Sanjeev Chaudhary
*https://github.com/sanjeevss3/
*
*/

public class OpenSites {

	WebDriver driver;
	@Test
	public void openURL() throws InterruptedException {

			TestBase test=new TestBase();
			test.startBrowser("chrome", "https://www.aviationjobsearch.com/");
			Thread.sleep(5000);
			driver.navigate().refresh();
			System.out.println("Page refresh finished");

	
	}
}

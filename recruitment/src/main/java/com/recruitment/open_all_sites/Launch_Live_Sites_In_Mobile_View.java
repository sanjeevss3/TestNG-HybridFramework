package com.recruitment.open_all_sites;

import java.util.ArrayList;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
*
* @author Sanjeev Chaudhary 
*
*/
public class Launch_Live_Sites_In_Mobile_View {

	public static void main(String agrs[]) throws InterruptedException {

		// Firefox browser property details
		// System.setProperty("webdriver.gecko.driver",
		// "D:\\Selenium_Drivers\\geckodriver.exe");
		// WebDriver driver = new FirefoxDriver();

		// Chrome browser property details
		// System.setProperty("webdriver.chrome.driver","D:\\Selenium_Drivers\\chromedriver.exe");
		String value = "webdriver.chrome.driver";
		String key = "./drivers/chromedriver.exe";
		System.setProperty(value, key);

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("http://www.simplymarketingjobs.co.uk/mobile");

		((JavascriptExecutor) driver).executeScript("window.open()");
		ArrayList<String> tabs1 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs1.get(1));
		driver.get("http://www.simplysalesjobs.co.uk/mobile");

		((JavascriptExecutor) driver).executeScript("window.open()");
		ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs2.get(2));
		driver.get("http://www.simplylawjobs.com/mobile");

		((JavascriptExecutor) driver).executeScript("window.open()");
		ArrayList<String> tabs3 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs3.get(3));
		driver.get("http://www.inautomotive.com/mobile");

		((JavascriptExecutor) driver).executeScript("window.open()");
		ArrayList<String> tabs4 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs4.get(4));
		driver.get("http://www.aviationjobsearch.com/mobile");

		((JavascriptExecutor) driver).executeScript("window.open()");
		ArrayList<String> tabs5 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs5.get(5));
		driver.get("http://us.aviationjobsearch.com/mobile");

		((JavascriptExecutor) driver).executeScript("window.open()");
		ArrayList<String> tabs6 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs6.get(6));
		driver.get("http://www.traveljobsearch.com/mobile");

		((JavascriptExecutor) driver).executeScript("window.open()");
		ArrayList<String> tabs7 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs7.get(7));
		driver.get("http://beta.jobs.cabincrew.com/mobile");

		((JavascriptExecutor) driver).executeScript("window.open()");
		ArrayList<String> tabs8 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs8.get(8));
		driver.get("http://jobs.natives.co.uk/mobile");

		((JavascriptExecutor) driver).executeScript("window.open()");
		ArrayList<String> tabs9 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs9.get(9));
		driver.get("http://www.simplyengineeringjobs.com/mobile");

		((JavascriptExecutor) driver).executeScript("window.open()");
		ArrayList<String> tabs10 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs10.get(10));
		driver.get("http://www.careersinrecruitment.com/mobile");

		((JavascriptExecutor) driver).executeScript("window.open()");
		ArrayList<String> tabs11 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs11.get(11));
		driver.get("https://www.simplyhrjobs.co.uk/mobile");

		((JavascriptExecutor) driver).executeScript("window.open()");
		ArrayList<String> tabs12 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs12.get(12));
		driver.get("http://www.simplyofficejobs.co.uk/mobile");

		((JavascriptExecutor) driver).executeScript("window.open()");
		ArrayList<String> tabs13 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs13.get(13));
		driver.get("http://www.simplyhoteljobs.com/mobile");

		((JavascriptExecutor) driver).executeScript("window.open()");
		ArrayList<String> tabs14 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs14.get(14));
		driver.get("http://www.renewableenergyjobs.com/mobile");

		((JavascriptExecutor) driver).executeScript("window.open()");
		ArrayList<String> tabs15 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs15.get(15));
		driver.get("http://us.inautomotive.com/mobile");

		((JavascriptExecutor) driver).executeScript("window.open()");
		ArrayList<String> tabs16 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs16.get(16));
		driver.get("http://us.simplyhoteljobs.com/mobile");

		((JavascriptExecutor) driver).executeScript("window.open()");
		ArrayList<String> tabs17 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs17.get(17));
		driver.get("http://www.simplyitsalesjobs.co.uk/mobile");

		((JavascriptExecutor) driver).executeScript("window.open()");
		ArrayList<String> tabs18 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs18.get(18));
		driver.get("http://www.simplymediasalesjobs.co.uk/mobile");
		System.out.println("All 20 Live sites are opend in mobile view");
		
		((JavascriptExecutor) driver).executeScript("window.open()");
		ArrayList<String> tabs19 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs19.get(19));
		driver.get("http://www.jobsinbrighton.co.uk/mobile");
	}

}

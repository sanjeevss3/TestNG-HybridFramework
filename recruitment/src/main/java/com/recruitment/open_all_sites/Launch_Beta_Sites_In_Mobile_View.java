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
public class Launch_Beta_Sites_In_Mobile_View {
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
		driver.get("http://beta.simplymarketingjobs.co.uk/mobile");

		((JavascriptExecutor) driver).executeScript("window.open()");
		ArrayList<String> tabs1 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs1.get(1));
		driver.get("http://beta.simplysalesjobs.co.uk/mobile");

		((JavascriptExecutor) driver).executeScript("window.open()");
		ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs2.get(2));
		driver.get("http://beta.simplylawjobs.com/mobile");

		((JavascriptExecutor) driver).executeScript("window.open()");
		ArrayList<String> tabs3 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs3.get(3));
		driver.get("http://beta.inautomotive.com/mobile");

		((JavascriptExecutor) driver).executeScript("window.open()");
		ArrayList<String> tabs4 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs4.get(4));
		driver.get("http://beta.aviationjobsearch.com/mobile");

		((JavascriptExecutor) driver).executeScript("window.open()");
		ArrayList<String> tabs5 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs5.get(5));
		driver.get("http://beta.us.aviationjobsearch.com/mobile");

		((JavascriptExecutor) driver).executeScript("window.open()");
		ArrayList<String> tabs6 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs6.get(6));
		driver.get("http://beta.traveljobsearch.com/mobile");

		((JavascriptExecutor) driver).executeScript("window.open()");
		ArrayList<String> tabs7 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs7.get(7));
		driver.get("http://beta.jobs.cabincrew.com/mobile");

		((JavascriptExecutor) driver).executeScript("window.open()");
		ArrayList<String> tabs8 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs8.get(8));
		driver.get("http://beta.jobs.natives.co.uk/mobile");

		((JavascriptExecutor) driver).executeScript("window.open()");
		ArrayList<String> tabs9 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs9.get(9));
		driver.get("http://beta.simplyengineeringjobs.com/mobile");

		((JavascriptExecutor) driver).executeScript("window.open()");
		ArrayList<String> tabs10 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs10.get(10));
		driver.get("http://beta.careersinrecruitment.com/mobile");

		((JavascriptExecutor) driver).executeScript("window.open()");
		ArrayList<String> tabs11 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs11.get(11));
		driver.get("https://beta.simplyhrjobs.co.uk/mobile");

		((JavascriptExecutor) driver).executeScript("window.open()");
		ArrayList<String> tabs12 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs12.get(12));
		driver.get("http://beta.simplyofficejobs.co.uk/mobile");

		((JavascriptExecutor) driver).executeScript("window.open()");
		ArrayList<String> tabs13 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs13.get(13));
		driver.get("http://beta.simplyhoteljobs.com/mobile");

		((JavascriptExecutor) driver).executeScript("window.open()");
		ArrayList<String> tabs14 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs14.get(14));
		driver.get("http://beta.renewableenergyjobs.com/mobile");

		((JavascriptExecutor) driver).executeScript("window.open()");
		ArrayList<String> tabs15 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs15.get(15));
		driver.get("http://beta.us.inautomotive.com/mobile");

		((JavascriptExecutor) driver).executeScript("window.open()");
		ArrayList<String> tabs16 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs16.get(16));
		driver.get("http://beta.us.simplyhoteljobs.com/mobile");

		((JavascriptExecutor) driver).executeScript("window.open()");
		ArrayList<String> tabs17 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs17.get(17));
		driver.get("http://beta.simplyitsalesjobs.co.uk/mobile");

		((JavascriptExecutor) driver).executeScript("window.open()");
		ArrayList<String> tabs18 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs18.get(18));
		driver.get("http://beta.simplymediasalesjobs.co.uk/mobile");
	}

}

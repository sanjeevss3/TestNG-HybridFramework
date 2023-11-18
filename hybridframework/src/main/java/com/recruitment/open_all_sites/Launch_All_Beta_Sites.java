package com.recruitment.open_all_sites;

import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
*
* @author Sanjeev Chaudhary 
*
*/
public class Launch_All_Beta_Sites {

	public static void main(String agrs[]) throws InterruptedException {

		// Firefox browser property details
//		 System.setProperty("webdriver.gecko.driver", "C:\\Users\\QA Team\\git\\Recruitment\\recruitment\\drivers\\geckodriver.exe");
//		 WebDriver driver = new FirefoxDriver();

		// Chrome browser property details
		// System.setProperty("webdriver.chrome.driver","D:\\Selenium_Drivers\\chromedriver.exe");
		String key="webdriver.chrome.driver";
		String value="./drivers/chromedriver.exe";
		System.setProperty(key, value);
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("http://beta.simplymarketingjobs.co.uk/");

		((JavascriptExecutor) driver).executeScript("window.open()");
		ArrayList<String> tabs1 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs1.get(1));
		driver.get("http://beta.simplysalesjobs.co.uk/");
		
	/*  Scroll down window to 700 position.
		Thread.sleep(3000);
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,700)");
		
		driver.findElement(By.xpath("html/body/footer/div[1]/div[2]/ul/li[3]/a")).click();
		driver.findElement(By.linkText("Associations")).click();
		
		//Scroll down to a particular element of a page. 
		WebElement element=driver.findElement(By.xpath("html/body/footer/div[1]/div[2]/ul/li[3]/a"));
    	((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView()", element);
		((JavascriptExecutor)driver).executeAsyncScript("arguments[0].scrollIntoView()", element); */

		((JavascriptExecutor) driver).executeScript("window.open()");
		ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs2.get(2));
		driver.get("http://beta.simplylawjobs.com/");

		((JavascriptExecutor) driver).executeScript("window.open()");
		ArrayList<String> tabs3 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs3.get(3));
		driver.get("http://beta.inautomotive.com/");

		((JavascriptExecutor) driver).executeScript("window.open()");
		ArrayList<String> tabs4 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs4.get(4));
		driver.get("http://beta.aviationjobsearch.com/");

		((JavascriptExecutor) driver).executeScript("window.open()");
		ArrayList<String> tabs5 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs5.get(5));
		driver.get("http://beta.us.aviationjobsearch.com/");

		((JavascriptExecutor) driver).executeScript("window.open()");
		ArrayList<String> tabs6 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs6.get(6));
		driver.get("http://beta.traveljobsearch.com/");

		((JavascriptExecutor) driver).executeScript("window.open()");
		ArrayList<String> tabs7 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs7.get(7));
		driver.get("http://beta.jobs.cabincrew.com/");

		((JavascriptExecutor) driver).executeScript("window.open()");
		ArrayList<String> tabs8 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs8.get(8));
		driver.get("http://beta.jobs.natives.co.uk/");

		((JavascriptExecutor) driver).executeScript("window.open()");
		ArrayList<String> tabs9 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs9.get(9));
		driver.get("http://beta.simplyengineeringjobs.com/");

		((JavascriptExecutor) driver).executeScript("window.open()");
		ArrayList<String> tabs10 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs10.get(10));
		driver.get("http://beta.careersinrecruitment.com/");

		((JavascriptExecutor) driver).executeScript("window.open()");
		ArrayList<String> tabs11 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs11.get(11));
		driver.get("https://beta.simplyhrjobs.co.uk/");

		((JavascriptExecutor) driver).executeScript("window.open()");
		ArrayList<String> tabs12 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs12.get(12));
		driver.get("http://beta.simplyofficejobs.co.uk/");

		((JavascriptExecutor) driver).executeScript("window.open()");
		ArrayList<String> tabs13 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs13.get(13));
		driver.get("http://beta.simplyhoteljobs.com/");

		((JavascriptExecutor) driver).executeScript("window.open()");
		ArrayList<String> tabs14 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs14.get(14));
		driver.get("http://beta.renewableenergyjobs.com/");

		((JavascriptExecutor) driver).executeScript("window.open()");
		ArrayList<String> tabs15 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs15.get(15));
		driver.get("http://beta.us.inautomotive.com/");

		((JavascriptExecutor) driver).executeScript("window.open()");
		ArrayList<String> tabs16 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs16.get(16));
		driver.get("http://beta.us.simplyhoteljobs.com/");

		((JavascriptExecutor) driver).executeScript("window.open()");
		ArrayList<String> tabs17 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs17.get(17));
		driver.get("http://beta.simplyitsalesjobs.co.uk/");

		((JavascriptExecutor) driver).executeScript("window.open()");
		ArrayList<String> tabs18 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs18.get(18));
		driver.get("http://beta.simplymediasalesjobs.co.uk/");

		((JavascriptExecutor) driver).executeScript("window.open()");
		ArrayList<String> tabs19 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs19.get(19));
		driver.get("http://beta.jobsinbrighton.co.uk/");

		System.out.println("All BETA sites are opened in Browser");  
	}
}

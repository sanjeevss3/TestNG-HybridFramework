package com.recruitment.open_all_sites;

import java.sql.Driver;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;

/**
*
* @author Sanjeev Chaudhary 
*
*/
public class Launch_All_Live_Sites {

	public static void main(String agrs[]) throws InterruptedException {

		// Firefox browser property details
		// System.setProperty("webdriver.gecko.driver",
		// "D:\\Selenium_Drivers\\geckodriver.exe");
		// WebDriver driver = new FirefoxDriver();

		// Chrome browser property details
		// System.setProperty("webdriver.chrome.driver",
		// "D:\\Selenium_Drivers\\chromedriver.exe");
		String value = "webdriver.chrome.driver";
		String key = "./drivers/chromedriver.exe";
		System.setProperty(value, key);

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://www.simplymarketingjobs.co.uk/");
		driver.findElement(By.linkText("Newest Jobs")).click();

		((JavascriptExecutor) driver).executeScript("window.open()");
		ArrayList<String> tabs1 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs1.get(1));
		driver.get("http://www.simplysalesjobs.co.uk/");
		//driver.findElement(By.linkText("Newest Jobs")).click();

		((JavascriptExecutor) driver).executeScript("window.open()");
		ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs2.get(2)); 
		driver.get("http://www.simplylawjobs.com/");
		driver.findElement(By.linkText("Newest Jobs")).click();

		((JavascriptExecutor) driver).executeScript("window.open()");
		ArrayList<String> tabs3 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs3.get(3));
		driver.get("http://www.google.com");
		//driver.get("http://www.inautomotive.com");
		//driver.findElement(By.linkText("Newest Jobs")).click();

		((JavascriptExecutor) driver).executeScript("window.open()");
		ArrayList<String> tabs4 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs4.get(4));
		driver.get("http://www.aviationjobsearch.com/");
		//driver.findElement(By.linkText("Newest Jobs")).click();

		((JavascriptExecutor) driver).executeScript("window.open()");
		ArrayList<String> tabs5 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs5.get(5));
		driver.get("http://us.aviationjobsearch.com/");
		//driver.findElement(By.linkText("Newest Jobs")).click();

		((JavascriptExecutor) driver).executeScript("window.open()");
		ArrayList<String> tabs6 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs6.get(6));
		driver.get("http://www.traveljobsearch.com/");
	//	driver.findElement(By.linkText("Newest Jobs")).click();

		((JavascriptExecutor) driver).executeScript("window.open()");
		ArrayList<String> tabs7 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs7.get(7));
		driver.get("http://jobs.cabincrew.com/");
		//driver.findElement(By.linkText("Newest Jobs")).click();

		((JavascriptExecutor) driver).executeScript("window.open()");
		ArrayList<String> tabs8 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs8.get(8));
		driver.get("http://jobs.natives.co.uk/");
		//driver.findElement(By.linkText("Newest Jobs")).click();

		((JavascriptExecutor) driver).executeScript("window.open()");
		ArrayList<String> tabs9 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs9.get(9));
		driver.get("http://www.simplyengineeringjobs.com/");
		//driver.findElement(By.linkText("Newest Jobs")).click();

		((JavascriptExecutor) driver).executeScript("window.open()");
		ArrayList<String> tabs10 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs10.get(10));
		//driver.get("http://www.careersinrecruitment.com/"); // This site is being blocked by anti virus.
		driver.get("http://fridaymediagroup.com/");
		//driver.findElement(By.linkText("Newest Jobs")).click(); 

		((JavascriptExecutor) driver).executeScript("window.open()");
		ArrayList<String> tabs11 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs11.get(11));
		driver.get("https://www.simplyhrjobs.co.uk/");
	//	driver.findElement(By.linkText("Newest Jobs")).click();

		((JavascriptExecutor) driver).executeScript("window.open()");
		ArrayList<String> tabs12 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs12.get(12));
		driver.get("http://www.simplyofficejobs.co.uk/");
		//driver.findElement(By.linkText("Newest Jobs")).click();

		((JavascriptExecutor) driver).executeScript("window.open()");
		ArrayList<String> tabs13 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs13.get(13));
		driver.get("http://www.simplyhoteljobs.com/");
		//driver.findElement(By.linkText("Newest Jobs")).click();

		((JavascriptExecutor) driver).executeScript("window.open()");
		ArrayList<String> tabs14 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs14.get(14));
		driver.get("http://www.renewableenergyjobs.com/");
		//driver.findElement(By.linkText("Newest Jobs")).click();

		((JavascriptExecutor) driver).executeScript("window.open()");
		ArrayList<String> tabs15 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs15.get(15));
		driver.get("http://us.inautomotive.com/");
		//driver.findElement(By.linkText("Newest Jobs")).click();

		((JavascriptExecutor) driver).executeScript("window.open()");
		ArrayList<String> tabs16 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs16.get(16));
		driver.get("http://us.simplyhoteljobs.com/");
	//	driver.findElement(By.linkText("Newest Jobs")).click();

		((JavascriptExecutor) driver).executeScript("window.open()");
		ArrayList<String> tabs17 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs17.get(17));
		driver.get("http://www.simplyitsalesjobs.co.uk/");
	//	driver.findElement(By.linkText(".//*[@id='btn_search']")).click();

		((JavascriptExecutor) driver).executeScript("window.open()");
		ArrayList<String> tabs18 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs18.get(18));
		driver.get("http://www.simplymediasalesjobs.co.uk/");
	//	driver.findElement(By.linkText(".//*[@id='btn_search']")).click();

		((JavascriptExecutor) driver).executeScript("window.open()");
		ArrayList<String> tabs19 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs19.get(19));
		driver.get("http://www.jobsinbrighton.co.uk/");
		//driver.findElement(By.linkText(".//*[@id='btn_search']")).click();
		

		System.out.println("All LIVE sites are opened in Browser");

		// ==========================================================================================
		// Open link into new tab from opened URL
		/*
		 * String selectnewtab = Keys.chord(Keys.CONTROL, Keys.RETURN);
		 * driver.findElement(By.linkText("Newest Jobs")).sendKeys(selectnewtab);
		 * 
		 * // Move to the 2nd open tab ArrayList<String> tabs = new
		 * ArrayList<String>(driver.getWindowHandles());
		 * //driver.switchTo().window(tabs.get(2));
		 * 
		 * String selectnewtab1 = Keys.chord(Keys.CONTROL, Keys.RETURN);
		 * driver.findElement(By.linkText("Newest Jobs")).sendKeys(selectnewtab1);
		 * //driver.switchTo().window(tabs.get(2));
		 * 
		 * String selectnewtab2 = Keys.chord(Keys.CONTROL, Keys.RETURN);
		 * driver.findElement(By.linkText("Upload CV")).sendKeys(selectnewtab2);
		 * //driver.switchTo().window(tabs.get(3));
		 */

		// driver.findElement(By.linkText("Login")).click();
		/*
		 * driver.findElement(By.id("login_click")).click();
		 * 
		 * Thread.sleep(5000);
		 * driver.findElement(By.xpath(".//*[@id='signin_email']")).sendKeys(
		 * "sanjeev.chaudhary@fridaymediagroup.com");
		 * driver.findElement(By.xpath(".//*[@id='signin_password']")).sendKeys(
		 * "test123");
		 * driver.findElement(By.xpath(".//*[@id='login_box']/div[2]/div/form/input[3]")
		 * ).click();
		 * 
		 * String selectnewtab = Keys.chord(Keys.CONTROL, Keys.RETURN);
		 * driver.findElement(By.linkText("Newest Jobs")).sendKeys(selectnewtab);
		 * 
		 * driver.findElement(By.xpath(".//*[@id='candidate_job_search_name']")).
		 * sendKeys("Sotware Testing");
		 * driver.findElement(By.xpath(".//*[@id='candidate_job_search_keyword']")).
		 * sendKeys("Sotware Testing");
		 * 
		 * 
		 * // WebDriverWait wait = new WebDriverWait(driver, 5); //
		 * driver.findElement(By.linkText("Newest Jobs")).click();
		 * 
		 * // Thread.sleep(5000); // String selectnewtab3 = Keys.chord(Keys.CONTROL,
		 * Keys.RETURN); //
		 * driver.findElement(By.linkText("Recruiters")).sendKeys(selectnewtab3); //
		 * driver.switchTo().window(tabs.get(4));
		 * 
		 * // driver.findElement(By.className("radius button hide-for-small-only //
		 * recruiters_btn")).click(); /*
		 * driver.findElement(By.linkText("Recruiters")).click();
		 * 
		 * Thread.sleep(5000); driver.findElement(By.name("signin[email]")).sendKeys(
		 * "Nicola.campbell@fridaymediagroup.com"); Thread.sleep(2000);
		 * driver.findElement(By.name("signin[password]")).sendKeys("Hawaii50");
		 * Thread.sleep(2000);
		 */

		/*
		 * driver.findElement(By.linkText("Recruiters")).click(); new
		 * WebDriverWait(driver,
		 * 90).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
		 * ".//*[@id='email']"))).sendKeys("Nicola.campbell@fridaymediagroup.com"); new
		 * WebDriverWait(driver,
		 * 90).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
		 * ".//*[@id='pass']"))).sendKeys("Hawaii50");
		 * driver.findElement(By.name("signin_button")).click();
		 * 
		 */

		// String S = null;
		// ((JavascriptExecutor)driver).executeScript(S,
		// "window.open('about:blank',_blank)");

		// driver.findElement(By.xpath(".//*[@id='job_search']/div/div[5]/button")).click();

		// driver.findElement(By.xpath(".//*[@id='job_search']/div/div[5]/button")).click();

		// ((JavaScriptExecutor)driver).executeScript(S:"window.open('about:blank',_blank)");

		// driver.get("https://www.facebook.com"); // open facebook
		// JavascriptExecutor js = (JavascriptExecutor) driver;
		// js.executeScript("window.open('about:blank', _blank)");
		/*
		 * WebDriver driver = new ChromeDriver(); String currWindow =
		 * driver.getWindowHandle(); driver.manage().window().maximize();
		 * driver.get("http://www.seleniumhq.org/download/");
		 * System.out.println(driver.getTitle());
		 * 
		 * 
		 * 
		 * Actions act = new Actions(driver);
		 * act.keyDown(Keys.CONTROL).sendKeys("t").keyUp(Keys.CONTROL).build().perform()
		 * ; // Open new tab Set<String windowsList = driver.getWindowHandles(); for
		 * (String str : windowsList) { if (!str.equals(currWindow)) {
		 * driver.switchTo().window(str); } } driver.get("https://www.facebook.com"); //
		 * open facebook
		 */

		// Actions newTab = new Actions(driver);
		// newTab.sendKeys(Keys.CONTROL + "t").perform();

		// WebElement element = driver.findElement(By.cssSelector("body"));
		// Actions actionOpenLinkInNewTab = new Actions(driver);
		// actionOpenLinkInNewTab.moveToElement(element).keyDown(Keys.CONTROL).click(element).keyUp(Keys.CONTROL).perform();

		// WebElement e= driver.findElement(By.cssSelector(abc)).sendKeys(Keys.CONTROL +
		// "t");

		// driver.findElement(By.cssSelector("body")).sendKeys("https://www.facebook.com/");
		// String NewTabLink = Keys.chord(Keys.CONTROL,"t");
		// driver.get("https://www.facebook.com/");
		// driver.findElement(By.linkText("https://www.facebook.com/")).sendKeys(NewTabLink
		// );
		/*
		 * //open a new tab WebElement e=
		 * driver.findElement(By.cssSelector(abc)).sendKeys(Keys.CONTROL + "t");
		 * 
		 * //switch control to new tab e.sendKeys(Keys.CONTROL + "\t"); {
		 * 
		 * }
		 */

		// driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"\t");
		// driver.get("https://www.facebook.com/");
		// System.out.println(driver.getTitle());
	}
}
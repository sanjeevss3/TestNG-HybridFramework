package com.hybridFramework.testBase;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.eclipse.jetty.util.log.JavaUtilLog;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class TestBase {

	public WebDriver driver;
	public Properties OR;
	public File f1;
	public FileInputStream file;

	// Take report in HTML format.
	public static ExtentReports extent;
	public static ExtentTest test;

	static {
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat formator = new SimpleDateFormat("dd_mm_yy_hh_mm_ss");
		extent = new ExtentReports(
				System.getProperty("user.dir") + "\\src\\main\\java\\com\\hybridFramework\\report\\test"
						+ formator.format(calendar.getTime()) + ".html",
				false);
	}

	// Open Browsers configuration
	public WebDriver startBrowser(String browsername, String url) {
		if (browsername.equalsIgnoreCase("chrome")) {
			String value = "webdriver.chrome.driver";
			String key = "./drivers/chromedriver.exe";
			System.setProperty(value, key);
			driver = new ChromeDriver();

		} else if (browsername.equalsIgnoreCase("firefox")) {
			String key = "webdriver.gecko.driver";
			String value = "./drivers/geckodriver.exe";
			System.setProperty(key, value);
			driver = new FirefoxDriver();

		} else if (browsername.equalsIgnoreCase("IE")) {
			String key = "webdriver.ie.driver";
			String value = "./drivers/IEDriverServer.exe";
			System.setProperty(key, value);
			driver = new InternetExplorerDriver();
		} else if (browsername.equalsIgnoreCase("safari")) {
			driver = new SafariDriver(); // SafariDriver requires Safari 10 running on OSX El Capitan or greater.
		}

		driver.manage().window().maximize();
		driver.get(url);
		return driver;
	}

	/*
	 * public void getBrowser(String browser, String url) { if
	 * (System.getProperty("os.name").contains("Window")) ;
	 * 
	 * if (browser.equalsIgnoreCase("firefox")) { String key =
	 * "webdriver.gecko.driver"; String value = "./drivers/geckodriver.exe";
	 * System.setProperty(key, value); driver = new FirefoxDriver(); } else if
	 * (browser.equalsIgnoreCase("chrome")) { String value =
	 * "webdriver.chrome.driver"; String key = "./drivers/chromedriver.exe";
	 * System.setProperty(value, key); driver = new ChromeDriver(); } else if
	 * (browser.equalsIgnoreCase("ie")) { String key = "webdriver.ie.driver"; String
	 * value = "./drivers/IEDriverServer.exe"; System.setProperty(key, value);
	 * driver = new InternetExplorerDriver(); }else
	 * if(browser.equalsIgnoreCase("safari")) { driver=new SafariDriver(); //
	 * SafariDriver requires Safari 10 running on OSX El Capitan or greater. }
	 * 
	 * else { System.out.println("Browser does not find"); }
	 * driver.manage().window().maximize(); driver.get(url);
	 * 
	 * }
	 */

	// Take screenshot and store at a location.
	public void getscreenshot(WebDriver driver, String screenshot) {
		try {
			TakesScreenshot takeScreenshot = (TakesScreenshot) driver;
			File scrImage = takeScreenshot.getScreenshotAs(OutputType.FILE);
			File destImage = new File("./screenshots/"+screenshot+".png");
			FileUtils.copyFile(scrImage, destImage);
			System.out.println("Screenshot Taken---------->>>>>>>>>>>>");
		} catch (Exception e) {
			System.out.println("Exception while taking screenshot --->>>"+e.getMessage());
		}

	}

	/*
	 * public String getScreenShot1(String imageName) throws IOException {
	 * 
	 * if (imageName.equals("")) { imageName = "blank"; }
	 * 
	 * try { File image = ((TakesScreenshot)
	 * driver).getScreenshotAs(OutputType.FILE); String imagelocation =
	 * System.getProperty("\\src\\main\\java\\com\\hybridFramework\\screenshot");
	 * 
	 * Calendar calendar = Calendar.getInstance(); SimpleDateFormat formator = new
	 * SimpleDateFormat("dd_mm_yy_hh_mm_ss");
	 * 
	 * String actualimagename = imagelocation + imageName + "_" +
	 * formator.format(calendar.getTime()) + ".png"; File destFile = new
	 * File(actualimagename); FileUtils.copyFile(image, destFile); return
	 * actualimagename; } catch (Exception e) { System.out.println(e.getMessage());
	 * } return imageName;
	 * 
	 * }
	 */

	// Load data from properties file
	public void loadPropertiesFile() throws IOException {
		OR = new Properties();
		f1 = new File(
				System.getProperty("user.dir") + "\\src\\main\\java\\com\\hybridFramework\\config\\config.properties");
		file = new FileInputStream(f1);
		OR.load(file);

		f1 = new File(
				System.getProperty("user.dir") + "\\src\\main\\java\\com\\hybridFramework\\config\\OR.properties");
		file = new FileInputStream(f1);
		OR.load(file);

		f1 = new File(System.getProperty("user.dir")
				+ "\\src\\main\\java\\com\\hybridFramework\\properties\\homepage.properties");
		file = new FileInputStream(f1);
		OR.load(file);
	}

	public void getPropertiesData() {

	}

	// Wait time configuration, Normal wait interval
	public WebElement waitForElement(WebDriver driver, long time, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, time);
		return wait.until(ExpectedConditions.elementToBeClickable(element));

	}

	// polling time configuration
	public WebElement waitForElementwithPollingInterval(WebDriver driver, long time, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, time);
		wait.pollingEvery(5, TimeUnit.SECONDS);
		wait.ignoring(NoSuchElementException.class);
		return wait.until(ExpectedConditions.elementToBeClickable(element));

	}

	// Implicit wait configuration
	public void implicitWait(long time) {
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
	}

	// Generate report and store into the report test folder/package
	public void getReport(ITestResult result) throws IOException {
		if (result.getStatus() == ITestResult.SUCCESS) {
			test.log(LogStatus.PASS, result.getName() + "Test is Pass");
		} else if (result.getStatus() == ITestResult.SKIP) {
			test.log(LogStatus.SKIP,
					result.getName() + "Test is skipped and skipped reason is: " + result.getThrowable());
		} else if (result.getStatus() == ITestResult.FAILURE) {
			test.log(LogStatus.FAIL, result.getName() + "Test is failed: " + result.getThrowable());
			// String screen = getScreenShot("");
			// test.log(LogStatus.FAIL, test.addScreenCapture(screen));
		} else if (result.getStatus() == ITestResult.STARTED) {
			test.log(LogStatus.INFO, result.getName() + "Test is started");
		}
	}

	@AfterMethod()
	public void afterMethod(ITestResult result) throws IOException {
		getReport(result);
	}

	@BeforeMethod
	public void beforeMethos(Method result) {
		test = extent.startTest(result.getName());
		test.log(LogStatus.INFO, result.getName() + "Test Started");
	}

	@AfterClass()
	public void endTest() {
		driver.quit();
		extent.endTest(test);
		extent.flush();
	}

	// Locator Method for findElement
	public WebElement getLocator(String locator) throws Exception {
		String[] split = locator.split(":");
		String locatorType = split[0];
		String locatorValue = split[1];
		if (locatorType.toLowerCase().equals("id"))
			return driver.findElement(By.id(locatorValue));
		else if (locatorType.toLowerCase().equals("name"))
			return driver.findElement(By.name(locatorValue));
		else if (locatorType.toLowerCase().equals("classname") || (locatorType.toLowerCase().equals("class")))
			return driver.findElement(By.className(locatorValue));
		else if (locatorType.toLowerCase().equals("tagname") || (locatorType.toLowerCase().equals("tag")))
			return driver.findElement(By.tagName(locatorValue));
		else if (locatorType.toLowerCase().equals("linktext") || (locatorType.toLowerCase().equals("link")))
			return driver.findElement(By.linkText(locatorValue));
		else if (locatorType.toLowerCase().equals("partiallinktext"))
			return driver.findElement(By.partialLinkText(locatorValue));
		else if (locatorType.toLowerCase().equals("cssselector") || (locatorType.toLowerCase().equals("css")))
			return driver.findElement(By.cssSelector(locatorValue));
		else if (locatorType.toLowerCase().equals("xpath"))
			return driver.findElement(By.xpath(locatorValue));
		else
			throw new Exception("Unknown locator type '" + locatorType + "'");
	}

	// Locator Method for findElement
	public List<WebElement> getLocators(String locator) throws Exception {
		String[] split = locator.split(":");
		String locatorType = split[0];
		String locatorValue = split[1];
		if (locatorType.toLowerCase().equals("id"))
			return driver.findElements(By.id(locatorValue));
		else if (locatorType.toLowerCase().equals("name"))
			return driver.findElements(By.name(locatorValue));
		else if (locatorType.toLowerCase().equals("classname") || (locatorType.toLowerCase().equals("class")))
			return driver.findElements(By.className(locatorValue));
		else if (locatorType.toLowerCase().equals("tagname") || (locatorType.toLowerCase().equals("tag")))
			return driver.findElements(By.tagName(locatorValue));
		else if (locatorType.toLowerCase().equals("linktext") || (locatorType.toLowerCase().equals("link")))
			return driver.findElements(By.linkText(locatorValue));
		else if (locatorType.toLowerCase().equals("partiallinktext"))
			return driver.findElements(By.partialLinkText(locatorValue));
		else if (locatorType.toLowerCase().equals("cssselector") || (locatorType.toLowerCase().equals("css")))
			return driver.findElements(By.cssSelector(locatorValue));
		else if (locatorType.toLowerCase().equals("xpath"))
			return driver.findElements(By.xpath(locatorValue));
		else
			throw new Exception("Unknown locator type '" + locatorType + "'");
	}

	public WebElement getWebElement(String locator) throws Exception {
		return getLocator(OR.getProperty(locator));

	}

	public List<WebElement> getWebElements(String locator) throws Exception {
		return getLocators(OR.getProperty(locator));
	}

	public static void main(String[] args) throws Exception {
		TestBase test = new TestBase();
		test.loadPropertiesFile();
		// test.getWebElement(test.OR.getProperty("username"));
		test.getWebElement("username");
		// System.out.println(test.OR.getProperty("url"));
		// System.out.println(test.OR.getProperty("username"));

	}
}

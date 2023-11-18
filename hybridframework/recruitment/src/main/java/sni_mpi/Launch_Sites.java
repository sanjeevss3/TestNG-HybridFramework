package sni_mpi;

import java.util.ArrayList;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_Sites {

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
		driver.get("http://nortonway.com/");

		((JavascriptExecutor) driver).executeScript("window.open()");
		ArrayList<String> tabs1 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs1.get(1));
		driver.get("http://www.paincarsales.co.uk/");

		((JavascriptExecutor) driver).executeScript("window.open()");
		ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs2.get(2));
		driver.get("http://www.chelstononline.co.uk/");

		((JavascriptExecutor) driver).executeScript("window.open()");
		ArrayList<String> tabs3 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs3.get(3));
		driver.get("http://www.gravelwood.co.uk/");

		((JavascriptExecutor) driver).executeScript("window.open()");
		ArrayList<String> tabs4 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs4.get(4));
		driver.get("http://alexandersmotorgroup.co.uk/");

		((JavascriptExecutor) driver).executeScript("window.open()");
		ArrayList<String> tabs5 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs5.get(5));
		driver.get("http://www.somersetmotorhomecentre.co.uk/");

		((JavascriptExecutor) driver).executeScript("window.open()");
		ArrayList<String> tabs6 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs6.get(6));
		driver.get("http://www.northstarsussex.co.uk/");

		((JavascriptExecutor) driver).executeScript("window.open()");
		ArrayList<String> tabs7 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs7.get(7));
		driver.get("http://www.valmontfirearms.com/adverts");

		((JavascriptExecutor) driver).executeScript("window.open()");
		ArrayList<String> tabs8 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs8.get(8));
		driver.get("http://www.ayb.co.uk/");

		((JavascriptExecutor) driver).executeScript("window.open()");
		ArrayList<String> tabs9 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs9.get(9));
		driver.get("http://www.davidmawbyboats.co.uk/");
	}
}

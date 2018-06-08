package page_factory.browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

/**
 *
 * @author Sanjeev Chaudhary https://github.com/sanjeevss3/
 *
 */

public class BrowserFactory {

	static WebDriver driver;

	public static WebDriver startBrowser(String browsername, String url) {
		if (browsername.equalsIgnoreCase("chrome")) {
			String value = "webdriver.chrome.driver";
			String key = "./drivers/chromedriver.exe";
			System.setProperty(value, key); 
			driver = new ChromeDriver();

		} else if (browsername.equalsIgnoreCase("firefox")) {
			String key="webdriver.gecko.driver";
			 String value="./drivers/geckodriver.exe";
			 System.setProperty(key, value);
			 driver=new FirefoxDriver();

		} else if (browsername.equalsIgnoreCase("IE")) {
			String key = "webdriver.ie.driver";
			String value = "./drivers/IEDriverServer.exe";
			System.setProperty(key, value);
			driver = new InternetExplorerDriver();
		} else if(browsername.equalsIgnoreCase("safari")) {
			driver=new SafariDriver(); // SafariDriver requires Safari 10 running on OSX El Capitan or greater.
		}

		driver.manage().window().maximize();
		driver.get(url);
		return driver;
	}

}

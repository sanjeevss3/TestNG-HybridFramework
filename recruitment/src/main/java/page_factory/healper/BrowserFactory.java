package page_factory.healper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 *
 * @author Sanjeev Chaudhary https://github.com/sanjeevss3/
 *
 */

public class BrowserFactory {

	static WebDriver driver;

	public static WebDriver startBrowser(String browsername, String url) {
		if (browsername.equalsIgnoreCase("chrome")) {
			// String key = "WebDriver.driver.chrome";
			// String value = "./driver/chromedriver.exe";
			// System.setProperty(key, value);

			System.setProperty("webdriver.chrome.driver", "C:\\Users\\QA Team\\git\\Recruitment\\recruitment\\drivers");
			driver = new ChromeDriver();

		} else if (browsername.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\QA Team\\git\\Recruitment\\recruitment\\drivers");
			driver = new FirefoxDriver();

		} else if (browsername.equalsIgnoreCase("IE")) {
			System.setProperty("webdriver.ie.driver",
					"C:\\Users\\QA Team\\git\\Recruitment\\recruitment\\drivers\\IEDriverServer.exe");
			driver = new ChromeDriver();
		}

		driver.get(url);
		return driver;
	}

}

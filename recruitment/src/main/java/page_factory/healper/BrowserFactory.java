package page_factory.healper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

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
		}

		driver.manage().window().maximize();
		driver.get(url);
		return driver;
	}

}

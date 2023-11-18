package brokenlink;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.hybridFramework.testBase.TestBase;

/**
 *
 * @author Sanjeev Chaudhary https://github.com/sanjeevss3/
 *
 */

public class BrokenLink {

	static WebDriver driver;

	public static void main(String[] args) {

		TestBase browser = new TestBase();
		driver = browser.startBrowser("firefox", "https://www.aviationjobsearch.com/");

		List<WebElement> links = driver.findElements(By.tagName("a"));

		System.out.println("Total links are " + links.size());

		for (int i = 0; i < links.size(); i++) {

			WebElement ele = links.get(i);

			String url = ele.getAttribute("href");
			System.out.println(url);

			verifyLinkActive(url);

		}

	}

	public static void verifyLinkActive(String linkUrl) {
		try {
			URL url = new URL(linkUrl);

			HttpURLConnection httpConnect = (HttpURLConnection) url.openConnection();

			httpConnect.setConnectTimeout(3000);

			httpConnect.connect();

			if (httpConnect.getResponseCode() == 200) {
				System.out.println(linkUrl + " - " + httpConnect.getResponseMessage());
			}
			if (httpConnect.getResponseCode() == HttpURLConnection.HTTP_NOT_FOUND) {
				System.out.println(linkUrl + " - " + httpConnect.getResponseMessage() + " - " + HttpURLConnection.HTTP_NOT_FOUND);
			}
		} catch (Exception e) {

		}
	}

}

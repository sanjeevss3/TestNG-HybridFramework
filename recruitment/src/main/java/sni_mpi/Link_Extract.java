package sni_mpi;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author Sanjeev Chaudhary https://github.com/sanjeevss3/
 *
 */

public class Link_Extract {

	public static void main(String[] args) {
		String key = "webdriver.chrome.driver";
		String value = "./drivers/chromedriver.exe";

		System.setProperty(key, value);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.bedfordvancentre.co.uk/");
		List<WebElement> links = driver.findElements(By.tagName("a"));

		for (WebElement ele : links)
			System.out.println(ele.getAttribute("href"));

		int count = driver.findElements(By.tagName("a")).size();
		for (int i = 1; i < count; i++) {

			driver.findElements(By.tagName("a")).get(i).click();

		}

	}

}

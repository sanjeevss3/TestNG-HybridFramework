package com.readlinks;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadLink {
	static int linkcount = 0;

	public static void main(String[] args) {

		String key = "webdriver.chrome.driver";
		String value = "./drivers/chromedriver.exe";
		System.setProperty(key, value);

		WebDriver driver = new ChromeDriver();
		// driver.manage().window().maximize();

		driver.get("http://beta.simplylawjobs.com/");

		List<WebElement> linksname = driver.findElements(By.tagName("a"));

		for (WebElement ele : linksname) {

			// ele.click();
			String links = ele.getText();
			System.out.println(ele.getText());
			
			// int linknumber=Integer.parseInt(links);

			// for (String handle1 : driver.getWindowHandles()) {
			// System.out.println(handle1);
			// driver.switchTo().window(handle1);
			// }

			// for(int i=0 ; i < linknumber; i++) {
			// links.
			// }

			// System.out.println("Links on the page: " + links);
			// System.out.println(ele.getAttribute("href"));
		}
	//	System.out.println("Total no. of links on the page: " + links);
		// for (WebElement ele : links) { System.out.println(ele.getText());
		// linkcount++; } System.out.println("Total no. of links on the page: " +
		// linkcount);

	}

}

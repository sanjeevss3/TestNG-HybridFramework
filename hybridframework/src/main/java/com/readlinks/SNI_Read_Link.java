package com.readlinks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
*
*@author Sanjeev Chaudhary
*https://github.com/sanjeevss3/
*
*/

public class SNI_Read_Link {

	public static void main(String[] args) {
		String key = "webdriver.chrome.driver";
		String value = "./drivers/chromedriver.exe";
		System.setProperty(key, value);

		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();

		driver.get("http://snadvanced1.spidersnetpreview.co.uk/");

		List<WebElement> linksname = driver.findElements(By.tagName("a"));

		for (WebElement ele : linksname) {

			//ele.click();
			String links = ele.getText();
			System.out.println(ele.getText());
			//String links = ele.getText();
			// int linknumber=Integer.parseInt(links);

//			for (String handle1 : driver.getWindowHandles()) {
//				System.out.println(handle1);
//				driver.switchTo().window(handle1);
//			}

			// for(int i=0 ; i < linknumber; i++) {
			// links.
			// }

			// System.out.println("Links on the page: " + links);
		//	System.out.println(ele.getAttribute("href"));
		}

		/*
		 * for (WebElement ele : links) { System.out.println(ele.getText());
		 * linkcount++; } System.out.println("Total no. of links on the page: " +
		 * linkcount);
		 */

	}

}

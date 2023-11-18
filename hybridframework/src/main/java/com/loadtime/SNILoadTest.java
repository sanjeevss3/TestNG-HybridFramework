package com.loadtime;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
*
*@author Sanjeev Chaudhary
*https://github.com/sanjeevss3/
*
*/

public class SNILoadTest {
		public static void main(String[] args) {
			String value = "webdriver.chrome.driver";
			String key = "./drivers/chromedriver.exe";
			System.setProperty(value, key);

			WebDriver driver = new ChromeDriver();

			driver.manage().window().maximize();
			
			// driver.get("http://www.simplymarketingjobs.co.uk/");\
			int i = 0;
			for (i = 0; i < 100; i++) {
				long starttime = System.currentTimeMillis();
				driver.get("http://sni-dev-premiercarsupermarket-co-uk.spidersnetpreview.co.uk");
				driver.get("http://sni-dev-premiercarsupermarket-co-uk.spidersnetpreview.co.uk/used/cars");
				driver.get("http://sni-dev-premiercarsupermarket-co-uk.spidersnetpreview.co.uk/used/cars/volkswagen");
				driver.get("http://sni-dev-premiercarsupermarket-co-uk.spidersnetpreview.co.uk/used/cars/audi");
				long finishtime = System.currentTimeMillis();
				long loadtime = finishtime - starttime;
				System.out.println("Page load time " + i + " : " + loadtime);
			}
			System.out.println("Testing finished");
			

						
			//driver.findElement(By.id("user_name"));
			//driver.navigate().to("http://www.simplymarketingjobs.co.uk/");
			
			
		}

}

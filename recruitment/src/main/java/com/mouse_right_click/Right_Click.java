package com.mouse_right_click;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

/**
 *
 * @author Sanjeev Chaudhary https://github.com/sanjeevss3/
 *
 */

public class Right_Click {

	public static void main(String[] args) {

		String key = "webdriver.chrome.driver";
		String value = "./drivers/chromedriver.exe";
		System.setProperty(key, value);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://beta.simplylawjobs.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement newestjobs = driver.findElement(By.xpath(".//*[@id='navigation']/a[2]"));
		Actions action = new Actions(driver);

		// contextClick() method to do right click on the element
		// action.contextClick(newestjobs).build().perform();

		// action.ContextClick(newestjobs).Build().Perform();
		action.contextClick(newestjobs).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();

		// action.contextClick(newestjobs).sendKeys(Keys.DOWN).sendKeys(Keys.ENTER).perform();
		//action.moveToElement(newestjobs).contextClick().sendKeys(Keys.DOWN).sendKeys(Keys.ENTER).perform();

	}

}

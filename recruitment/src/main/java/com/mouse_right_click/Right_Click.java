package com.mouse_right_click;

import java.awt.Desktop.Action;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 *
 * @author Sanjeev Chaudhary 
 * https://github.com/sanjeevss3/
 *
 */

public class Right_Click {

	public static void main(String[] args) {

		String key = "webdriver.chrome.driver";
		String value = "./drivers/chromedriver.exe";
		System.setProperty(key, value);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://beta.aviationjobsearch.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement jobalert=driver.findElement(By.xpath(".//*[@id='navigation']/a[1]"));
		Actions action=new Actions(driver);
		
		WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@id='navigation']/a[1]")));
        WebElement rightClickElement=driver.findElement(By.xpath(".//*[@id='navigation']/a[1]"));
        //contextClick() method to do right click on the element
        action.contextClick(rightClickElement).build().perform();
		
	//	action.ContextClick(jobalert).Build().Perform();
		action.contextClick(jobalert).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		
		
		//action.contextClick(jobalert).sendKeys(Keys.DOWN).sendKeys(Keys.ENTER).perform();
		//action.moveToElement(jobalert).contextClick().sendKeys(Keys.DOWN).sendKeys(Keys.ENTER).perform();

	}

}

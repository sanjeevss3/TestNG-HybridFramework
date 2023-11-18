package zzzzz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.hybridFramework.testBase.TestBase;

/**
*
*@author Sanjeev Chaudhary
*https://github.com/sanjeevss3/
*
*/

public class OpenSites {

	WebDriver driver;
	@Test
	public void openURL() {

			TestBase test=new TestBase();
			test.startBrowser("chrome", "https://www.seleniumhq.org/");
			//Thread.sleep(5000);

			String tooltip=driver.findElement(By.xpath("//li[@id='menu_download']/a")).getAttribute("title");
			
			System.out.println("Tooltip String= "+tooltip);
		//	Assert.assertEquals(tooltip, "Get Selenium");
			
			
		   // driver.get("http://demoqa.com/tooltip/");
//		    WebElement element = driver.findElement(By.xpath(".//*[@id='age']"));
//		    Actions toolAct = new Actions(driver);
//		    toolAct.moveToElement(element).build().perform();
//		    WebElement toolTipElement = driver.findElement(By.cssSelector(".ui-tooltip"));
//		    String toolTipText = toolTipElement.getText();
//		    System.out.println(toolTipText);
	
	}
}

package webtablehandling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import bsh.commands.dir;
import page_factory.healper.BrowserFactory;

/**
*
*@author Sanjeev Chaudhary
*https://github.com/sanjeevss3/
*
*/

public class DynamicWebTableHandle {

	@Test
	public void datePickerDynamically() throws InterruptedException{
		WebDriver driver = BrowserFactory.startBrowser("chrome", "https://www.freecrm.com/index.html");
		driver.manage().deleteAllCookies(); //delete all cookies
		
		//Dymanic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.name("username")).sendKeys("naveenk");
		driver.findElement(By.name("password")).sendKeys("test@123");
		Thread.sleep(3000);		
		driver.findElement(By.xpath(".//*[@id='loginForm']/div/div/input")).click();
		
		driver.switchTo().frame("mainpanel");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath(".//*[@id='navmenu']/ul/li[4]/a")).click();
		
		//*[@id='vContactsForm']/table/tbody/tr[4]/td[2]
		//*[@id='vContactsForm']/table/tbody/tr[5]/td[2]
		//*[@id='vContactsForm']/table/tbody/tr[6]/td[2]
		//*[@id='vContactsForm']/table/tbody/tr[7]/td[2]
		//*[@id='vContactsForm']/table/tbody/tr[8]/td[2]
		//*[@id='vContactsForm']/table/tbody/tr[n]/td[2]
		
		String before_xpath="//*[@id='vContactsForm']/table/tbody/tr[";
		String after_xpath="]/td[2]";
		
		for(int i=4; i<=9;i++) {
			String name=driver.findElement(By.xpath(before_xpath+i+after_xpath)).getText();
			System.out.println(name);
			if(name.contains("12387678")) {
				driver.findElement(By.xpath(".//*[@id='vContactsForm']/table/tbody/tr[6]/td[1]/input")).click();
			}
			
		}
	}
}

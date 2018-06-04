package webtablehandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import page_factory.healper.BrowserFactory;

/**
 *
 * @author Sanjeev Chaudhary https://github.com/sanjeevss3/
 *
 */

public class DatePickerUsingWebTable {

	@Test
	public void datePicker() throws InterruptedException {
		WebDriver driver = BrowserFactory.startBrowser("chrome", "https://www.redbus.in/");
		driver.findElement(By.xpath(".//*[@id='search']/div/div[3]/span")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='rb-calendar_onward_cal']/table/tbody/tr[3]/td[7]")).click();
	}
}

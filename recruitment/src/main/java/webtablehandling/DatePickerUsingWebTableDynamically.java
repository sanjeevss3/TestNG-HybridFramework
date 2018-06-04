package webtablehandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import page_factory.healper.BrowserFactory;

/**
 *
 * @author Sanjeev Chaudhary https://github.com/sanjeevss3/
 *
 */

public class DatePickerUsingWebTableDynamically {

	@Test
	public void datePickerDynamically() throws InterruptedException {
		WebDriver driver = BrowserFactory.startBrowser("chrome", "https://www.redbus.in/");
		driver.findElement(By.xpath(".//*[@id='search']/div/div[3]/span")).click();
		Thread.sleep(3000);

		List<WebElement> dates = driver.findElements(By.xpath(".//*[@id='rb-calendar_onward_cal']/table[1]/td"));
		int total_node = dates.size();
		for (int i = 0; i < total_node; i++) {
			String date = dates.get(i).getText();

			if (date.equalsIgnoreCase("31")) {
				dates.get(i).click();
				break;
			}
		}
	}
}

package popup.window.handles;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.browsertesting.Open_URL_In_IE_FF;

import page_factory.browser.BrowserFactory;

/**
 *
 * @author Sanjeev Chaudhary https://github.com/sanjeevss3/
 *
 */

public class PopUpWindowHandle {

	@Test
	public void pupup() throws InterruptedException {

		WebDriver driver = BrowserFactory.startBrowser("firefox", "https://www.hdfcbank.com/");
		String homepage = driver.getWindowHandle();
		// System.out.println(homepage);

		driver.findElement(By.id("loginsubmit")).click();

		/*
		 * String popuppage=driver.getWindowHandle(); System.out.println(popuppage);
		 */

		Set<String> window = driver.getWindowHandles();
		System.out.println(window.size());

		Iterator iterator = window.iterator();

		String currentwindowid;
		while (iterator.hasNext()) {
			currentwindowid = iterator.next().toString();
			System.out.println(currentwindowid);

			if (currentwindowid.equals(homepage)) {
				driver.switchTo().window(currentwindowid);
				Thread.sleep(5000);
				WebDriverWait wait=new WebDriverWait(driver, 10);
				WebElement elementwait;
				elementwait=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));
				driver.findElement(By.className("btn btn-default redBtn")).click();

			}
		}
	}

}

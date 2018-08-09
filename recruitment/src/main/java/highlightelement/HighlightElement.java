package highlightelement;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.hybridFramework.testBase.TestBase;

/**
 *
 * @author Sanjeev Chaudhary 
 * https://github.com/sanjeevss3/
 *
 */

public class HighlightElement {

	WebDriver driver;

	@Test
	public void highlighterElement() {
		TestBase browser = new TestBase();
		driver = browser.startBrowser("chrome", "https://beta.aviationjobsearch.com/");

		WebElement ele = driver.findElement(By.id("login_click"));
		// Call the highlighterMethod and pass webdriver and WebElement which you want
		// to highlight as arguments.
		highLighterMethod(driver, ele);
	}

	// Creating a custom function
	public void highLighterMethod(WebDriver driver, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 6px solid red;');", element);
	}
}

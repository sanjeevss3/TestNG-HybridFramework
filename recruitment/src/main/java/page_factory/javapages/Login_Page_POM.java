/**
 * 
 */
package page_factory.javapages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 *
 * @author Sanjeev Chaudhary https://github.com/sanjeevss3/
 *
 *         This page contains the login page locators and required methods.
 *
 */

public class Login_Page_POM {
	WebDriver driver;
	By login_click = By.id("login_click");
	By username = By.id("signin_email");
	By password = By.id("signin_password");
	By loginbutton = By.name("signin_button");

	public Login_Page_POM(WebDriver driver1) {
		this.driver = driver1;
	}

	//We can summarize all below methods in one methods
	public void loginToPage(String un, String pass) {
		driver.findElement(login_click).click();
		driver.findElement(username).sendKeys(un);
		driver.findElement(password).sendKeys(pass);
		driver.findElement(loginbutton).click();
	}
	
/*	public void login_click() {
		driver.findElement(login_click).click();
	}

	public void usename(String un) {
		//driver.findElement(username).sendKeys("sanjeev.chaudhary@fridaymediagroup.com"); //Normal procedure
		driver.findElement(username).sendKeys(un);
		
	}

	public void password(String pass) {
		//driver.findElement(password).sendKeys("test123"); //Normal procedure
		driver.findElement(password).sendKeys(pass);
	}

	public void clickOnLoginButton() {
		driver.findElement(loginbutton).click();
	} */
}

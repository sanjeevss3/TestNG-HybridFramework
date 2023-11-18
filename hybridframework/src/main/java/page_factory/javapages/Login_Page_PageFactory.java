package page_factory.javapages;

import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.gargoylesoftware.htmlunit.javascript.host.Window;

/**
 *
 * @author Sanjeev Chaudhary https://github.com/sanjeevss3/
 *
 */

public class Login_Page_PageFactory {
	WebDriver driver;

	public Login_Page_PageFactory(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(id = "login_click")
	@CacheLookup
	WebElement clickonloginmenu;

	@FindBy(how = How.ID, using = "signin_email")
	@CacheLookup
	WebElement username;

	@FindBy(how = How.ID, using = "signin_password")
	@CacheLookup
	WebElement password;

	@FindBy(how = How.NAME, using = "signin_button")
	@CacheLookup
	WebElement loginbutton;

	@FindBy(linkText = "Sanjeev")
	WebElement profilename;

	@FindBy(className = "profile_pic")
	WebElement profile_pic;

	@FindBy(how = How.LINK_TEXT, using = "Forgot password?")
	@CacheLookup
	WebElement forgot_password_link;

	public void login_AJS_Pagefactory(String un, String pass) {
		clickonloginmenu.click();
		username.sendKeys(un);
		password.sendKeys(pass);
		loginbutton.click();
		profilename.click();
	}

}

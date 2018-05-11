package page_factory.javapages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 *
 * @author Sanjeev Chaudhary 
 * https://github.com/sanjeevss3/
 *
 */

public class Login_Page_PageFactory {
	WebDriver driver;

	public Login_Page_PageFactory(WebDriver driver1) {
		this.driver = driver1;
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

	@FindBy(how = How.LINK_TEXT, using = "Forgot password?")
	@CacheLookup
	WebElement forgot_password_link;

	public void login_AJS_Pagefactory(String un, String pass) {
		clickonloginmenu.click();
		username.sendKeys(un);
		password.sendKeys(pass);
		loginbutton.click();
	}

}

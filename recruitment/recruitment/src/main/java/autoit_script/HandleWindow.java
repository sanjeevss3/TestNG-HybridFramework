package autoit_script;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindow {

	public static void main(String[] args) throws Exception {
		String value = "webdriver.chrome.driver";
		String key = "./drivers/chromedriver.exe";
		System.setProperty(value, key);

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		Runtime.getRuntime().exec("D:\\Workspace_Selenium\\AutoIT Script\\HandleAuthentication.exe");
		driver.get("http://stage.friday-ad.co.uk/");

	}

}

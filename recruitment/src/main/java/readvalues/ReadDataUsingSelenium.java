package readvalues;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.hybridFramework.testBase.TestBase;
import com.mysql.jdbc.Driver;

/**
*
*@author Sanjeev Chaudhary
*https://github.com/sanjeevss3/
*
*/

public class ReadDataUsingSelenium {
	
	WebDriver driver;
	

	public static void main(String[] args) {
		
//		TestBase browser = new TestBase();
//		browser.startBrowser("chrome", "https://www.khanacademy.org/math/math-1-2-3/math1/math1-one-var-eq-ineq");
		
		String key="webdriver.chrome.driver";
		String value="./drivers/chromedriver.exe";
		System.setProperty(key, value);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.khanacademy.org/math/math-1-2-3/math1/math1-one-var-eq-ineq");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
//		List<WebElement> ele=driver.findElements(By.name("amount")).getAttrib("value");
		
		String strVal1=driver.findElement(By.name("amount")).getAttribute("value");
		String strVal2=driver.findElement(By.name("amount")).getAttribute("value");
		
		System.out.println(strVal1 +" "+ strVal2);
		
		int val1=Integer.parseInt(strVal1);
		int val2=Integer.parseInt(strVal2);
		int total=val1+val2;
		
		System.out.println("Total count of found number: "+total);
		
		driver.close();

	}

}

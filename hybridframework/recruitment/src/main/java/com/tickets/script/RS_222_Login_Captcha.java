package com.tickets.script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RS_222_Login_Captcha {

	public static void main(String args[]) {
		String value = "webdriver.chrome.driver";
		String key = "./drivers/chromedriver.exe";
		System.setProperty(value, key);

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("http://beta.simplylawjobs.com/");
		driver.findElement(By.xpath(".//*[@id='login_click']")).click();
		int i = 0;
		do {
			driver.findElement(By.xpath(".//*[@id='signin_email']")).sendKeys("abcd@gmail.com");
			driver.findElement(By.xpath(".//*[@id='signin_password']")).sendKeys("test123");
			driver.findElement(By.xpath(".//*[@id='login_box']/div[2]/div/form/input[3]")).click();
			driver.findElement(By.xpath(".//*[@id='signin_email']")).clear();
			driver.findElement(By.xpath(".//*[@id='signin_password']")).clear();

		} while (i < 3);

		driver.findElement(By.xpath(".//*[@id='signin_email']")).clear();
		driver.findElement(By.xpath(".//*[@id='signin_password']")).clear();
		driver.findElement(By.xpath(".//*[@id='signin_email']")).sendKeys("sanjeev.chaudhary@fridaymediagroup.com");
		driver.findElement(By.xpath(".//*[@id='signin_password']")).sendKeys("test123");
		// driver.findElement(By.xpath(".//*[@id='recaptcha-anchor']/div[5]")).click();

		WebElement radioBtn = driver.findElement(By.xpath(".//*[@id='recaptcha-anchor']/div[5]"));
		radioBtn.click();

		driver.findElement(By.xpath(".//*[@id='center_column']/form/div[2]/div[3]/input")).click();
		// driver.findElement(By.xpath(".//*[@id='signin_email']")).clear();
		// driver.findElement(By.xpath(".//*[@id='signin_password']")).clear();

	}

}

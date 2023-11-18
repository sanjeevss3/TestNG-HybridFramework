package com.httpsurl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class HttpsSecureConnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FirefoxProfile fp = new FirefoxProfile();
		
		fp.setAcceptUntrustedCertificates(false);
		
		WebDriver driver = new FirefoxDriver(fp);
		
		driver.get("https://en.wikipedia.org/wiki/ISO_3166-1");
	}

}

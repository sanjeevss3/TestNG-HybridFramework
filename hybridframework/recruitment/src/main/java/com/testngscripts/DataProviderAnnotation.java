package com.testngscripts;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 *
 * @author Sanjeev Chaudhary 
 * https://github.com/sanjeevss3/
 *
 */

public class DataProviderAnnotation {

	@Test(dataProvider = "getData")
	public void dataProvider(String username, String password) {
		System.out.println("Username is: " + username);
		System.out.println("Password is: " + password);
		System.out.print("\n");
	}

	@DataProvider(name = "getData")
	public Object[][] getData() {
		Object[][] data = new Object[3][2];

		data[0][0] = "FirstUsername";
		data[0][1] = "FirstPassword";

		data[1][0] = "SecondUsername";
		data[1][1] = "SecondPassword";

		data[2][0] = "ThirdUsername";
		data[2][1] = "ThirdPassword";

		return data;
	}

}

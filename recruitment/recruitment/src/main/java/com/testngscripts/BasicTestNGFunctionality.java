package com.testngscripts;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 *
 * @author Sanjeev Chaudhary 
 * https://github.com/sanjeevss3/
 *
 */

public class BasicTestNGFunctionality {

	@Test(priority=1, description="Login Details")
	public void loginDetails() {
		System.out.println("This testcase provide login details");
		Assert.assertEquals(12, 12);
	}

	@Test(priority=2, description="Product Details")
	public void product() {
		System.out.println("This testcase provide the product which are in baseket");
	}

	@Test(priority=3, description="List of items to checkout")
	public void checkout() {
		System.out.println("This testcase provide to checkout your product");
	}
}


/*
Note:
	If priority=-3, It is lesser than 1 then -3 priority function execute first.
	description -Message provided in side the description shows after execution in the console along with Test Method.
*/
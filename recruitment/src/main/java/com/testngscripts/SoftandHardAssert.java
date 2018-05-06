package com.testngscripts;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

/**
 *
 * @author Sanjeev Chaudhary 
 * https://github.com/sanjeevss3/
 *
 */

public class SoftandHardAssert {

	@Test
	public void softAssert() {
		SoftAssert assertion = new SoftAssert();
		System.out.println("SoftAssert Test started");
		assertion.assertEquals(12, 13);
		System.out.println("SoftAssert Test completed");
		assertion.assertAll();
	}

	@Test
	public void hartAssert() {
		System.out.println("HardAssert Test Started");
		Assert.assertEquals(12, 13);
		System.out.println("HardAssert Test completed");
	}

}

package com.testngscripts;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 *
 * @author Sanjeev Chaudhary https://github.com/sanjeevss3/
 *
 */

public class AssertionScript1 {

	@Test
	public void test1() {
		String str = "Sanjeev Chaudhary";
		// Assert.assertTrue(str.contains("Sanjeev"), "Name is matching"); //Testcase will pass.
		Assert.assertTrue(str.contains("Vinay"), "Name is matching"); // Testcase will fail.

	}

	@Test
	public void test3() {
		Assert.assertTrue(false); // Expected [true] but found [false]
	}

}

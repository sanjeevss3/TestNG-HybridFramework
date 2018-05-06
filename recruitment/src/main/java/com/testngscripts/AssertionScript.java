package com.testngscripts;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 *
 * @author Sanjeev Chaudhary https://github.com/sanjeevss3/
 *
 */

public class AssertionScript {

	@Test
	public void test1() {
		Assert.assertEquals(12, 13);
	}

	@Test
	public void test2() {
		System.out.println("TestCase 2 started.");
		Assert.assertEquals(12, 13, "Drop down count does not match, please check with developer");
		System.out.println("Testcase 2 completed"); // This message wont print since condition are failing.
	}

	@Test
	public void test3() {
		System.out.println("TestCase 3 started");
		Assert.assertEquals("Hello", "Hello", "Word does not match please raise a bug"); // Message wont print since
																							// condition is matching but
																							// Message only display when condition fails
		System.out.println("TestCase 3 completed");
	}

}

package com.retestfailedtestcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import groovyjarjarasm.asm.commons.AnalyzerAdapter;

/**
*
*@author Sanjeev Chaudhary
*https://github.com/sanjeevss3/
*
*/

public class TestCase1 {
	
	@Test //(retryAnalyzer= com.retestfailedtestcases.RetryAnalizer.class)
	public void testAJS() {
		Assert.assertTrue(false);
		System.out.println("Aviation Job is working as expected");
	}
	
	@Test //(retryAnalyzer= com.retestfailedtestcases.RetryAnalizer.class)
	public void testTJS() {
		Assert.assertTrue(false);
		System.out.println("Travel Job Search is working as expected");
	}

	@Test
	public void testSLJ() {
		System.out.println("Simply Law Job is working as expected");
	}
	
}

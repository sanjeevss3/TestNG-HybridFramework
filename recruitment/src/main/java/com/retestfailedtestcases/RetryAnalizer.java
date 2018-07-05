package com.retestfailedtestcases;

import java.util.ArrayList;
import java.util.List;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.TestNG;

/**
 *
 * @author Sanjeev Chaudhary https://github.com/sanjeevss3/
 *
 */

public class RetryAnalizer implements IRetryAnalyzer {
	
	int counter=0;
	int retrylimit=4;
	
	public boolean retry(ITestResult result) {
		if(counter < retrylimit) {
			counter++;
			return true;
		}
		return false;
		
	}
}


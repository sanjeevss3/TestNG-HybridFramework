package com.retestfailedtestcases;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;

/**
 *
 * @author Sanjeev Chaudhary https://github.com/sanjeevss3/
 *
 */

public class ReturnFaliedTestCases {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("222222222222222");
		TestNG runner = new TestNG();
		List<String> list = new ArrayList<String>();
		list.add(
				"C:\\Users\\QA Team\\git\\Recruitment\\recruitment\\test-output\\SmokeTestScenaios\\testng-failed.xml");
		runner.setTestSuites(list);
		Thread.sleep(5000);
		runner.run();
	}

}

package com.retestfailedtestcases.runner;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;

/**
 *
 * @author Sanjeev Chaudhary https://github.com/sanjeevss3/
 *
 */

public class RerunFaliedTestCases {
	public static void main(String[] args) {
		System.out.println("222222222222222");
		TestNG runner = new TestNG();
		List<String> list = new ArrayList<String>();
		list.add("C:\\Users\\QA Team\\git\\Recruitment\\recruitment\\test-output\\SmokeTestScenaios\\testng-failed.xml");
		runner.setTestSuites(list);
		runner.run();
	}

}

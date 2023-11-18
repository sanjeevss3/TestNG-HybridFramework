package com.testngscripts;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
*
*@author Sanjeev Chaudhary
*https://github.com/sanjeevss3/
*
*/

public class MyApp_DepdencyAnnotation {

	@Test
	public void statApp() {
		
		//Assert.assertEquals(12, 13);
		System.out.println("Staring Application.");
	}
	
	@Test(dependsOnMethods="statApp")
	public void loginApp() {
		System.out.println("Login to Applicatio");
	}
	
	
	@Test(dependsOnMethods="loginApp")
	public void logoutApp() {
		System.out.println("Log out from application");
	}
	
	@Test(groups = {"FirstGroup"})
	public void testCase1(){
		System.out.println("Test Case 1");
	}
	@Test(groups = {"SecondGroup"})
	public void testCase2(){
		System.out.println("Test Case 2");
	}
}

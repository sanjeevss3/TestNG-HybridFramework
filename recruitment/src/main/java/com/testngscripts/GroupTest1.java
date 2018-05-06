package com.testngscripts;

import org.testng.annotations.Test;

/**
*
*@author Sanjeev Chaudhary
*https://github.com/sanjeevss3/
*
*/

public class GroupTest1 {
	
	@Test(groups= {"smokeTest", "functionalTest"})
	public void loginDetails() {
		System.out.println("Logged In Successfully!!!");
	}

}

package com.testngscripts;

import org.testng.annotations.Test;

/**
*
*@author Sanjeev Chaudhary
*https://github.com/sanjeevss3/
*
*/

public class GroupTest2 {
	
	@Test(groups= {"functionalTest"})
	public void homePage() {
		System.out.println("We are on home page after login!!!");
	}

}

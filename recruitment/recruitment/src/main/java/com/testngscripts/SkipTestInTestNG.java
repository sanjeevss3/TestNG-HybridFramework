package com.testngscripts;

import org.testng.SkipException;
import org.testng.annotations.Test;

/**
*
*@author Sanjeev Chaudhary
*https://github.com/sanjeevss3/
*
*/

public class SkipTestInTestNG {

		@Test 
		public void aSkipTest(){
			String condition ="Skip Test";
			if(condition.equals("Skip Test")){
			throw new SkipException("Skipping - This is not ready for testing ");
			}else{
			System.out.println("I am in else condition");	
			}
			System.out.println("I am out of the if else condition");
		}
		
		@Test 
		public void nonSkipTest(){
			System.out.println("No need to skip this test");
		}
		
	}



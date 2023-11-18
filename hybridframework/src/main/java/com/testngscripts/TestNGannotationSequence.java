package com.testngscripts;

import org.testng.annotations.*;

/**
*
*@author Sanjeev Chaudhary
*https://github.com/sanjeevss3/
*
*/

public class TestNGannotationSequence {

	    @Test
	    public void first ()
	    {
	       System.out.println("@Test: From first test annotated in AnnotationsTest....");
	    }

	    @BeforeMethod
	    public void beforeMethod()
	    {
	        System.out.println("@BeforeMethod:  From BeforeMethod annotation in AnnotationsTest....");
	    }

	    @AfterMethod
	    public void AfterMethod()
	    {
	        System.out.println("@AfterMethod:  From AfterMethod annotation in AnnotationsTest....");
	    }

	    @BeforeClass
	    public void beforeClass()
	    {
	        System.out.println("@BeforeClass:  From BeforeClass annotation test in AnnotationsTest class....");
	    }

	    @AfterClass
	    public void afterClass()
	    {
	        System.out.println("@AfterClass:  From AfterClass annotation test in AnnotationsTest class....");
	    }

	    @AfterTest
	    public void afterTest()
	    {
	        System.out.println("@AfterTest:  From AfterTest annotation in AnnotationsTest class ....");
	    }
	    
	    @BeforeTest
	    public void beforeTest(){
	        System.out.println("@BeforeTest:  From BeforeTest annotation in SampleTestngUsage class ..");
	    }

	    @AfterSuite
	    public void afterSuite()
	    {
	        System.out.println("@AfterSuite:  From AfterSuite annotation in AnnotationsTest class ....");
	    }

	    @BeforeSuite
	    public void beforeSuite(){
	        System.out.println("@BeforeSuite: From BeforeSuite annotation in SampleTestngUsage class ..");
	    }

	}


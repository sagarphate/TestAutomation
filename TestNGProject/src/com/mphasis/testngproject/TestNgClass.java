package com.mphasis.testngproject;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestNgClass {
	
 // @Parameters({"Browser"})	
  @Test(invocationCount=1 , priority = 2, groups= {"Smoke"}, description = "Verify the Login Functionality", alwaysRun = true , enabled = true) // enabled = false : don't run the test case
  public void f() {  // test case 
	  System.out.println("i am in F method");
  }
  
  @Test(priority = 1, description = "Verify HOME Page Functinality", groups= {"Regarasion"})
  public void f1() {
	  System.out.println("i am in F1 method");
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("i am in Before Method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("i am in after Method");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("i am in before class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("i am in after class");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("i am in befire test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("i am in after test");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("i am in before suite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("i am in after suite");
  }
}

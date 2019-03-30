package com.mphasis.testngproject;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class testngnewclass {
	
  @Test
  public void testnewclass() {
	  System.out.println("i am in testnewclass");
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println(" i am in before method of testnewclass");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println(" i am in after method of testnewclass");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println(" i  am in before class of testnewclass");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println(" i m in after class of testnewclass");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println(" i am in before test of testnewclass");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println(" i am in after test of testnewclass");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println(" i am in before suite of testnewclass");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println(" i am in after suite of testnewclass");
  }

}

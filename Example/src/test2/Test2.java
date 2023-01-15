package test2;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Test2 {
	
	@BeforeSuite
	public void beforeSuite() {
		
		System.out.println("Test2 - beforeSuite");
	}

	@AfterSuite
	public void afterSuite() {
		
		System.out.println("Test2 - afterSuite");
	}
	
	//====================================================
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("Test2 beforeTest");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("Test2 - afterTest");
	}

	//====================================================
	@BeforeMethod
	public void beforeMethod() {
		
		System.out.println("Test2 - beforeMethod");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("Test2 - afterMethod");
	}
	//====================================================
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("Test2 - beforeClass");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("Test2 - afterClass");
	}
	
	//====================================================
	@BeforeGroups
	public void group1() {
		
		System.out.println(" Test2 - BeforeGroup");
	}
	
	@AfterGroups
	public void group2() {
		System.out.println("Test2 - AfterGroup");
	}
	//====================================================
	@Test(priority=1)
	public void method1() {
		
		System.out.println("Test2 - method 1");
		Assert.assertTrue(true);
	}
	
	
	@Test(priority=2, groups = "smoke")
	public void method2() {
		
		System.out.println("Test2 - Method2");
		Assert.assertTrue(true);
	}

}

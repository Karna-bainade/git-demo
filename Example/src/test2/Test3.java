package test2;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test3 {
	
/*	
	@BeforeSuite
	public void beforeSuite() {
		
		System.out.println("Test3 - beforeSuite");
	}

	@AfterSuite
	public void afterSuite() {
		
		System.out.println("Test3 - afterSuite");
	}
	
	//====================================================
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("Test3 beforeTest");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("Test3 - afterTest");
	}

	//====================================================
	@BeforeMethod
	public void beforeMethod() {
		
		System.out.println("Test3 - beforeMethod");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("Test3 - afterMethod");
	}
	//====================================================
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("Test3 - beforeClass");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("Test3 - afterClass");
	}
	*/
	//====================================================

	@Test(priority=3, groups = "smoke")
	public void method1() {
		
		System.out.println("Test3 - method 1");
		Assert.assertTrue(true);
	}
	
	@Test(priority=4)
	public void method2() {
		
		System.out.println("Test3 - Method 2");
		Assert.assertTrue(true);
	}

}

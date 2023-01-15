package test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

import org.apache.poi.ss.formula.functions.Count;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.javascript.host.Iterator;
import com.sun.jdi.Value;
import com.sun.net.httpserver.Authenticator.Retry;


public class Test5 extends Retry{



	@Test(retryAnalyzer=Retry.class)
	public void Tes1() {
		
		Assert.assertFalse(false);
		System.out.println("Test1");
	}

	@Test()
	public void Tes2() {
		
		Assert.assertFalse(false);
		System.out.println("Test2");
	}
	
	@Test()
	public void Tes3() {
		
		Assert.assertFalse(true);
		System.out.println("Test3");
	}
	
}





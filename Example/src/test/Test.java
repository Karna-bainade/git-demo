package test;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test {


/*
Write a program to count number of unique sub-strings( doesn't have duplicate of it) of length 3 for a given string. If not unique substring of length 3, print 0.

ex: string str="aabaaba"  o/p : baa
Bhavika Solanki4:24 PM
try {....}
catch(exception e){...}
catch(exception e){...}

*/
	public static void main(String[] args) {
	
		String str= "aabaaba";
		//baa
		char[] arr=str.toCharArray();
		
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = i+1; j <3; j++) {
				
			}
			
		}
			
		
	
	}
}
	

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.*;


public class SwitchWindow {

	public static void main(String[] args) {
		
		System.setProperty("driver.chrome.driver", "E:\\Selenium_OJT\\Example\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		driver.findElement(By.partialLinkText("Help")).click();
		
		Set<String> allwindow=driver.getWindowHandles();
		
		Object[] obj=allwindow.toArray();
		
		String window1=obj[0].toString();
		String window2=obj[1].toString();
		
		System.out.println("First "+window1);
		System.out.println("Seconde"+window2);
		
		System.out.println(driver.getTitle());
		driver.switchTo().window(window2);
		System.out.println("After Switchingf");
		System.out.println(driver.getTitle());
		driver.findElement(By.partialLinkText("Community")).click();
	}
}

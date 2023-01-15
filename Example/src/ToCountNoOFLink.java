



import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.examples.FrillsAndFills;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCountNoOFLink {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrom.driver", "E:\\Selenium_OJT\\Example\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);

		driver.get("http://primusbank.qedgetech.com/");
		driver.findElement(By.xpath("//*[contains(text(),'Site Map')]")).click();
		
		List<WebElement> alllink=driver.findElements(By.tagName("a"));
		System.out.println(alllink.size());
		
		for (int i = 0; i < alllink.size(); i++) {
			String link=alllink.get(i).getText();
			System.out.println(link);
		}
		
	}

}

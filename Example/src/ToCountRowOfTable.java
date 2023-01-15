import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCountRowOfTable {

		public static void main(String[] args) {
			
			System.setProperty("webdriver.chrom.driver", "E:\\Selenium_OJT\\Example\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
			
			driver.get("https://money.rediff.com/tools/forex");
			
			List<WebElement> allrow=driver.findElement(By.xpath("//*[@class='dataTable']")).findElements(By.tagName("tr"));
			System.out.println(allrow.size());
			
			for (int i = 1; i < allrow.size(); i++) {
	
				List<WebElement> cell=allrow.get(i).findElements(By.tagName("td"));	
				String currName=cell.get(0).getText();
				String currRate=cell.get(1).getText();
				
				System.out.println(currName+"    "+currRate);
				
			}
			
			
		}
}

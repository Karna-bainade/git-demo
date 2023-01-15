import java.awt.Desktop.Action;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverService;
import org.openqa.selenium.interactions.Actions;

public class Calender {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrom.driver", "E:\\Selenium_OJT\\Example\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://www.cleartrip.com/");
		String date="12/January/2022";

		String[] dateDevide=date.split("/");
		String dt=dateDevide[0];
		String month=dateDevide[1];
		String year=dateDevide[2];
		System.out.println(dt+"  "+month+"  "+year);
		Thread.sleep(5000);

		driver.findElement(By.xpath("//*[@class='t-all ml-2']")).click();
		String calDate=driver.findElement(By.xpath("(//*[@class='DayPicker-Caption']/div)[1]")).getText();
		System.out.println(calDate);

		String[] temp=calDate.split(" ");
		String calMonth=temp[0];
		String calYear=temp[1];
		System.out.println("calMonth"+calMonth);
		System.out.println("CalYear"+calYear);

		while (!(month+" "+year).equalsIgnoreCase(calMonth+" "+calYear)) {
			System.out.println("In a loop");
			
			if (calMonth.equalsIgnoreCase(month)) {
				break;	
			}
			temp=calDate.split(" ");
			calMonth=temp[0];
			calYear=temp[1];
			System.out.println("calMonth"+calMonth);
			System.out.println("CalYear"+calYear);
			System.out.println("\n");
			
			driver.findElement(By.xpath("(//*[@class='c-pointer c-secondary-500' or @viewBox='0 0 24 24'])[4]")).click();		
			calDate=driver.findElement(By.xpath("(//*[@class='DayPicker-Caption']/div)[1]")).getText();
			System.out.println("while 1"+calDate);
		}
		System.out.println("Out while loop");
		
		List<WebElement> row=driver.findElements(By.xpath("(//*[@class='DayPicker-Body'])[1]/div"));
		for (int i = 0; i < row.size(); i++) {
			String caldate=row.get(i).findElement(By.xpath("(//*[@role='gridcell'])")).getText();
			
			if (dt.equals(caldate)) {
				row.get(i).findElement(By.xpath("(//*[@role='gridcell'])")).click();
			}
			
		}
	
	}

}

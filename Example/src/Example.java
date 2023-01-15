import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Example {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("Hello");
		
		String url="https://katalon-demo-cura.herokuapp.com/profile.php#login";
		
		System.setProperty("webdriver.chrome.driver","E:\\Selenium_OJT\\Example\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get(url);
		
		WebElement userid=driver.findElement(By.xpath("//*[@id='txt-username']"));
		userid.sendKeys("John Doe");
		
		WebElement pass=driver.findElement(By.xpath("//*[@name='password']"));
		pass.sendKeys("ThisIsNotAPassword");
		
		WebElement login=driver.findElement(By.xpath("//*[@id='btn-login']"));
		login.click();
		
	/*	String title=driver.getTitle();
		if (title.equals("CURA Healthcare Service")){

			System.out.println("Logined");
		}
	//	*/
		
		WebElement menu=driver.findElement(By.id("menu-toggle"));
		WebDriverWait wait=new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(menu));
		menu.click();
		
		Thread.sleep(10000);
		WebElement logout=driver.findElement(By.xpath("//*[contains(text(),'Logout')]"));
		wait.until(ExpectedConditions.visibilityOf(logout));
		logout.click();
		
	}
}

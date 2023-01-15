package test2;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Test1 {

	@Parameters("browserType")
	@Test()
	public void mailTest(String browserType) throws MalformedURLException{
		DesiredCapabilities dr=null;
		RemoteWebDriver driver;
		

		if(browserType.equals("firefox")){

			dr=DesiredCapabilities.firefox();
			FirefoxOptions options =  new FirefoxOptions();
			FirefoxProfile profile = new FirefoxProfile();
			profile.setPreference("browser.download.folderList", 2);
			profile.setPreference("browser.download.dir", "C:\\Temp");
			profile.setPreference("browser.download.useDownloadDir", true);
			profile.setPreference("browser.download.viewableInternally.enabledTypes", "");
			profile.setPreference("browser.helperApps.neverAsk.saveToDisk", "application/msword;application/ms-doc;application/doc;application/pdf;text/plain;application/text;text/xml;application/xml");
			options.setProfile(profile);
			driver=new FirefoxDriver(options);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			
	
		}else if(browserType.equals("chrome")){

			dr=DesiredCapabilities.chrome();
			dr.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
			System.setProperty("webdriver.chrome.driver","E:\\Selenium_OJT\\Example\\chromedriver.exe");
			driver=new ChromeDriver(dr);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			
		}else if (browserType.equals("edge")) {

			dr= new DesiredCapabilities();
			System.setProperty( "webdriver.edge.driver","E:\\Selenium_OJT\\Example\\msedgedriver.exe");
			EdgeOptions options = new EdgeOptions();
			options.setCapability("useAutomationExtension", false);
			driver=new EdgeDriver(options);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();

		}else if(browserType.equals("IE")){
			System.setProperty("webdriver.ie.driver", "E:\\Selenium_OJT\\Example\\IEDriverServer.exe");
			dr=DesiredCapabilities.internetExplorer();
			dr.setCapability(CapabilityType.BROWSER_NAME, "internet explorer");
			dr.setCapability(InternetExplorerDriver.IE_ENSURE_CLEAN_SESSION, true);
			dr.setCapability("ignoreProtectedModeSettings", true);
			dr.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
			dr.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);
			dr.setPlatform(Platform.WINDOWS);

			driver=new InternetExplorerDriver(dr);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();

		}

//		URL huburl=new URL("http://192.168.0.108:4444/wd/hub");
//		driver=new RemoteWebDriver(huburl,dr);
				driver.get("http://gmail.com");
		//		driver.findElement(By.xpath("//input[@type='email']")) .sendKeys("username");
		//		driver.findElement(By.xpath("//input[@id='Passwd']")) .sendKeys("password");
		//	driver.close();
	}
}

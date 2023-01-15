package test;

import java.sql.Driver;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;

public class Test2 {

	 public static Map<String, Integer> findTotalCasesByContinent(WebDriver driver, String pageUrl)
	            throws InterruptedException {
	 
	    	
	       //write your code here
	    	Map<String, Integer> map= new HashMap<String, Integer>();
	    	int totalCase = 0;
	    	String str;
	
	    	JavascriptExecutor js=(JavascriptExecutor)driver;
	 	
	    	List<WebElement> cont=driver.findElements(By.xpath("//table/tbody/tr/td[5]"));
	    	System.out.println(cont.size()+" cont");
	    	
	    	
	    	String continent="karan";
	    	for (int i = 0; i <cont.size(); i++) {
	    				
	    		for (int j =i+1; j < cont.size(); j++) {
	    			    			
	    			if (cont.get(i).getText().equalsIgnoreCase(cont.get(j).getText()) && !map.containsValue(cont.get(i).getText())) {
	    				
	    				
	    				js.executeScript("arguments[0].scrollIntoView(true)", cont.get(j));
	    				str=driver.findElements(By.xpath("//table/tbody/tr/td[5]//preceding::td[3]")).get(j).getText(); 				
	    				str=str.replace(",", "");
	    				totalCase=totalCase+Integer.valueOf(str);
	    			}		
				}
	    		
	    		continent=cont.get(i).getText();
	    		map.put(continent, totalCase);
	    		System.out.println(continent+"   "+totalCase);
			}
	   
	       return map;

	    }
//======================================
	 
	 public static Map<String, Integer> findTotalCountryByContinent(WebDriver driver, String pageUrl) {
	       
   	  //write your code here
   	Map<String, Integer> map= new HashMap<String, Integer>();
   	int totalCase = 0;
   	String str;
   	int counter;

   	JavascriptExecutor js=(JavascriptExecutor)driver;
	
   	List<WebElement> cont=driver.findElements(By.xpath("//table/tbody/tr/td[5]"));
   	System.out.println(cont.size()+" cont");
   	
   	String continent="karan";
   			
   	
   	for (int i = 0; i <cont.size(); i++) {
   		counter=0;
		map.put(continent, counter);
		for (int j =i+1; j < cont.size(); j++) {
			if (cont.get(i).getText().equalsIgnoreCase(cont.get(j).getText()) && !map.containsKey(cont.get(i).getText())){
				
				js.executeScript("arguments[0].scrollIntoView(true)", cont.get(j));
				counter++;
			}
				
		}
		
		continent=cont.get(i).getText();
		System.out.println(continent+ " ** HAS** "+counter+"  country");
//		map.put(continent, counter);
	}
   	
  
      return map;
   }
	 
	 public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium_OJT\\Example\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		String pagUrl="E:\\Testing Project\\Company's Task\\SeleniumWebdriverJava 4 (1)\\SeleniumWebdriverJava\\selenium\\website\\home.html";
		driver.get(pagUrl);
		Test2 scripts = new Test2();
		Map<String, Integer> actual = scripts.findTotalCasesByContinent(driver, pagUrl);
		System.out.println(actual);
	/*	
		Map<String, Integer> actual2 = scripts.findTotalCountryByContinent(driver, pagUrl);
		System.out.println(actual2);
		*/
		
	}

}

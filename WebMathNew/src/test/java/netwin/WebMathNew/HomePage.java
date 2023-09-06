package netwin.WebMathNew;

import java.io.FileInputStream;

import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class HomePage {
	
	WebDriver driver ;
	Properties p;
	
	  //Check user is able to get the url.
	 @BeforeMethod
	  public void beforeMethod() throws IOException
      {  
	  
	      FileInputStream fis = new FileInputStream("C:\\Users\\Pritika.Somase\\eclipse-workspace\\WebMathNew\\src\\test\\java\\resources\\data.properties");
		  p = new Properties();
		  p.load(fis);
		 
		  WebDriverManager.chromedriver().setup();
		  driver = new ChromeDriver();
		  driver.get(p.getProperty("url"));
		  driver.manage().window().maximize();
		  
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		  driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
      }
	 
	 
	 
	  @Test(priority = 1)
	  public void header()
	  {
		  driver.findElement(By.xpath(p.getProperty("logo"))).click();
		  driver.findElement(By.xpath(p.getProperty("yahoo_mail"))).click();
		  driver.findElement(By.xpath(p.getProperty("contact"))).click();
		    
	  } 
	  @Test( priority=2, dataProvider = "header", dataProviderClass = ExcelDataProvider.class)
	  public void searchInput(String tle)
	  { 
    	  driver.findElement(By.xpath(p.getProperty("search_tle"))).sendKeys(tle,Keys.ENTER);	  
		  driver.findElement(By.xpath(p.getProperty("search_btn"))).click();
		  
	  }
	  
	  @Test(priority = 3)
	  public void header2()
	  { 
		  driver.findElement(By.xpath(p.getProperty("search_btn"))).click();
		  driver.findElement(By.xpath(p.getProperty("fackbook"))).click();
		  driver.findElement(By.xpath(p.getProperty("twiter"))).click();
		  driver.findElement(By.xpath(p.getProperty("youtube"))).click();
		  driver.findElement(By.xpath(p.getProperty("insta"))).click();
		  driver.findElement(By.xpath(p.getProperty("donate"))).click();
		  
	  }
	  @Test(priority = 1)
	  public void courosal()
	  {
		  driver.findElement(By.xpath(p.getProperty("courosal1"))).click();
		  driver.findElement(By.xpath(p.getProperty("courosal2"))).click();
		  driver.findElement(By.xpath(p.getProperty("courosal3"))).click();
		  driver.findElement(By.xpath(p.getProperty("courosal4"))).click();
		    
	  } 
	  
	  @Test(priority = 4)
	  public void homeNews()
	  { 
		  driver.findElement(By.xpath(p.getProperty("news"))).click();
		  driver.findElement(By.xpath(p.getProperty("read_more_btn"))).click();		  
	  }
	  
	  @Test(priority =5)
	  public void homeEvent() throws InterruptedException
	  { 
		  driver.findElement(By.xpath(p.getProperty("event"))).click();
		  driver.findElement(By.xpath(p.getProperty("upcoming_events"))).click(); 
		  driver.findElement(By.xpath(p.getProperty("past_events"))).click();
		  driver.findElement(By.xpath(p.getProperty("calender"))).click();
          driver.findElement(By.xpath(p.getProperty("calender_view"))).click();
	  }
	  
	  @Test(priority = 6)
	  public void homeServices() throws InterruptedException
	  { 
		  driver.findElement(By.xpath(p.getProperty("services"))).click();
	  }
  
	  @Test(priority = 7)
	  public void recentNews() throws InterruptedException
	  { 
		  driver.findElement(By.xpath(p.getProperty("back_btn"))).click();
		  driver.findElement(By.xpath(p.getProperty("forword_btn"))).click();
		  Thread.sleep(2000);
	  }
  
	  @Test(priority = 8)
	  public void sponsers() throws InterruptedException
	  { 
		  driver.findElement(By.xpath(p.getProperty("sponser1"))).click();
		  driver.findElement(By.xpath(p.getProperty("sponser2"))).click();
	  }
   
	  
  @AfterMethod
  public void close() throws InterruptedException
  {
	  Thread.sleep(5000);
	  driver.quit();
  }
}

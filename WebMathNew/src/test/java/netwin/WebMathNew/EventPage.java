package netwin.WebMathNew;

import java.io.FileInputStream;

import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class EventPage {
	
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
	 
	 
	 
	  @Test
	  public void event()
	  {
		  driver.findElement(By.xpath(p.getProperty("event"))).click();
		  driver.findElement(By.xpath(p.getProperty("upcoming_events"))).click(); 
		  driver.findElement(By.xpath(p.getProperty("past_events"))).click();
		  driver.findElement(By.xpath(p.getProperty("calender"))).click();
          driver.findElement(By.xpath(p.getProperty("calender_view"))).click();
	  } 
	 
	  
  @AfterMethod
  public void close() throws InterruptedException
  {
	  Thread.sleep(5000);
	  driver.quit();
  }
}

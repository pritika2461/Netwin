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


public class StudentPage {
	
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
	 
	 
	 
	  @Test(priority =1)
	  public void student()
	  {
		   driver.findElement(By.xpath(p.getProperty("student"))).click();
	  } 
	  
	  @Test(priority =2)
	  public void stud_services()
	  {
		  driver.findElement(By.xpath(p.getProperty("stud_arr"))).click();
		  driver.findElement(By.xpath(p.getProperty("stud_services"))).click();
	  } 
	  
	  @Test(priority =3, dataProvider = "tutor", dataProviderClass = ExcelDataProvider.class)
	  public void stud_find_tutor(String name, String email, String address, String number, String other)
	  {
		   driver.findElement(By.xpath(p.getProperty("stud_arr"))).click();
		   driver.findElement(By.xpath(p.getProperty("stud_find_tutor"))).click();
		   driver.findElement(By.xpath(p.getProperty("tutor_name"))).sendKeys(name);
		   driver.findElement(By.xpath(p.getProperty("tutor_email"))).sendKeys(email);
		   driver.findElement(By.xpath(p.getProperty("tutor_address"))).sendKeys(address);
		   driver.findElement(By.xpath(p.getProperty("tutor_number"))).sendKeys(number);
		   driver.findElement(By.xpath(p.getProperty("tutor_need"))).click();
		   driver.findElement(By.xpath(p.getProperty("tutor_other_reason"))).sendKeys(other);
		   driver.findElement(By.xpath(p.getProperty("tutor_from_where"))).click();
		   driver.findElement(By.xpath(p.getProperty("tutor_age"))).click();
		   driver.findElement(By.xpath(p.getProperty("tutor_send_btn"))).click();
	  } 
	 
	  @Test(priority =4)
	  public void stud_resources()
	  {
		   driver.findElement(By.xpath(p.getProperty("stud_arr"))).click();
		   driver.findElement(By.xpath(p.getProperty("stud_res"))).click();	  
	  } 
	 
	  
  @AfterMethod
  public void close() throws InterruptedException
  {
	  Thread.sleep(5000);
	  driver.quit();
  }
}

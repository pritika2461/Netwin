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


public class VolunteerPage {
	
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
	  public void volunteer_info()
	  {
		driver.findElement(By.xpath(p.getProperty("volunteer"))).click();
		driver.findElement(By.xpath(p.getProperty("vl_info"))).click();
	  } 
	 
	  @Test(priority = 2)
	  public void volunteer_tle()
	  {
		driver.findElement(By.xpath(p.getProperty("volunteer"))).click();
		driver.findElement(By.xpath(p.getProperty("vl_tle"))).click();
		
	  } 
	  @Test(priority = 3)
	  public void volunteer_pos()
	  {
		driver.findElement(By.xpath(p.getProperty("volunteer"))).click();
		driver.findElement(By.xpath(p.getProperty("vl_pos"))).click();
		driver.findElement(By.xpath(p.getProperty("vl_pos_dis"))).click();
	  } 
	  @Test(priority = 4)
	  public void volunteer_tutoring()
	  {
		driver.findElement(By.xpath(p.getProperty("volunteer"))).click();
		driver.findElement(By.xpath(p.getProperty("vl_tutoring"))).click();
	  } 
	  
	  @Test( priority=5, dataProvider = "vl_training", dataProviderClass = ExcelDataProvider.class)
	  public void volunteer_training(String name, String email, String number)
	  {
		driver.findElement(By.xpath(p.getProperty("volunteer"))).click();
		driver.findElement(By.xpath(p.getProperty("vl_training"))).click();
		driver.findElement(By.xpath(p.getProperty("vl_training_name"))).sendKeys(name);
		driver.findElement(By.xpath(p.getProperty("vl_training_email"))).sendKeys(email);
		driver.findElement(By.xpath(p.getProperty("vl_training_number"))).sendKeys(number);
		driver.findElement(By.xpath(p.getProperty("vl_training_send_btn"))).click();
	  } 
	  @Test(priority = 6)
	  public void volunteer_services()
	  {
		driver.findElement(By.xpath(p.getProperty("volunteer"))).click();
		driver.findElement(By.xpath(p.getProperty("vl_services"))).click();
	  } 
	  
	  @Test(priority = 7)
	  public void volunteer_opportuniy()
	  {
		driver.findElement(By.xpath(p.getProperty("volunteer"))).click();
		driver.findElement(By.xpath(p.getProperty("vl_opportunity"))).click();
	  } 
	  
	  @Test(priority = 8, dataProvider = "want_tobe_vl", dataProviderClass = ExcelDataProvider.class)
	  public void want_to_be_vl(String name, String address, String email, String number, String about_us, String employer, String skill,
			  String position, String date, String linked_in, String ref_name, String ref_phone, String ref_relation )
	  {
		driver.findElement(By.xpath(p.getProperty("vl_arr"))).click();
		driver.findElement(By.xpath(p.getProperty("want_to_be_vl"))).click();
		driver.findElement(By.xpath(p.getProperty("vl_name"))).sendKeys(name);
		driver.findElement(By.xpath(p.getProperty("vl_address"))).sendKeys(address);
		driver.findElement(By.xpath(p.getProperty("vl_email"))).sendKeys(email);
		driver.findElement(By.xpath(p.getProperty("vl_number"))).sendKeys(number);
		driver.findElement(By.xpath(p.getProperty("vl_about_us"))).sendKeys(about_us);
		driver.findElement(By.xpath(p.getProperty("high_school"))).click();
		driver.findElement(By.xpath(p.getProperty("general_vl"))).click();

		driver.findElement(By.xpath(p.getProperty("vl_employer"))).sendKeys(employer);
		driver.findElement(By.xpath(p.getProperty("vl_position"))).sendKeys(position);
		driver.findElement(By.xpath(p.getProperty("vl_date"))).sendKeys(date);
		driver.findElement(By.xpath(p.getProperty("vl_skill"))).sendKeys(skill);
		
		driver.findElement(By.xpath(p.getProperty("ref_name"))).sendKeys(ref_name);
		driver.findElement(By.xpath(p.getProperty("ref_phone"))).sendKeys(ref_phone);
		driver.findElement(By.xpath(p.getProperty("ref_relation"))).sendKeys(ref_relation);

		
		driver.findElement(By.xpath(p.getProperty("vl_send_btn"))).click();
		
	  } 
	  
	  
	 
  @AfterMethod
  public void close() throws InterruptedException
  {
	  Thread.sleep(5000);
	  driver.quit();
  }
}

package netwin.webMath;

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

public class HomePage 
{

	WebDriver driver ;
	Properties p;
	
	  //Check user is able to get the url.
	 @BeforeMethod
	  public void beforeMethod() throws IOException
      {  
	  
	      FileInputStream fis = new FileInputStream("C:\\Users\\Pritika.Somase\\eclipse-workspace\\webMath\\src\\test\\java\\netwin\\webMath\\data.properties");
		  p = new Properties();
		  p.load(fis);
		 
		  WebDriverManager.chromedriver().setup();
		  driver = new ChromeDriver();
		  driver.get(p.getProperty("url"));
		  driver.manage().window().maximize();
		  
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		  driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
      }
		  
	 
	
	   @Test( priority=1, dataProvider = "LoginData", dataProviderClass = ExcelDataProvider.class, enabled = false)
	  public void ParentRegister(String email, String firstName, String lastName, String Password) throws InterruptedException
	  {
		  driver.findElement(By.xpath(p.getProperty("login_btn"))).click();
		  driver.findElement(By.xpath(p.getProperty("parent_login"))).click();
		  driver.findElement(By.xpath(p.getProperty("create_parent_acc"))).click();  
		  driver.findElement(By.xpath(p.getProperty("parent_email"))).sendKeys(email);
		  driver.findElement(By.xpath(p.getProperty("parent_fname"))).sendKeys(firstName);
		  driver.findElement(By.xpath(p.getProperty("parent_lname"))).sendKeys(lastName);
		  driver.findElement(By.xpath(p.getProperty("parent_pass"))).sendKeys(Password);
		  driver.findElement(By.xpath(p.getProperty("parent_checkbox"))).click();
		  driver.findElement(By.xpath(p.getProperty("create_acc_btn"))).click();
	  }
	  
	   
	  @Test( priority=2, dataProvider = "LoginData1", dataProviderClass = ExcelDataProvider.class, enabled = false)
	  public void ParentLogin(String email, String Password) throws InterruptedException
	  {
		  driver.findElement(By.xpath(p.getProperty("login_btn"))).click();
		  driver.findElement(By.xpath(p.getProperty("parent_login"))).click(); 
		  driver.findElement(By.xpath(p.getProperty("login_email"))).sendKeys(email);
		
		  driver.findElement(By.xpath(p.getProperty("login_pass"))).sendKeys(Password);
		  driver.findElement(By.xpath(p.getProperty("login_btn1"))).click();	 
	  }
	  
	  
	  @Test( priority=0,dataProvider = "LoginData2", dataProviderClass = ExcelDataProvider.class,  enabled = false)
	  public void ForgetPass(String email)
	  {
		  driver.findElement(By.xpath(p.getProperty("login_btn"))).click();
		  driver.findElement(By.xpath(p.getProperty("parent_login"))).click(); 
		  driver.findElement(By.xpath(p.getProperty("forget_pass"))).click();
		 
		  driver.findElement(By.xpath(p.getProperty("forget_email"))).sendKeys(email);
		  driver.findElement(By.xpath(p.getProperty("send_pass_reset_link_btn"))).click();
	  }
	  

	   @Test( priority=1, dataProvider = "LoginData3", dataProviderClass = ExcelDataProvider.class)
	  public void TeacherLogin(String username) throws InterruptedException
	  {
		  driver.findElement(By.xpath(p.getProperty("login_btn"))).click();
		  driver.findElement(By.xpath(p.getProperty("teacher_login"))).click();
		  driver.findElement(By.xpath(p.getProperty("discovery"))).click();  
		  driver.findElement(By.xpath(p.getProperty("teacher_btn"))).click();
		  driver.findElement(By.xpath(p.getProperty("teacher_uname"))).sendKeys(username);
		  driver.findElement(By.xpath(p.getProperty("continue_btn"))).click();
//		  driver.findElement(By.xpath(p.getProperty("sign-in_with_google"))).click();
	  }
	  
	  @AfterMethod
	  public void close() throws InterruptedException
	  {
		  Thread.sleep(5000);
		  driver.quit();
	  }
		  
}

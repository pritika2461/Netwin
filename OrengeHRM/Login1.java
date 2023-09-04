 package OrengeHRM;

import org.testng.annotations.Test;

import DataProviders.ExcelDataSupplier;

import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login1 
{
	WebDriver driver ;
	Properties p;
	
	  //Check user is able to get the url.
    @BeforeMethod
	  public void beforeMethod()
    {  
		  WebDriverManager.chromedriver().setup();
		  driver = new ChromeDriver();
		  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		  driver.manage().window().maximize();
		  
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		  driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
	  }
    
    

	
    @Test( priority=1, dataProvider = "LoginData", dataProviderClass = ExcelDataSupplier.class)
    
    public void Login( String userName, String Password1) throws InterruptedException
    {
  	  WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().window().maximize();
        
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        
        WebElement Username = driver.findElement(By.name("username"));
        Username.sendKeys(userName);
        
        WebElement Password = driver.findElement(By.name("password"));
        Password.sendKeys(Password1);
        
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }
	  
	  @Test(priority = 2)
	  public void forgetPass() {
		  driver.findElement(By.className("orangehrm-login-forgot-header")).click(); // click on forget button
	  }
	  
	  @Test(priority = 3)
	  public void resetbtn()
	  {
		  driver.findElement(By.className("orangehrm-login-forgot-header")).click();
		  driver.findElement(By.name("username")).sendKeys("Admin");   //set the user name
		  driver.findElement(By.xpath("//button[@type='submit']")).click();  // click on reset button
	  }
	  
	  @Test(priority = 4)
	  public void cancelbtn()
	  {
		  driver.findElement(By.className("orangehrm-login-forgot-header")).click();
		  driver.findElement(By.name("username")).sendKeys("Admin");    // set the username
		  driver.findElement(By.xpath("//button[@type='button']")).click(); // click on cancel
	  }
	  
	  @Test(priority = 5)
	  public void linkedInPage() 

	  {
		  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[3]/div[1]/a[1]")).click();

	  }
	  
	  @Test(priority = 6)
	  public void fackbookPage() 

	  {
		  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[3]/div[1]/a[2]")).click();
	  }
	  
	  @Test(priority = 7)
	  public void twiterPage() 

	  {
		  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[3]/div[1]/a[3]")).click();
	  }
	  
	  @Test(priority = 8)
	  public void youtubePage()

	  {
		  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[3]/div[1]/a[4]")).click();
	  }
	  
	  @Test(priority = 9)
	  public void OrengeHRMPage() 
	  {
		  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[3]/div[2]/p[2]/a")).click();
	  }
	   

	  @AfterMethod
	  public void afterMethod() throws InterruptedException 
	  {
		  Thread.sleep(5000);
		  driver.close();
	  }
     
  }

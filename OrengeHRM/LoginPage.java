 package OrengeHRM;

import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage 
{
	WebDriver driver ;
	
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

	
	  // login  with valid user name & password 
	  @Test(priority= 1)
	  public void Login() throws InterruptedException
	  {  
		  driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
	      driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
	      driver.findElement(By.xpath("//button[@type='submit']")).click();
	      driver.getTitle();
	  }
	  
	  // login  with valid user name & Invalid password 
	  @Test(priority= 2)
	  public void Login1() throws InterruptedException 
	    {
			  driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		      driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123123");
		      driver.findElement(By.xpath("//button[@type='submit']")).click();
		      driver.getTitle();  
		}
	  
	  // login  with invalid user name & valid password 
	  @Test(priority= 3)
	  public void Login2() throws InterruptedException 
	    {
			  driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin43242");
		      driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		      driver.findElement(By.xpath("//button[@type='submit']")).click();
		      driver.getTitle();
		  }
	  
	  // login  with invalid user name & Invalid password 
	  @Test(priority= 4)
	  public void Login4() throws InterruptedException 
	    {
			  driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin43242");
		      driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123123");
		      driver.findElement(By.xpath("//button[@type='submit']")).click();
		      driver.getTitle();
		  
		  }
	  
	  // login  with empty user name & empty password 
	  @Test(priority= 5)
	  public void Login3() throws InterruptedException 
	     { 
		      driver.findElement(By.xpath("//button[@type='submit']")).click();
		      driver.getTitle();
		  }
	  
	  @Test(priority = 6)
	  public void forgetPass() {
		  driver.findElement(By.className("orangehrm-login-forgot-header")).click(); // click on forget button
	  }
	  
	  @Test(priority = 7)
	  public void resetbtn()
	  {
		  driver.findElement(By.className("orangehrm-login-forgot-header")).click();
		  driver.findElement(By.name("username")).sendKeys("Admin");   //set the user name
		  driver.findElement(By.xpath("//button[@type='submit']")).click();  // click on reset button
	  }
	  
	  @Test(priority = 8)
	  public void cancelbtn()
	  {
		  driver.findElement(By.className("orangehrm-login-forgot-header")).click();
		  driver.findElement(By.name("username")).sendKeys("Admin");    // set the username
		  driver.findElement(By.xpath("//button[@type='button']")).click(); // click on cancel
	  }
	  
	  @Test(priority = 9)
	  public void linkedInPage() 

	  {
		  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[3]/div[1]/a[1]")).click();

	  }
	  
	  @Test(priority = 10)
	  public void fackbookPage() 

	  {
		  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[3]/div[1]/a[2]")).click();
	  }
	  
	  @Test(priority = 11)
	  public void twiterPage() 

	  {
		  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[3]/div[1]/a[3]")).click();
	  }
	  
	  @Test(priority = 12)
	  public void youtubePage()

	  {
		  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[3]/div[1]/a[4]")).click();
	  }
	  
	  @Test(priority = 13)
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

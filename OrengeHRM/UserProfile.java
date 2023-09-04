package OrengeHRM;

import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import io.github.bonigarcia.wdm.WebDriverManager;

public class UserProfile {
	 WebDriver driver ;
		
	 @Test(priority = 1)
	  public void CheckUserProfile() throws InterruptedException 
	  {
		   //click on user profile 
		   driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li")).click();
		   Thread.sleep(2000);
	  }
	 
	  @Test(priority = 2)
	  public void About() throws InterruptedException 
	  {
		  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li")).click();
		  Thread.sleep(2000);
		  
		// Click on About 
		   driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/ul/li[1]/a")).click();
			    
	  }
	  
	  @Test(priority = 3)
	  public void support() throws InterruptedException 
	  {
		  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li")).click();
		  Thread.sleep(2000);
		  
		  // Click on support
		   driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/ul/li[2]/a")).click();
			  
	  }
	  
	  @Test(priority = 4)
	  public void cngPass() throws InterruptedException 
	  {
		  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li")).click();
		  Thread.sleep(2000);
		  
		   // Click on Change Password
		   driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/ul/li[3]/a")).click();
		   
		   // enter Password
		   driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[1]/div/div[2]/input")).sendKeys("admin123");
			
		   // enter Current  Password
		   driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/div/div[2]/input")).sendKeys("admin123");
			
		   // enter Confirm  Password
		   driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div[2]/input")).sendKeys("admin@123");
		  
		   // click on save button
		   driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]")).click();
			
	  }
	  
	  @Test(priority = 5)
	  public void cngPass1() throws InterruptedException 
	  {
		  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li")).click();
		  Thread.sleep(2000);
		  
		   // Click on Change Password
		   driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/ul/li[3]/a")).click();
		   
		   // enter Current  Password
		   driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/div/div[2]/input")).sendKeys("admin4546123");
			

		   // enter new Password
		   driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[1]/div/div[2]/input")).sendKeys("admin@123");
			 
		   // enter Confirm  Password
		   driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div[2]/input")).sendKeys("admin@123");
		  
		   // click on save button
		   driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]")).click();
			
	  }
	  
	  @Test(priority = 6)
	  public void cngPass2() throws InterruptedException 
	  {
		  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li")).click();
		  Thread.sleep(2000);
		  
		   // Click on Change Password
		   driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/ul/li[3]/a")).click();
		   
		   // enter Current  Password
		   driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/div/div[2]/input")).sendKeys("admin123");
			

		   // enter new Password
		   driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[1]/div/div[2]/input")).sendKeys("admin@18723");
			 
		   // enter Confirm  Password
		   driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div[2]/input")).sendKeys("admin@123");
		  
		   // click on save button
		   driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]")).click();
			
	  }
	  @Test(priority = 7)
	  public void cngPass3() throws InterruptedException 
	  {
		  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li")).click();
		  Thread.sleep(2000);
		  
		   // Click on Change Password
		   driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/ul/li[3]/a")).click();
		   
		   // enter Current  Password
		   driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/div/div[2]/input")).sendKeys("admin123");
			

		   // enter new Password
		   driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[1]/div/div[2]/input")).sendKeys("admin@123");
			 
		   // enter Confirm  Password
		   driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div[2]/input")).sendKeys("admin@123");
		  
		   // click on save button
		   driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]")).click();
			
	  }
	  @Test(priority = 8)
	  public void Logout() throws InterruptedException 
	  {
		  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li")).click();
		  Thread.sleep(2000);

		   // Click on Logout
		   driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/ul/li[4]/a")).click();
		   Thread.sleep(2000);
			
	  }
	  
	  
	  @BeforeMethod
	  public void beforeMethod() {
		  
		  WebDriverManager.chromedriver().setup();
		  driver = new ChromeDriver();
		  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		  driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		  
		  driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
	      driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
	      driver.findElement(By.xpath("//button[@type='submit']")).click();
	    
	  }

	  
	  @AfterMethod
	  public void afterMethod() throws InterruptedException {
		  Thread.sleep(5000);
		  driver.close();
	  }
}
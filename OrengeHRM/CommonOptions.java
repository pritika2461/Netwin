package OrengeHRM;

import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CommonOptions {
	 WebDriver driver ;
		
	 @Test(priority = 1)
	  public void CheckUserProfile() throws InterruptedException 
	  {
		   //click on user profile 
		   driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li")).click();
		   
		   // Click on About 
		   driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/ul/li[1]/a")).click();
			  
		   // Click on support
		   driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/ul/li[2]/a")).click();
			
		   // Click on Change Password
		   driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/ul/li[3]/a")).click();
			
		   // Click on Logout
		   driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/ul/li[4]/a")).click();
			
	  }
	 
	  @Test(priority = 1)
	  public void SearchModule() throws InterruptedException 
	  {
	   driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/div/div/input")).sendKeys("Admin");
		  
	  }
	  
	  @Test(priority = 2)
	  public void HideModule() throws InterruptedException 
	  {
	   driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/div/div/button")).click();
		  
	  }
	  
	  @Test(priority = 3)
	  public void Quetions() throws InterruptedException 
	  {
		  Thread.sleep(2000);
	   driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/div/button")).click();
		  
	  }
	  @Test(priority = 3)
	  public void footerLink() throws InterruptedException 
	  {
		  Thread.sleep(2000);
	   driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[3]/p[2]/a")).click();
		  
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
		  Thread.sleep(3000);
		  driver.close();
	  }
}
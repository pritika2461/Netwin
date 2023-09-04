package OrengeHRM;

import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BuzzModule {
	 WebDriver driver ;
		
	  @Test(priority =1)
	  public void BuzzModule1() throws InterruptedException
	  {
		  
		  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[12]")).click();
		  Thread.sleep(2000);
	  }
	  
	  @Test(priority =2)
	  public void BuzzNewsFeed() throws InterruptedException
	  {
		  
		  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[12]")).click();
		  Thread.sleep(2000);
		  
		  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div/div[1]/div[1]/div[2]/form/div/textarea")).sendKeys("Hii, Hello How Are You...");
		  
		  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div/div[1]/div[1]/div[2]/form/div/div/button")).click();
	  }
	  @Test(priority =3)
	  public void sharePhotos() throws InterruptedException
	  {
		   
		  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[12]")).click();
		  Thread.sleep(2000);
		  
		 driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div/div[1]/div[2]/button[1]")).click(); 
	    
		 driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div/div[2]/div/div/div/form/div[2]/div[1]/div[2]/div/div/i")).click(); 
	  }
	  
	  @Test(priority =4)
	  public void shareVideos() throws InterruptedException
	  {
		 
		  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[12]")).click();
		  Thread.sleep(2000);
		  
		 driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div/div[1]/div[2]/button[2]")).click(); 
	    
		 driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div/div[2]/div/div/div/form/div[2]/div[2]/textarea")).sendKeys("https://youtube.com");
		 
		 driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div/div[2]/div/div/div/form/div[3]/button")).click();
	  
	  }
	  
	  @Test(priority =5)
	  public void RecentPosts() throws InterruptedException
	  {  
		  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[12]")).click();
		  Thread.sleep(2000);
		  
		 driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div/div[2]/button[1]")).click(); 
	  }
	  
	  @Test(priority =6)
	  public void LikedPosts() throws InterruptedException
	  {
		   
		  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[12]")).click();
		  Thread.sleep(2000);
		  
		 driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div/div[2]/button[2]")).click(); 
	  }
	  
	  @Test(priority =7)
	  public void CommentedPosts() throws InterruptedException
	  {
		 
		  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[12]")).click();
		  Thread.sleep(2000);
		  
		 driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div/div[2]/button[3]")).click(); 
	  }

	  @Test(priority =8)
	  public void Quetions() throws InterruptedException
	  {
		  
		  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[12]")).click();
		  Thread.sleep(2000);
		  
		 driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/div/button")).click(); 
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
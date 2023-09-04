package OrengeHRM;

import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import io.github.bonigarcia.wdm.WebDriverManager;

public class PerformanceModule {
	 WebDriver driver ;
		
	  @Test(priority =1)
	  public void PerformanceModule1() throws InterruptedException
	  {
		   
		  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[7]")).click();
		  
	  }
	  
	  @Test(priority =2)
	  public void EmpReviews() throws InterruptedException
	  {
		   
		  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[7]")).click();
		  
		  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div[1]/div/div[2]/div/div/input")).sendKeys("Pritika");
		  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[2]")).click();
	  }
	  
	  @Test(priority =3)
	  public void MyTracker() throws InterruptedException
	  {
		 
		  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[7]")).click();
		
		  // click on my tracker
		  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[3]")).click();
		  Thread.sleep(2000);
		  
		  // click on view button
		  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[3]/div/div[2]/div/div/div[4]/div/button")).click();
		  Thread.sleep(2000);
		  
	     // click on add log
		  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[1]/button")).click();
		  Thread.sleep(2000);
		  
		  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[3]/div/div/div/form/div[1]/div/div[2]/input")).sendKeys("hiii");
		  
		  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[3]/div/div/div/form/div[2]/div/button[2]")).click();
		  
		  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[3]/div/div/div/form/div[3]/div/div[2]/textarea")).sendKeys("hello");
		  
		  Thread.sleep(2000);
		  
		  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[3]/div/div/div/form/div[4]/button[2]")).click();
	  }
	  
	  @Test(priority =4)
	  public void EmployeeTracker() throws InterruptedException
	  {
		  
		  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[7]")).click();
		
		  // click on employee tracker
		  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[4]")).click();
		  Thread.sleep(2000);
		  
		  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/div/div/input")).sendKeys("AbcdeShristiShristiPritika ZxcvbBhaulal sebastian");
		  Thread.sleep(2000);
		  
		  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[2]")).click();
		  Thread.sleep(2000);
		  
		  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[2]/div/div[2]/div/div/div[5]/div/button")).click();
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
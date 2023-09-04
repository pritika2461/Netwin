package OrengeHRM;

import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LeaveModule {
	 WebDriver driver ;
		
	  @Test(priority =1)
	  public void LeaveModule1() throws InterruptedException
	  {
		  
	      // click on Leave Module
	      driver.findElement(By.xpath("(//li[@class='oxd-main-menu-item-wrapper'])[3]")).click();
	      Thread.sleep(2000);
	      // click on search button
	      driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[3]/button[2]")).click(); 
	  }
	  
	  @Test(priority =2)
	  public void LeaveList() throws InterruptedException
	  {
		  
	      // click on Leave Module
	      driver.findElement(By.xpath("(//li[@class='oxd-main-menu-item-wrapper'])[3]")).click();
	      
	      driver.findElement(By.xpath("(//input[@placeholder='yyyy-mm-dd'])[1]")).sendKeys("2023-04-20");
	      driver.findElement(By.xpath("(//input[@placeholder='yyyy-mm-dd'])[2]")).sendKeys("2013-05-20");

	      driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[3]/button[2]")).click(); 
	  	
	  }
	  
	  @Test(priority =3)
	  public void ApplyLeave() throws InterruptedException
	  {
		 
	      // click on Leave Module
	      driver.findElement(By.xpath("(//li[@class='oxd-main-menu-item-wrapper'])[3]")).click();
	      
	      driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[1]")).click();
	      
	      driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[4]/button")).click();
	      
	      driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[1]/div/div[2]/div/div/div[2]")).click();
	      
	      driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[1]/div/div[2]/div/div/input")).sendKeys("2023-04-20");
	      driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div[2]/div/div/input")).sendKeys("2023-04-23");
	  	
	      
	  }
	  
	  
	  @Test(priority =4)
	  public void MyLeave() throws InterruptedException
	  {
		  
	      // click on Leave Module
	      driver.findElement(By.xpath("(//li[@class='oxd-main-menu-item-wrapper'])[3]")).click();
	      
	      driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[2]")).click();
	  }
	  
	  @Test(priority =5)
	  public void LeaveList1() throws InterruptedException
	  {
		  
	      // click on Leave Module
	      driver.findElement(By.xpath("(//li[@class='oxd-main-menu-item-wrapper'])[3]")).click();
	      
	      driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[6]")).click();
	  }
	  
	  
	  @Test(priority =6)
	  public void AssignLeave() throws InterruptedException
	  {
		  
	      // click on Leave Module
	      driver.findElement(By.xpath("(//li[@class='oxd-main-menu-item-wrapper'])[3]")).click();
	      
	      driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[7]")).click();
	      
	      driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div/div/div[2]/div/div/input")).sendKeys("Personal reason");
	      
	      driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[5]/button")).click();
	  }
	  @Test(priority =7)
	  public void Approved() throws InterruptedException
	  {
		  
	      // click on Leave Module
	      driver.findElement(By.xpath("(//li[@class='oxd-main-menu-item-wrapper'])[3]")).click();
	      
	      driver.findElement(By.xpath("(//input[@placeholder='yyyy-mm-dd'])[1]")).sendKeys("2023-04-20");
	      driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[2]/div/div[2]/div[7]/div/div[9]/div/button[1]")).click();

	  }
	  
	  @Test(priority =8)
	  public void Reject() throws InterruptedException
	  {
		  
	      // click on Leave Module
	      driver.findElement(By.xpath("(//li[@class='oxd-main-menu-item-wrapper'])[3]")).click();
	      
	      driver.findElement(By.xpath("(//input[@placeholder='yyyy-mm-dd'])[1]")).sendKeys("2023-04-20");
	      driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[2]/div/div[2]/div[8]/div/div[9]/div/button[2]")).click();

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
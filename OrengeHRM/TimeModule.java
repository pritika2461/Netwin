package OrengeHRM;

import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TimeModule {
	 WebDriver driver ;
		
	  @Test(priority =1)
	  public void TimeModule1() throws InterruptedException
	  {
		 
	      // click on Time Module
	      driver.findElement(By.xpath("(//li[@class='oxd-main-menu-item-wrapper'])[4]")).click();
	      
	      //enter employee name
	      driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/form/div[1]/div/div/div/div[2]/div/div/input")).sendKeys("Abcde Zxcvb Aszx");
	      
	      // Click on view 
	      driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/form/div[2]/button")).click();
	      
	   }
	  @Test(priority =2)
	  public void ViewPendindTimesheet() throws InterruptedException
	  {
		 
	      // click on Time Module
	      driver.findElement(By.xpath("(//li[@class='oxd-main-menu-item-wrapper'])[4]")).click();
	      
	      Thread.sleep(2000);
	      
	      // view timesheet
	      driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div[1]/div/div[3]/div/button")).click();
	  
	      // edit Timesheet
	      driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/form/div[3]/div[2]/button")).click();
	  
	      // enter Project name
	      driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/form/div[2]/table/tbody/tr[1]/td[1]/div/div[2]/div/div/input")).sendKeys("Apache Software Foundation - ASF - Phase 1");
        
	   driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/form/div[3]/div[2]/button[3]")).click();
	   
	  
	  }
	  
	  @Test(priority =3)
	  public void AddRow() throws InterruptedException
	  {
		  
	      // click on Time Module
	      driver.findElement(By.xpath("(//li[@class='oxd-main-menu-item-wrapper'])[4]")).click();
	      
	      Thread.sleep(2000);
	      
	      // view timesheet
	      driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div[1]/div/div[3]/div/button")).click();
	  
	      // edit Timesheet
	      driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/form/div[3]/div[2]/button")).click();
	  
	     // click on add row 
	      driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/form/div[2]/table/tbody/tr[2]/td/button")).click();
	    
	  }
	  
	  
	  @Test(priority =4)
	  public void CancelEditTimesheet() throws InterruptedException
	  {
		  
	      // click on Time Module
	      driver.findElement(By.xpath("(//li[@class='oxd-main-menu-item-wrapper'])[4]")).click();
	      
	      Thread.sleep(2000);
	      
	      // view timesheet
	      driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div[1]/div/div[3]/div/button")).click();
	  
	      // edit Timesheet
	      driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/form/div[3]/div[2]/button")).click();
	  
	     // click on cancel edit timesheet
	      driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/form/div[3]/div[2]/button[1]")).click();
	      
	      Thread.sleep(50000);
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
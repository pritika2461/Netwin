package OrengeHRM;

import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import io.github.bonigarcia.wdm.WebDriverManager;

public class PIMModule {
	 WebDriver driver ;
		
	 //Search user in PIM
	  @Test(priority = 1)
	  public void SearchEmployee() throws InterruptedException {
	     
	     // click on PIM Module 
	     WebElement pim = driver.findElement(By.xpath("(//a[@class=\"oxd-main-menu-item\"])[2]"));
		 pim.click();
		  
	      WebElement ename = driver.findElement(By.xpath("//input[@placeholder='Type for hints...']"));
	      ename.sendKeys("Pritika Somase"); 
	      
	      WebElement eid = driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]"));
	      eid.sendKeys("12345"); 
	      
	      driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[2]")).click();

	  }
	  
	  // Reset the record of user
	  @Test(priority =2)
	  public void resetbtn() throws InterruptedException
	  {
		 driver.findElement(By.xpath("(//li[@class='oxd-main-menu-item-wrapper'])[2]")).click();
	      
	      // Enter employee name
	      driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys("Pritika");
	      
	      // enter emp id 
	      driver.findElement(By.xpath("(//input[@class ='oxd-input oxd-input--active'])[2]")).sendKeys("1213");
	      
	      Thread.sleep(3000);
	      // click in reset button
	      driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[1]")).click();
	  }
	  
	  // Add PIM user
	  @Test(priority=3)
	  public void NavigateToPIM() throws InterruptedException 
	  {
		  
	      driver.findElement(By.xpath("(//li[@class='oxd-main-menu-item-wrapper'])[2]")).click();
	      
	      driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[1]/button")).click();
	      Thread.sleep(2000);
	      
	      driver.findElement(By.name("firstName")).sendKeys("Pritika");
	      driver.findElement(By.name("middleName")).sendKeys("Bhaulal");
	      driver.findElement(By.name("lastName")).sendKeys("Somase");
	      Thread.sleep(5000);
	      
	      driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]")).click();
	      
	      Thread.sleep(5000);
 	  }
	  
	  @Test(priority=4)
	  public void DeleteAction() throws InterruptedException 
	  {
		  
	      driver.findElement(By.xpath("(//li[@class='oxd-main-menu-item-wrapper'])[2]")).click();
	      
	      driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div[1]/div/div[9]/div/button[1]/i")).click();
	      Thread.sleep(5000);
 	  }
	  
	  @Test(priority=5)
	  public void EditAction() throws InterruptedException 
	  {
		 
	      driver.findElement(By.xpath("(//li[@class='oxd-main-menu-item-wrapper'])[2]")).click();
	      	      
	      driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div[1]/div/div[9]/div/button[2]")).click();
	      
	      driver.findElement(By.name("middleName")).sendKeys("Bhaulal");
	      driver.findElement(By.name("lastName")).sendKeys("Somase");
	      Thread.sleep(5000);
	      
	      driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[5]/button")).click();
	      
	      Thread.sleep(5000);
 	  }
	  
	  @Test(priority=6)
	  public void EmpList() throws InterruptedException 
	  {
		  
	      driver.findElement(By.xpath("(//li[@class='oxd-main-menu-item-wrapper'])[2]")).click();
	      	      
	      driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[2]")).click();
	      
	      driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/div/div/input")).sendKeys("Pritika");
	      driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[2]")).click();
	      Thread.sleep(5000);
 	  }
	  
	  
	  @Test(priority=7)
	  public void AddEmp() throws InterruptedException 
	  {
		    
	      driver.findElement(By.xpath("(//li[@class='oxd-main-menu-item-wrapper'])[2]")).click();
	      	      
	      driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[3]")).click();
	      
	     Thread.sleep(5000);
 	  }
	  
	  
	  @Test(priority=8)
	  public void Reports() throws InterruptedException 
	  {
	      
	      driver.findElement(By.xpath("(//li[@class='oxd-main-menu-item-wrapper'])[2]")).click();
	      	      
	      driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[4]")).click();
	      
	      driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div/div/div[2]/div/div/input")).sendKeys("All Employee Sutb Unit Hierarchy Repor");
	      
	      driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[2]")).click();
	     Thread.sleep(5000);
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
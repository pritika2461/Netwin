package OrengeHRM;

import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MaintainceModule {
	 WebDriver driver ;
		
	  @Test(priority =1)
	  public void MaintainceModule1() throws InterruptedException
	  {
	      
		  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[10]")).click();
		  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/form/div[4]/button[2]")).click();
		  
	  }
	  
	  @Test(priority =2)
	  public void AdministratorAccess() throws InterruptedException
	  {
		  
		  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[10]")).click();
		  
		  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/form/div[3]/div/div[2]/input")).sendKeys("admin123");
		  
		  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/form/div[4]/button[2]")).click();
		  Thread.sleep(5000);
		  
		  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/form/div[1]/div/div/div/div[2]/div/div/input")).sendKeys("admin");
		  
		  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/form/div[2]/button")).click();
		  
	  }
	
	  
	  @Test(priority =3)
	  public void AccessRecord() throws InterruptedException
	  {
		 
		  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[10]")).click();
		  
		  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/form/div[3]/div/div[2]/input")).sendKeys("admin123");
		  
		  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/form/div[4]/button[2]")).click();
		  Thread.sleep(5000);
		  
		  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[2]")).click();
		  
		  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div[1]/form/div[1]/div/div/div/div[2]/div/div/input")).sendKeys("Anna Ahmede Ben");
		  
		  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div[1]/form/div[2]/button")).click();
		 
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
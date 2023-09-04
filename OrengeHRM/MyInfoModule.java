package OrengeHRM;

import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MyInfoModule {
	 WebDriver driver ;
		
	  @Test(priority =1)
	  public void MyInfoModule1() throws InterruptedException
	  {
		  
		  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[6]")).click();
		  
		  // click on save button
		  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[5]/button")).click();
		  Thread.sleep(5000);
	  }
	  
	  @Test(priority =2)
	  public void AddPersonalDetails() throws InterruptedException
	  {
		  
		  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[6]")).click();
		  
		  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div[1]/div/div/div[2]/div[1]/div[2]/input")).sendKeys("Pritika");
		  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div[1]/div/div/div[2]/div[2]/div[2]/input")).sendKeys("Bhaulal");
		  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div[1]/div/div/div[2]/div[3]/div[2]/input")).sendKeys("Somase");
		  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div[2]/div/div/div[2]/input")).sendKeys("PBS");
		  
		  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[1]/div[1]/div/div[2]/input")).sendKeys("234");
		  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[1]/div[2]/div/div[2]/input")).sendKeys("34345433");
		 
		  Thread.sleep(5000);
		  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[5]/button")).click();
		  Thread.sleep(5000);
	  }
	  
	  @Test(priority =3)
	  public void AddCustomFiled() throws InterruptedException
	  {

		  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[6]")).click();
		  
		  // click on save button
		  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[2]/div/form/div[2]/button")).click();
		  Thread.sleep(5000);
	  }
	  
	  @Test(priority =4)
	  public void AddAttachment() throws InterruptedException
	  {
		   
		  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[6]")).click();
		  
		  // click on save button
		  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[3]/div[1]/div/button")).click();
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
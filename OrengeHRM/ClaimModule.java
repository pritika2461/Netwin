package OrengeHRM;

import org.testng.annotations.Test;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ClaimModule {
	 WebDriver driver ;
		
	  @Test(priority =1)
	  public void EmployeeClaim() throws InterruptedException
	  {
		
	      
		  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[11]")).click();
		 
		  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/div/div/input")).sendKeys("Abed  ABED");
		  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/div/div/input")).sendKeys("202308240000010");
		  
		  //click on search button 
		  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div[1]/div[2]/form/div[3]/button[2]")).click();
		  
	  }
	  
	  @Test(priority =2)
	  public void EmployeeClaim1() throws InterruptedException
	  {
		  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[11]")).click();
		 
		  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/div/div/input")).sendKeys("Abed  ABED");
		  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/div/div/input")).sendKeys("202308240000010");
		  
		  //click on reset button 
		  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div[1]/div[2]/form/div[3]/button[1]")).click();
		  
	  }
	  
	  @Test(priority =3)
	  public void AssignClaim() throws InterruptedException
	  {
	      
		  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[11]")).click();
		 
		  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[5]")).click();
		 driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div/div/div[2]/div/div/input")).sendKeys("Peter Mac Anderson",Keys.ENTER);
		 
		 driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[4]/button[2]")).click();
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
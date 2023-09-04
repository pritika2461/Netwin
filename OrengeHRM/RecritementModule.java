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

public class RecritementModule {
	 WebDriver driver ;
		
	  @Test(priority =1)
	  public void ReceitementModule1() throws InterruptedException
	  {
		 
	      driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[5]")).click();
	      
    	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[4]/button[2]")).click();
          Thread.sleep(2000);
	  }
	  
	  @Test(priority =2)
	  public void AddCandidate() throws InterruptedException
	  {
		 
	      driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[5]")).click();
	      
    	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[1]/button")).click();
    	  
    	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div/div/div[2]/div[1]/div[2]/input")).sendKeys("Pritika");
    	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div/div/div[2]/div[2]/div[2]/input")).sendKeys("Bhaulal");
    	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div/div/div[2]/div[3]/div[2]/input")).sendKeys("Somase");
          
    	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div[1]/div/div[2]/input")).sendKeys("pritikasomase@gmail.com");
    	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div[2]/div/div[2]/input")).sendKeys("54665657575");
          
    	  WebElement uploadElement = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[4]/div/div/div/div/div[2]/input"));
          uploadElement.sendKeys("D:\\abc.txt");
          
          Thread.sleep(5000);
         
          driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[8]/button[2]")).click();
    	  Thread.sleep(2000);
	  }
	  
	  @Test(priority =3)
	  public void Candidate() throws InterruptedException
	  {
		  
	      driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[5]")).click();
	      
    	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[1]")).click();
    	 
    	  Thread.sleep(2000);
	  }
	  
	  @Test(priority =4)
	  public void Vaccency() throws InterruptedException
	  {
		  
	      driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[5]")).click();
	      
    	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[2]")).click();
    	  
    	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[2]")).click();
	  }
	  
	  @Test(priority =5)
	  public void DeleteVaccency() throws InterruptedException
	  {
		  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[5]")).click();
	      
    	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[2]")).click();
    	  
    	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[2]")).click();
    	  
    	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div[1]/div/div[6]/div/button[1]")).click();
    	  
    	  Thread.sleep(2000);
	  }
	  
	  @Test(priority =6)
	  public void EditVaccency() throws InterruptedException
	  {
		  
	      driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[5]")).click();
	      
    	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[2]")).click();
    	  
    	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[2]")).click();
    	  
    	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div[1]/div/div[6]/div/button[2]")).click();
    	  
    	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/form/div[7]/button[2]")).click();
    	  Thread.sleep(2000);
	  }
	  
	  @Test(priority =7)
	  public void AddAttachment() throws InterruptedException
	  {
		 
	      driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[5]")).click();
	      
    	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[2]")).click();
    	  
    	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[2]")).click();
    	  
    	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div[1]/div/div[6]/div/button[2]")).click();
    	  Thread.sleep(2000);
    	  
    	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[1]/button")).click();
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
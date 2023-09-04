package OrengeHRM;

import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AdminModule
{
	WebDriver driver ;
	
	 //Check user is able to get the url.
	  @BeforeMethod
		  public void beforeMethod()
	  {  
			  WebDriverManager.chromedriver().setup();
			  driver = new ChromeDriver();
			  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
			  driver.manage().window().maximize();
			  
			  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			  driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
			  
			  driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		      driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		      driver.findElement(By.xpath("//button[@type='submit']")).click();
		      driver.getTitle();
		  }

		  // Search user by entering user name
		  @Test(priority = 1)
		  public void SearchBtn() throws InterruptedException
		  {  
		      
		      //Click on Admin
			  driver.findElement(By.xpath("//li[@class='oxd-main-menu-item-wrapper']")).click();
			  
			  // Pass the username
			  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/input")).sendKeys("Pritika");		     
			 
			  // Click on search button
			  driver.findElement(By.xpath("//button[@type='submit']")).click();
		  
		  }
		  
		// Reset the user searching
			  @Test(priority =2)
			  public void ResetBtn() throws InterruptedException  
			  {  
				  driver.findElement(By.xpath("//li[@class='oxd-main-menu-item-wrapper']")).click();
				  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/input")).sendKeys("Pritika");
			      Thread.sleep(2000);
				  driver.findElement(By.xpath("(//button[@type='button'])[4]")).click();
			  
			  }
			  
			  // Add user 
			  @Test(priority =3)
			  public void AddBtn() throws InterruptedException
			  {  
				  
				  driver.findElement(By.xpath("//li[@class='oxd-main-menu-item-wrapper']")).click();
				  
				  driver.findElement(By.xpath("(//button[@type=\"button\"])[5]")).click();
				  driver.findElement(By.xpath("(//button[@type=\"submit\"])[1]")).click();
			  }
			  
			  @Test(priority = 4)
			  public void AddUser() throws InterruptedException
			  {  
			      
				  driver.findElement(By.xpath("//li[@class='oxd-main-menu-item-wrapper']")).click();
				  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/input")).sendKeys("Pritika");
				  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[3]/div/div[2]/div/div/input")).sendKeys("Pritika");
				     
//				  Select status = new Select (driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[4]/div/div[2]/div/div/div[1]")));
//				  status.selectByVisibleText("Enabled");
//				  
//				  Select urole = new Select (driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/div/div/div[1]")));
//				  urole.selectByVisibleText("ESS");
				  
				  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[3]/div/div[2]/div/div/input")).sendKeys("Pritika");
			      driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[2]")).click();
			  }
			  
			  @Test(priority =5)
			  public void deleteuser() throws InterruptedException
			  {  
				  
				  driver.findElement(By.xpath("//li[@class='oxd-main-menu-item-wrapper']")).click();
				  
				  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div[1]/div/div[6]/div/button[1]")).click();
			  }
			  
			  
			  @Test(priority =6)
			  public void edituser() throws InterruptedException
			  {  
				  
				  driver.findElement(By.xpath("//li[@class='oxd-main-menu-item-wrapper']")).click();
				  
				  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div[1]/div/div[6]/div/button[2]")).click();
			  }
			  
			  @Test(priority =7)
			  public void nationalitys() throws InterruptedException
			  {  
				  
				  driver.findElement(By.xpath("//li[@class='oxd-main-menu-item-wrapper']")).click();
				  
				  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[5]")).click();
			  }
			  
			  
			  @Test(priority =8)
			  public void corporate_bonding() throws InterruptedException
			  {  
				  
				  driver.findElement(By.xpath("//li[@class='oxd-main-menu-item-wrapper']")).click();
				  
				  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[6]")).click();
				  
				  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[4]/div/button[3]")).click();
			  }
			  

		  @AfterMethod
		  public void afterMethod() throws InterruptedException 
		  {
			  Thread.sleep(5000);
			  driver.close();
		  }
	   
	}

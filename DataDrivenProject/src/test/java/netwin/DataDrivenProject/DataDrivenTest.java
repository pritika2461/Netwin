package netwin.DataDrivenProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataDrivenTest {
	WebDriver driver;
	
  @Test(dataProvider = "LoginData", dataProviderClass = ExelDataSupplier.class)
  
  public void Login( String fullName, String Bmail, String country, String phone_number) throws InterruptedException
  {
	  WebDriverManager.chromedriver().setup();
      WebDriver driver = new ChromeDriver();
      
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
      driver.manage().window().maximize();
      
      driver.get("https://www.orangehrm.com/en/book-a-free-demo/");
      
      WebElement Username = driver.findElement(By.name("FullName"));
      Username.sendKeys(fullName);
      
      WebElement Password = driver.findElement(By.name("Email"));
      Password.sendKeys(Bmail);
      
      Select country1 = new Select(driver.findElement(By.name("Country")));
      country1.selectByVisibleText(country);
      
      WebElement number = driver.findElement(By.name("Contact"));
      number.sendKeys(phone_number);
      
      driver.findElement(By.xpath("//button[@type='submit']")).click();

      Thread.sleep(5000);
      
      driver.close();
    
  }
  
  
}

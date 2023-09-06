package netwin.WebMathNew;

import java.io.FileInputStream;

import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class SkillsForSucessPage {
	
	WebDriver driver ;
	Properties p;
	
	  //Check user is able to get the url.
	 @BeforeMethod
	  public void beforeMethod() throws IOException
      {  
	  
	      FileInputStream fis = new FileInputStream("C:\\Users\\Pritika.Somase\\eclipse-workspace\\WebMathNew\\src\\test\\java\\resources\\data.properties");
		  p = new Properties();
		  p.load(fis);
		 
		  WebDriverManager.chromedriver().setup();
		  driver = new ChromeDriver();
		  driver.get(p.getProperty("url"));
		  driver.manage().window().maximize();
		  
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		  driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
      }
	 
	 
	 
	  @Test(priority = 1)
	  public void skillsForSucess()
	  {
		   driver.findElement(By.xpath(p.getProperty("skills_for_sucess"))).click();
	  } 
	  
	 
	  @Test(priority = 2)
	  public void writingSkills()
	  {
		  driver.findElement(By.xpath(p.getProperty("skills_for_sucess"))).click();
		  driver.findElement(By.xpath(p.getProperty("writing_skill"))).click();
	  } 
	 
	  @Test(priority = 3)
	  public void readingSkills()
	  {
		  driver.findElement(By.xpath(p.getProperty("skills_for_sucess"))).click();
		  driver.findElement(By.xpath(p.getProperty("reading_skill"))).click();
	  } 
	  @Test(priority = 4)
	  public void digitalSkills()
	  {
		  driver.findElement(By.xpath(p.getProperty("skills_for_sucess"))).click();
		  driver.findElement(By.xpath(p.getProperty("digital_skill"))).click();
	  } 
	  
	  @Test(priority = 5)
	  public void problemSolvingSkills()
	  {
		  driver.findElement(By.xpath(p.getProperty("skills_for_sucess"))).click();
		  driver.findElement(By.xpath(p.getProperty("problem_solving_skill"))).click();
	  } 
	  @Test(priority = 6)
	  public void communicationSkills()
	  {
		  driver.findElement(By.xpath(p.getProperty("skills_for_sucess"))).click();
		  driver.findElement(By.xpath(p.getProperty("communication_skill"))).click();
	  } 
	  @Test(priority = 7)
	  public void numeracySkills()
	  {
		  driver.findElement(By.xpath(p.getProperty("skills_for_sucess"))).click();
		  driver.findElement(By.xpath(p.getProperty("numeracy_skill"))).click();
	  } 
	  @Test(priority = 8)
	  public void creativitySkills()
	  {
		  driver.findElement(By.xpath(p.getProperty("skills_for_sucess"))).click();
		  driver.findElement(By.xpath(p.getProperty("creativity_skill"))).click();
	  } 
	  @Test(priority = 9)
	  public void collabrationSkills()
	  {
		  driver.findElement(By.xpath(p.getProperty("skills_for_sucess"))).click();
		  driver.findElement(By.xpath(p.getProperty("collbration_skill"))).click();
	  } 
	  @Test(priority = 10)
	  public void adaptibilitySkills()
	  {
		  driver.findElement(By.xpath(p.getProperty("skills_for_sucess"))).click();
		  driver.findElement(By.xpath(p.getProperty("adaptibility_skill"))).click();
	  } 
	  @Test(priority = 11)
	  public void upSkillsSkills()
	  {
		  driver.findElement(By.xpath(p.getProperty("skills_for_sucess"))).click();
		  driver.findElement(By.xpath(p.getProperty("upSkills"))).click();
	  } 
	  @Test(priority = 12)
	  public void skillsForLifeSeries()
	  {
		  driver.findElement(By.xpath(p.getProperty("skills_for_sucess"))).click();
		  driver.findElement(By.xpath(p.getProperty("skill_for_life_series"))).click();
	  } 
	  @Test(priority = 13)
	  public void jobSearchResouces()
	  {
		  driver.findElement(By.xpath(p.getProperty("skills_for_sucess"))).click();
		  driver.findElement(By.xpath(p.getProperty("job_search_resources"))).click();
	  } 
	  
  @AfterMethod
  public void close() throws InterruptedException
  {
	  Thread.sleep(5000);
	  driver.quit();
  }
}

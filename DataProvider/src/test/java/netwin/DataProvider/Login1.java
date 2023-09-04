 package netwin.DataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login1 
{
	WebDriver driver ;
	 Properties p;
	  //Check user is able to get the url.
    @BeforeMethod
	  public void beforeMethod() throws IOException
    {  

    	// creating object of FileInputStream
	     FileInputStream fis = new FileInputStream("C:\\Users\\Pritika.Somase\\eclipse-workspace\\DataProvider\\src\\test\\java\\data.properties");
		 p = new Properties();
		 p.load(fis);
		 
		  WebDriverManager.chromedriver().setup();
		  driver = new ChromeDriver();
		  driver.get(p.getProperty("url"));
		  driver.manage().window().maximize();
		  
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		  driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
	  }
    
    
    @DataProvider(name = "LoginData")
	public String[][] getData() throws IOException
	{
    	
    	// creating object of FileInputStream
	     FileInputStream fis = new FileInputStream("C:\\Users\\Pritika.Somase\\eclipse-workspace\\DataProvider\\src\\test\\java\\data.properties");
		 Properties p = new Properties();
		 p.load(fis);
		  
		File excelFile = new File(p.getProperty("excel_file_path"));
	    System.out.println(excelFile.exists());
	    
	    FileInputStream fis1 = new FileInputStream(excelFile);
	    @SuppressWarnings("resource")
		XSSFWorkbook workbook = new XSSFWorkbook(fis1);    
	    
	    XSSFSheet sheet = workbook.getSheet("Sheet1");
	    
	    int noOfRows = sheet.getPhysicalNumberOfRows();
	    int noOfColumn = sheet.getRow(0).getLastCellNum();
	    
	    String [][] data = new String[noOfRows-1][noOfColumn];
		  
	    for(int i = 1; i<noOfRows-1; i++)
	    {
	    	for(int j=0; j<noOfColumn;j++)
	    	{
	    		DataFormatter df = new DataFormatter();
	    		data[i][j] = df.formatCellValue(sheet.getRow(i).getCell(j));
		
		    }
	    }
	    	System.out.println();
	  
	  
	    return data;
	}
	

	
    @Test( priority=1, dataProvider = "LoginData")
    
    public void Login( String userName, String Password1) throws InterruptedException, IOException
    {
    	
		 
  	    WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().window().maximize();
        
        driver.get(p.getProperty("url"));
        
        WebElement Username = driver.findElement(By.name("username"));
        Username.sendKeys(userName);
        
        WebElement Password = driver.findElement(By.name("password"));
        Password.sendKeys(Password1);
        
        driver.findElements(By.xpath(p.getProperty("submit-btn")));
    }
	  
	  @Test(priority = 2)
	  public void forgetPass() {
		  driver.findElement(By.className(p.getProperty("forget-pass"))).click(); // click on forget button
	  }
	  
	  @Test(priority = 3)
	  public void resetbtn()
	  {
		  driver.findElement(By.className("forget-pass")).click();
		  driver.findElement(By.name("username")).sendKeys("Admin");   //set the user name
		  driver.findElement(By.xpath(p.getProperty("pass-submit"))).click();  // click on reset button
	  }
	  
	  @Test(priority = 4)
	  public void cancelbtn()
	  {
		  driver.findElement(By.className("forget-pass")).click();
		  driver.findElement(By.name("username")).sendKeys("Admin");    // set the username
		  driver.findElement(By.xpath("pass-submit']")).click(); // click on cancel
	  }
	  
	  @Test(priority = 5)
	  public void linkedInPage() 
	  {
		  driver.findElement(By.xpath(p.getProperty("linked-in"))).click();
	  }
	  
	  @Test(priority = 6)
	  public void fackbookPage() 

	  {
		  driver.findElement(By.xpath(p.getProperty("fackbook"))).click();
	  }
	  
	  @Test(priority = 7)
	  public void twiterPage() 

	  {
		  driver.findElement(By.xpath(p.getProperty("twitter"))).click();
	  }
	  
	  @Test(priority = 8)
	  public void youtubePage()
	  {
		  driver.findElement(By.xpath(p.getProperty("youtube"))).click();
	  }
	  
	  @Test(priority = 9)
	  public void OrengeHRMPage() 
	  {
		  driver.findElement(By.xpath(p.getProperty("orenge-hrm" ))).click();
	  }
	   

	  @AfterMethod
	  public void afterMethod() throws InterruptedException 
	  {
		  Thread.sleep(5000);
		  driver.close();
	  }
     
 
}

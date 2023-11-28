package netwin.MobileBanking1;

import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class MB_LoginPage
{
	//*****************Actions of Login*********************//
	public static AndroidDriver driver;
	public static XSSFWorkbook workbook;
	public static Properties  p = new Properties();
	
	@BeforeSuite
	public static AndroidDriver capabilities() throws IOException, InterruptedException 
	{   
		 FileInputStream fis1 = new FileInputStream(System.getProperty("user.dir")+"//src//main//resources"+"\\object.properties");
		 p.load(fis1);
		 
		 FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"//src//test//resources"+"\\MB_LoginCases.xlsx");
		 workbook = new XSSFWorkbook(fis); 
	     
		 DesiredCapabilities dc = new DesiredCapabilities();
		
		//************************capabilities**********************//
		
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "14");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5556");
		dc.setCapability("noReset", true);
		
		//************************ App Setup*****************************//
		
		dc.setCapability("appPackage", "com.netwin.mobilebanking.dyankmsj");
		dc.setCapability("appActivity", "com.netwin.mobilebanking.FlashActivity");
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
	    driver = new AndroidDriver(url, dc);      
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    return driver;
	}
	
	// Login With User Name and Password	 
	@Test(priority=1)
	public void Login() throws IOException, InterruptedException
	{ 
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		driver.findElement(By.id(p.getProperty("SelectPassword"))).click();

		for(int i = 1; i<=sheet.getLastRowNum(); i++)
        {
        	XSSFRow row = sheet.getRow(i);        		 	
        	int userid= (int) row.getCell(3).getNumericCellValue(); 	
        	int pass = (int) row.getCell(4).getNumericCellValue(); 
        	
            driver.findElement(By.id(p.getProperty("UserId"))).clear();
  	        driver.findElement(By.id(p.getProperty("Password"))).clear(); 
  	       
	        driver.findElement(By.id(p.getProperty("UserId"))).sendKeys(""+userid);    // user id
	        driver.findElement(By.id(p.getProperty("Password"))).sendKeys(""+pass);    // Password   
	        driver.findElement(By.id(p.getProperty("LoginButton"))).click();                              // Login btn
	        
	        if(userid ==3012 && pass==123456)
       	    {  
      	       sheet.getRow(i).getCell(6).setCellValue("Login Sucess");
      	       sheet.getRow(i).getCell(7).setCellValue("Pass");
       	       driver.findElement(By.id(p.getProperty("LogoutButton"))).click();		
	           driver.findElement(By.id(p.getProperty("ConfirmLogout"))).click();
	           driver.findElement(By.id(p.getProperty("SelectPassword"))).click();
	        }  
	        else {sheet.getRow(i).getCell(6).setCellValue("Login Not Success");}
	         
	        String expected = row.getCell(5).getStringCellValue();
	    	String actual = row.getCell(6).getStringCellValue();
	    	  
	    	if(expected.equals(actual)) {sheet.getRow(i).getCell(7).setCellValue("Pass");}
	    	else {sheet.getRow(i).getCell(7).setCellValue("Fail");}	    	

	    	FileOutputStream fos = new FileOutputStream(System.getProperty("user.dir")+"//src//test//resources"+"\\MB_LoginCases.xlsx");
		    workbook.write(fos);
		    fos.close(); 
         }
       }
	
	//Login With Password
	@Test(priority=2, enabled = false)
	public void Password()
	{		
          // select password and enter  
	       driver.findElement(By.id(p.getProperty("SelectPassword"))).click();
	       driver.findElement(By.id(p.getProperty("Password"))).sendKeys("123456");      
	       driver.findElement(By.id(p.getProperty("LoginButton"))).click();
	     
	       // logout 
	       driver.findElement(By.id(p.getProperty("LogoutButton"))).click();		
	       driver.findElement(By.id(p.getProperty("ConfirmLogout"))).click();
	}
	
	// Login With MPIN
	@Test(priority=3, enabled = false)
	public void MPIN()
	{
	       // Enter MPIN and login
	       driver.findElement(By.id(p.getProperty("Password"))).sendKeys("1234");      
	       driver.findElement(By.id(p.getProperty("LoginButton"))).click();
	       	
	       // logout 
	       driver.findElement(By.id(p.getProperty("LogoutButton"))).click();		
	       driver.findElement(By.id(p.getProperty("ConfirmLogout"))).click();
	}  
}

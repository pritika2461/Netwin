package Utils;

import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class MB_BaseClass 
{
	public static AndroidDriver driver;
	public static XSSFWorkbook workbook;
	public static Properties p = new Properties();
	
	@BeforeSuite
	public static AndroidDriver capabilities() throws IOException, InterruptedException 
	{    
		 FileInputStream fis1 = new FileInputStream(System.getProperty("user.dir")+"//src//main//resources"+"\\object.properties");
		 FileInputStream fis2 = new FileInputStream(System.getProperty("user.dir")+"//src//main//resources"+"\\data.properties");
		 p.load(fis1);p.load(fis2);
		 
		 FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"//src//test//resources"+"\\MB_TestCaseSheet.xlsx");
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
		@BeforeClass
		public void login()
		{
			  driver.findElement(By.id(p.getProperty("SelectPassword"))).click();
			  driver.findElement(By.id(p.getProperty("UserId"))).clear();
			  driver.findElement(By.id(p.getProperty("UserId"))).sendKeys(p.getProperty("UserName"));  
		      driver.findElement(By.id(p.getProperty("Password"))).sendKeys(p.getProperty("Password1"));   
		      driver.findElement(By.id(p.getProperty("LoginButton"))).click(); 
		}
	
//		@AfterTest()
//		public void tearDown() throws InterruptedException
//		{
//			Thread.sleep(1000);
//			driver.close();
//		}
//		
		
		public void Write() throws IOException
		{
			FileOutputStream fos = new FileOutputStream(System.getProperty("user.dir")+"//src//test//resources"+"\\MB_TestCaseSheet.xlsx");
			  workbook.write(fos);
		    fos.close(); 
		}
	
}

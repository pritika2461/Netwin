//package ExtentReport;
//
//import java.time.Duration;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import com.aventstack.extentreports.ExtentReports;
//import com.aventstack.extentreports.ExtentTest;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//
//public class ExtentReportBasicEample {
//
//	public static void main(String[] args) {
//		
//		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extentReport.html");
//		
//		ExtentReports extent = new ExtentReports();
//		extent.attachReport(htmlReporter);
//		
//		ExtentTest test1 = extent.createTest("Google search");
//		
//		String projectPath = System.getProperty("user.dir");
//		
//		  WebDriverManager.chromedriver().setup();
//	        WebDriver driver = new ChromeDriver();
//	        
//	     
//	        driver.get("https:google.com");
//	        
//	        driver.fin
//		
//
//	}
//
//}

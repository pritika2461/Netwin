package ExtentReport;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentLogs {

	public static void main(String[] args) throws IOException 
	{
		ExtentReports extentReports = new ExtentReports();
		 File file = new File("report.html");
		 
		ExtentSparkReporter sparkReporter = new ExtentSparkReporter(file);
		extentReports.attachReporter(sparkReporter);
		
		 extentReports
		    .createTest("Test 1")
		    .log(Status.INFO, "Info 1")
		    .log(Status.INFO, "Info 2")
		    .log(Status.INFO, "Info21")
		    .log(Status.PASS, "Pass")
		    .log(Status.WARNING, "Warning")
		    .log(Status.WARNING, "Warning")
		    .log(Status.SKIP, "Skip")
		    .log(Status.FAIL, "Fail1")
		    .log(Status.PASS, "PASS");
		    
	
	    
		
	    
		
		
		extentReports.flush();
		Desktop.getDesktop().browse(new File("report.html").toURI());
	}
	

}

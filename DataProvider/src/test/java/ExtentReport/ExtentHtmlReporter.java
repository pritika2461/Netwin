package ExtentReport;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentHtmlReporter {

	public static void main(String[] args) throws IOException 
	{
		ExtentReports extentReports = new ExtentReports();
		 File file = new File("report.html");
		 
		ExtentSparkReporter sparkReporter = new ExtentSparkReporter(file);
		extentReports.attachReporter(sparkReporter);
		
		ExtentTest tst = extentReports.createTest("Test 0");
	    tst.pass("This is passed...0");
	    
		ExtentTest tst1 = extentReports.createTest("Test 1");
	    tst1.pass("This is passed...1");
	    
	    ExtentTest tst2 = extentReports.createTest("Test 2");
	    tst2.log(Status.FAIL, "This is failed..");
	    
	    extentReports.createTest("Test 3").skip("This is skipped..");
	    
		extentReports.flush();
		Desktop.getDesktop().browse(new File("report.html").toURI());
	}
	

}

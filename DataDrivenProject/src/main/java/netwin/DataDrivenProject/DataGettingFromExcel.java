package netwin.DataDrivenProject;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataGettingFromExcel 
{
	public static void main(String args[]) throws IOException
	{
		   WebDriver driver = new ChromeDriver();
		      
		      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		      driver.manage().window().maximize();
		      
		      driver.get("https://online.roboform.com/site/signup");
		      
		      FileInputStream fis = new FileInputStream("C:\\Users\\Pritika.Somase\\eclipse-workspace\\testngex\\src\\main\\java\\resources\\writedata.xlsx");
			  XSSFWorkbook workbook = new XSSFWorkbook(fis);    
			    
			    XSSFSheet sheet = workbook.getSheet("Sheet1");
			    
			    int noOfRows = sheet.getLastRowNum();
			    int noOfColumn = sheet.getRow(1).getLastCellNum();
			    
			    System.out.println(" rowcount :"+noOfRows +"Colcount :"+noOfColumn);
			    
			 
	}
}

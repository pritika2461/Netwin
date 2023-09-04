package OrengeHRM;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class ExcelDataSupplier {
     
	@DataProvider(name = "LoginData")
	public String[][] getData() throws IOException
	{
		File excelFile = new File("C:\\Users\\Pritika.Somase\\eclipse-workspace\\testngex\\src\\main\\java\\resources\\excelFile.xlsx");
	    System.out.println(excelFile.exists());
	    
	    FileInputStream fis = new FileInputStream(excelFile);
	    XSSFWorkbook workbook = new XSSFWorkbook(fis);    
	    
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
	
	
}

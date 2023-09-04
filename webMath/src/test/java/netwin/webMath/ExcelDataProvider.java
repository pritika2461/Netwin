package netwin.webMath;

import java.io.File;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class ExcelDataProvider {
     
	 @DataProvider(name = "LoginData")
		public String[][] getData() throws IOException
		{
			FileInputStream fis = new FileInputStream("C:\\Users\\Pritika.Somase\\eclipse-workspace\\webMath\\src\\test\\java\\netwin\\webMath\\data.properties");
			Properties  p = new Properties();
			p.load(fis);
		  
			File excelFile = new File("C:\\Users\\Pritika.Somase\\eclipse-workspace\\webMath\\src\\test\\java\\netwin\\webMath\\Data.xlsx");
		    System.out.println(excelFile.exists());
		    
		    FileInputStream fis1 = new FileInputStream(excelFile);
			@SuppressWarnings("resource")
			XSSFWorkbook workbook1 = new XSSFWorkbook(fis1);    
		    
		    XSSFSheet sheet1 = workbook1.getSheet("Sheet1");

		    int noOfRows = sheet1.getPhysicalNumberOfRows();
		    int noOfColumn = sheet1.getRow(0).getLastCellNum();
		    
	        String [][] data1 = new String[noOfRows-1][noOfColumn];	 
	        
		    for(int i = 1; i<noOfRows-1; i++)
		    {
		    	for(int j=0; j<noOfColumn;j++)
		    	{
		    		DataFormatter df = new DataFormatter();
		    		data1[i][j] = df.formatCellValue(sheet1.getRow(i).getCell(j));
			
			    }
		    }
		    System.out.println();
		    return data1;
		}
	 @DataProvider(name = "LoginData1")
		public String[][] getData1() throws IOException
		{
			FileInputStream fis = new FileInputStream("C:\\Users\\Pritika.Somase\\eclipse-workspace\\webMath\\src\\test\\java\\netwin\\webMath\\data.properties");
			Properties  p = new Properties();
			p.load(fis);
		  
			File excelFile = new File("C:\\Users\\Pritika.Somase\\eclipse-workspace\\webMath\\src\\test\\java\\netwin\\webMath\\Data.xlsx");
		    System.out.println(excelFile.exists());
		    
		    FileInputStream fis1 = new FileInputStream(excelFile);
			@SuppressWarnings("resource")
			XSSFWorkbook workbook1 = new XSSFWorkbook(fis1);    
		    
	
		    XSSFSheet sheet2 = workbook1.getSheet("Sheet2");

		    int noOfRows = sheet2.getPhysicalNumberOfRows();
		    int noOfColumn = sheet2.getRow(1).getLastCellNum();
		    
	        String [][] data1 = new String[noOfRows-1][noOfColumn];	 
	        
		    for(int i = 1; i<noOfRows-1; i++)
		    {
		    	for(int j=0; j<noOfColumn;j++)
		    	{
		    		DataFormatter df = new DataFormatter();
		    		data1[i][j] = df.formatCellValue(sheet2.getRow(i).getCell(j));
			
			    }
		    }
		    System.out.println();
		    return data1;
		}
	 @DataProvider(name = "LoginData2")
		public String[][] getData2() throws IOException
		{
			FileInputStream fis = new FileInputStream("C:\\Users\\Pritika.Somase\\eclipse-workspace\\webMath\\src\\test\\java\\netwin\\webMath\\data.properties");
			Properties  p = new Properties();
			p.load(fis);
		  
			File excelFile = new File("C:\\Users\\Pritika.Somase\\eclipse-workspace\\webMath\\src\\test\\java\\netwin\\webMath\\Data.xlsx");
		    System.out.println(excelFile.exists());
		    
		    FileInputStream fis1 = new FileInputStream(excelFile);
			@SuppressWarnings("resource")
			XSSFWorkbook workbook1 = new XSSFWorkbook(fis1);    
		    
	
		    XSSFSheet sheet3 = workbook1.getSheet("Sheet3");

		    int noOfRows = sheet3.getPhysicalNumberOfRows();
		    int noOfColumn = sheet3.getRow(1).getLastCellNum();
		    
	        String [][] data1 = new String[noOfRows-1][noOfColumn];	 
	        
		    for(int i = 1; i<noOfRows-1; i++)
		    {
		    	for(int j=0; j<noOfColumn;j++)
		    	{
		    		DataFormatter df = new DataFormatter();
		    		data1[i][j] = df.formatCellValue(sheet3.getRow(i).getCell(j));
			
			    }
		    }
		    System.out.println();
		    return data1;
		}
	 
	 @DataProvider(name = "LoginData3")
		public String[][] getData3() throws IOException
		{
			FileInputStream fis = new FileInputStream("C:\\Users\\Pritika.Somase\\eclipse-workspace\\webMath\\src\\test\\java\\netwin\\webMath\\data.properties");
			Properties  p = new Properties();
			p.load(fis);
		  
			File excelFile = new File("C:\\Users\\Pritika.Somase\\eclipse-workspace\\webMath\\src\\test\\java\\netwin\\webMath\\Data.xlsx");
		    System.out.println(excelFile.exists());
		    
		    FileInputStream fis1 = new FileInputStream(excelFile);
			@SuppressWarnings("resource")
			XSSFWorkbook workbook1 = new XSSFWorkbook(fis1);    
		    
	
		    XSSFSheet sheet3 = workbook1.getSheet("Sheet4");

		    int noOfRows = sheet3.getPhysicalNumberOfRows();
		    int noOfColumn = sheet3.getRow(1).getLastCellNum();
		    
	        String [][] data1 = new String[noOfRows-1][noOfColumn];	 
	        
		    for(int i = 1; i<noOfRows-1; i++)
		    {
		    	for(int j=0; j<noOfColumn;j++)
		    	{
		    		DataFormatter df = new DataFormatter();
		    		data1[i][j] = df.formatCellValue(sheet3.getRow(i).getCell(j));
			
			    }
		    }
		    System.out.println();
		    return data1;
		}
	 
	 
	 
}
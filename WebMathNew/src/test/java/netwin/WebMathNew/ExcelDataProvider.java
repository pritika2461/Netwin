package netwin.WebMathNew;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class ExcelDataProvider {

	 @DataProvider(name = "header")
		public String[][] getData1() throws IOException
		{
			FileInputStream fis = new FileInputStream("C:\\Users\\Pritika.Somase\\eclipse-workspace\\WebMathNew\\src\\test\\java\\resources\\data.properties");
			Properties  p = new Properties();
			p.load(fis);
		  
			File excelFile = new File("C:\\Users\\Pritika.Somase\\eclipse-workspace\\WebMathNew\\src\\test\\java\\resources\\data.xlsx");
		    System.out.println(excelFile.exists());
		    
		    FileInputStream fis1 = new FileInputStream(excelFile);
			@SuppressWarnings("resource")
			XSSFWorkbook workbook1 = new XSSFWorkbook(fis1);    
		    
	
		    XSSFSheet sheet1 = workbook1.getSheet("Sheet1");

		    int noOfRows = sheet1.getPhysicalNumberOfRows();
		    int noOfColumn = sheet1.getRow(1).getLastCellNum();
		    
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
	 
	 @DataProvider(name = "contact")
		public String[][] getData2() throws IOException
		{
			FileInputStream fis = new FileInputStream("C:\\Users\\Pritika.Somase\\eclipse-workspace\\WebMathNew\\src\\test\\java\\resources\\data.properties");
			Properties  p = new Properties();
			p.load(fis);
		  
			File excelFile = new File("C:\\Users\\Pritika.Somase\\eclipse-workspace\\WebMathNew\\src\\test\\java\\resources\\data.xlsx");
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
	 
	 @DataProvider(name = "vl_training")
		public String[][] getData3() throws IOException
		{
			FileInputStream fis = new FileInputStream("C:\\Users\\Pritika.Somase\\eclipse-workspace\\WebMathNew\\src\\test\\java\\resources\\data.properties");
			Properties  p = new Properties();
			p.load(fis);
		  
			File excelFile = new File("C:\\Users\\Pritika.Somase\\eclipse-workspace\\WebMathNew\\src\\test\\java\\resources\\data.xlsx");
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
	 
	 @DataProvider(name = "want_tobe_vl")
		public String[][] getData4() throws IOException
		{
			FileInputStream fis = new FileInputStream("C:\\Users\\Pritika.Somase\\eclipse-workspace\\WebMathNew\\src\\test\\java\\resources\\data.properties");
			Properties  p = new Properties();
			p.load(fis);
		  
			File excelFile = new File("C:\\Users\\Pritika.Somase\\eclipse-workspace\\WebMathNew\\src\\test\\java\\resources\\data.xlsx");
		    System.out.println(excelFile.exists());
		    
		    FileInputStream fis1 = new FileInputStream(excelFile);
			@SuppressWarnings("resource")
			XSSFWorkbook workbook1 = new XSSFWorkbook(fis1);    
		    
	
		    XSSFSheet sheet4 = workbook1.getSheet("Sheet4");

		    int noOfRows = sheet4.getPhysicalNumberOfRows();
		    int noOfColumn = sheet4.getRow(1).getLastCellNum();
		    
	        String [][] data1 = new String[noOfRows-1][noOfColumn];	 
	        
		    for(int i = 1; i<noOfRows-1; i++)
		    {
		    	for(int j=0; j<noOfColumn;j++)
		    	{
		    		DataFormatter df = new DataFormatter();
		    		data1[i][j] = df.formatCellValue(sheet4.getRow(i).getCell(j));
			
			    }
		    }
		    System.out.println();
		    return data1;
		}
	 
	 
	 @DataProvider(name = "tutor")
		public String[][] getData5() throws IOException
		{
			FileInputStream fis = new FileInputStream("C:\\Users\\Pritika.Somase\\eclipse-workspace\\WebMathNew\\src\\test\\java\\resources\\data.properties");
			Properties  p = new Properties();
			p.load(fis);
		  
			File excelFile = new File("C:\\Users\\Pritika.Somase\\eclipse-workspace\\WebMathNew\\src\\test\\java\\resources\\data.xlsx");
		    System.out.println(excelFile.exists());
		    
		    FileInputStream fis1 = new FileInputStream(excelFile);
			@SuppressWarnings("resource")
			XSSFWorkbook workbook1 = new XSSFWorkbook(fis1);    
		    
	
		    XSSFSheet sheet5 = workbook1.getSheet("Sheet5");

		    int noOfRows = sheet5.getPhysicalNumberOfRows();
		    int noOfColumn = sheet5.getRow(1).getLastCellNum();
		    
	        String [][] data1 = new String[noOfRows-1][noOfColumn];	 
	        
		    for(int i = 1; i<noOfRows-1; i++)
		    {
		    	for(int j=0; j<noOfColumn;j++)
		    	{
		    		DataFormatter df = new DataFormatter();
		    		data1[i][j] = df.formatCellValue(sheet5.getRow(i).getCell(j));
			
			    }
		    }
		    System.out.println();
		    return data1;
		}
	 
}

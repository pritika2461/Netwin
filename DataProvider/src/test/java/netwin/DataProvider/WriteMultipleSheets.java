package netwin.DataProvider;

import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.*;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteMultipleSheets {

	public static  void main (String[] args)  throws IOException
	{
		
		XSSFWorkbook wb = new XSSFWorkbook();
		
		XSSFWorkbook wb1 = new XSSFWorkbook();
		
		XSSFSheet sheet = wb.createSheet("Emp Sheet");
		XSSFSheet sheet1 = wb.createSheet("Emp Sheet 1");
		
		
		Object empdata[][] = {
				{"Emp_id", "Name", "Job"},
				{"101","Pritika", "Engineer"},
				{"102","Priti", "Engineer"},
				{"103","Priya", "Engineer"},
				{"104","Priyal", "Engineer"},
				{"104","Supriya", "Engineer"},
		}; 
		
		Object empdata1[][] = {
				{"Emp_id", "Name", "Job"},
				{"101","Abhi", "Engineer"},
				{"102","Arya", "Engineer"},
				{"103","Anu", "Engineer"},
				{"103","Anu", "Engineer"},
				{"103","Aninash", "Engineer"}
		}; 
		
      	int rows = empdata.length;
      	int cols = empdata[0].length;
      	
      	int rows11 = empdata1.length;
      	int cols12 = empdata1[0].length;
      	
      	System.out.println(rows);
      	System.out.println(cols);
      	
      	
      	System.out.println(rows11);
      	System.out.println(cols12);
      	
      	for (int r=0; r<rows11; r++)
      	{
      		XSSFRow row1 = sheet.createRow(r);
      		
      		for(int c= 0; c<cols; c++)
      		{
      			XSSFCell cell = row1.createCell(c);
      			Object value = empdata[r][c];
      			
      			if(value instanceof String)
      				cell.setCellValue((String) value);
      			else if (value instanceof String)
      				cell.setCellValue((Integer) value);
      			else if(value instanceof String)
      				cell.setCellValue((Boolean) value);		
      		}
      	}
      	
      	
    	for (int r=0; r<rows; r++)
      	{
      		XSSFRow row1 = sheet1.createRow(r);
      		
      		for(int c= 0; c<cols; c++)
      		{
      			XSSFCell cell = row1.createCell(c);
      			Object value = empdata1[r][c];
      			
      			if(value instanceof String)
      				cell.setCellValue((String) value);
      			else if (value instanceof String)
      				cell.setCellValue((Integer) value);
      			else if(value instanceof String)
      				cell.setCellValue((Boolean) value);		
      		}
      	}
      	
      	
      	String filePath = ".\\employee.xlsx";
      	FileOutputStream outstream = new FileOutputStream(filePath);
      	wb.write(outstream);
      
      	outstream.close();
      	System.out.print("Employee file written sucessfully....");
      
}
}

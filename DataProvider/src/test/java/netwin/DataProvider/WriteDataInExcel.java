package netwin.DataProvider;

import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.*;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteDataInExcel {

	public static  void main (String[] args)  throws IOException
	{
		
		XSSFWorkbook wb = new XSSFWorkbook();
		XSSFSheet sheet = wb.createSheet("Emp Sheet");
		
		Object empdata[][] = {
				{"Emp_id", "Name", "Job"},
				{"101","Pritika", "Engineer"},
				{"102","Priti", "Engineer"},
				{"103","Priya", "Engineer"},
				{"104","Priyal", "Engineer"},
		}; 
		
//      	int rows = empdata.length;
//      	int cols = empdata[0].length;
//      	
//      	for (int r=0; r<rows; r++)
//      	{
//      		XSSFRow row1 = sheet.createRow(r);
//      		
//      		for(int c= 0; c<cols; c++)
//      		{
//      			XSSFCell cell = row1.createCell(c);
//      			Object value = empdata[r][c];
//      			
//      			if(value instanceof String)
//      				cell.setCellValue((String) value);
//      			else if (value instanceof String)
//      				cell.setCellValue((Integer) value);
//      			else if(value instanceof String)
//      				cell.setCellValue((Boolean) value);		
//      		}
//      	}
//      	String filePath = ".\\employee.xlsx";
//      	FileOutputStream outstream = new FileOutputStream(filePath);
//      	wb.write(outstream);
//      	
//      
//      	outstream.close();
//      	System.out.print("Employee file written sucessfully....");
//      	
//	}
		
		
		// using for each loop 
		
		int rowCount =0;
		
		for(Object emp[]:empdata)
		{
			XSSFRow row = sheet.createRow(rowCount++);
			int columnCount = 0;
	
			for(Object value:emp)
			{
				XSSFCell cell = row.createCell(columnCount++);
						
						if(value instanceof String)
							cell.setCellValue((String) value);
				  
				if(value instanceof Integer)
					cell.setCellValue((String) value);
			}
		}
		
		String filePath = ".\\employee2.xlsx";
	  	FileOutputStream outstream = new FileOutputStream(filePath);
	  	wb.write(outstream);
	  	
	  
	  	outstream.close();
	  	System.out.print("Employee file written sucessfully....");
	  	
		
}
}

package netwin.DataProvider;

import java.io.File;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData11 {

	public static void main(String[] args) throws IOException 
	{
	    File src = new File("C:\\Users\\Pritika.Somase\\eclipse-workspace\\DataProvider\\employee.xlsx");
		FileInputStream fis = new FileInputStream(src);
		
		// create workbook
		XSSFWorkbook xsf = new XSSFWorkbook(fis);
		
		// create sheet
		XSSFSheet sheet2 = xsf.getSheetAt(0);
		XSSFSheet sheet1 = xsf.getSheetAt(1);

		// get the number of rows and column of sheet 
		int rows = sheet2.getLastRowNum();
		int cols = sheet2.getRow(1).getLastCellNum();
		
		
		int rows1 = sheet1.getLastRowNum();
		int cols1 = sheet1.getRow(1).getLastCellNum();
		
		
		System.out.println(rows);
		System.out.println(cols);
		
		System.out.println(rows1);
		System.out.println(cols1);
		
		System.out.println("Sheet 1");
		
		for(int r=0; r<=rows; r++)
		{
			XSSFRow row = sheet2.getRow(r);
			
			for(int c=0; c<cols;c++)
			{
				// get the cell
				XSSFCell cell = row.getCell(c);
				cell.getCellType();
				
				switch(cell.getCellType())
				{
				
				// read & print the data
				case STRING: System.out.print(cell.getStringCellValue());break;
				case NUMERIC: System.out.print(cell.getNumericCellValue());break;
				case BOOLEAN: System.out.print(cell.getBooleanCellValue());break;
				default:break;
					
				}
				System.out.print(" | ");
			}
			System.out.println(" ");
		}
		
		
		System.out.println("  ");
		System.out.println("Sheet 2");
		for(int r=0; r<=rows1; r++)
		{
			XSSFRow row = sheet1.getRow(r);
			
			for(int c=0; c<cols1;c++)
			{
				XSSFCell cell = row.getCell(c);
				cell.getCellType();
				
				switch(cell.getCellType())
				{
				case STRING: System.out.print(cell.getStringCellValue());break;
				case NUMERIC: System.out.print(cell.getNumericCellValue());break;
				case BOOLEAN: System.out.print(cell.getBooleanCellValue());break;
				default:break;
					
				}
				System.out.print(" | ");
			}
			System.out.println(" ");
		}

	}

}

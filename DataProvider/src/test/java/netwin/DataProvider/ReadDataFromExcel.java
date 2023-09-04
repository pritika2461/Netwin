package netwin.DataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadDataFromExcel {
	
	@Test
	public void dataReadTest() throws IOException
	{
		File src = new File("C:\\Users\\Pritika.Somase\\eclipse-workspace\\testngex\\src\\main\\java\\resources\\excelFile.xlsx");
		
		FileInputStream fis = new FileInputStream(src);
		
		XSSFWorkbook xsf = new XSSFWorkbook(fis);
		
		XSSFSheet sheet = xsf.getSheetAt(0);
		
		String entry1 = sheet.getRow(1).getCell(1).getStringCellValue();
		String entry2 = sheet.getRow(2).getCell(1).getStringCellValue();
		String entry3 = sheet.getRow(3).getCell(1).getStringCellValue();
		String entry4 = sheet.getRow(4).getCell(1).getStringCellValue();
		String entry5 = sheet.getRow(5).getCell(1).getStringCellValue();
	
		System.out.println("The data in the sheet is " +entry1);
		System.out.println("The data in the sheet is " +entry2);
		System.out.println("The data in the sheet is " +entry3);
		System.out.println("The data in the sheet is " +entry4);
		System.out.println("The data in the sheet is " +entry5);
		
		xsf.close();
	}

}

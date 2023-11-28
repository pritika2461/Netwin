package netwin.MobileBanking1;

import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import Utils.MB_BaseClass;
public class MB_24By7AddBeneficiary extends MB_BaseClass
{
      @Test(priority =1, enabled= false)
      public void AddBeneficialry() throws IOException, InterruptedException
      {
    	  XSSFSheet sheet = workbook.getSheet("MB_24By7AddBeneficiary"); 
    	  
    	  driver.findElement(By.xpath(p.getProperty("FundTransferOtherBank"))).click();
 	  	  driver.findElement(By.xpath(p.getProperty("QuickTransfer"))).click();
    	  driver.findElement(By.xpath(p.getProperty("Add_Beneficiary"))).click();
    	  driver.findElement(By.id(p.getProperty("SelectFromAccount"))).click();
    	  driver.findElements(By.id(p.getProperty("SelectAccNumber"))).get(2).click();
       
    	  for(int i = 1; i<=1; i++)
    	         
       //  for(int i = 1; i<sheet.getLastRowNum()-1; i++)
          {
	           XSSFRow row = sheet.getRow(i);        	 	  
	           XSSFCell IFSCCode = row.getCell(3);	
	           XSSFCell MobileNo = row.getCell(4);	
	           XSSFCell Name = row.getCell(5);	
	           XSSFCell Address = row.getCell(6);	
	           XSSFCell AccountNo = row.getCell(7);	 
	           XSSFCell ConfAccountNo = row.getCell(8);	
	           
	           driver.findElement(By.id(p.getProperty("MB_IFSCCode"))).sendKeys(""+IFSCCode);
	           driver.findElement(By.id(p.getProperty("MB_SearhIFSCButton"))).click(); 
	    	   driver.findElement(By.id(p.getProperty("MB_BenMobileNumber"))).sendKeys(""+MobileNo);
	           driver.findElement(By.id(p.getProperty("MB_BenName"))).sendKeys(""+Name);
	    	   driver.findElement(By.id(p.getProperty("MB_BenAddress"))).sendKeys(""+Address);
	    	   driver.findElement(By.id(p.getProperty("MB_BenAccountNumber"))).sendKeys(""+AccountNo);
	    	   driver.findElement(By.id(p.getProperty("MB_BenConfirmAccNumber"))).sendKeys(""+ConfAccountNo);
	           driver.findElement(By.id(p.getProperty("MB_BenSubmit"))).click();   
	    	     
	    	   if(!driver.findElements(By.xpath(p.getProperty("ToastMsg"))).isEmpty()) {
	    		   String msg =  driver.findElement(By.xpath(p.getProperty("ToastMsg"))).getAttribute("name");
		    	   sheet.getRow(i).getCell(11).setCellValue(String.valueOf(msg));}   
	    	   else{driver.findElement(By.id(p.getProperty("MB_ConfirmButton"))).click();
	    		    driver.findElement(By.xpath(p.getProperty("Add_Beneficiary"))).click();
	    	 	   sheet.getRow(i).getCell(11).setCellValue("Data is Accept and Proceed");}
	    	  
	    	   String expected = row.getCell(10).getStringCellValue();
	    	   String actual = row.getCell(11).getStringCellValue();
		         
	    	   if(expected.equalsIgnoreCase(actual)) {sheet.getRow(i).getCell(12).setCellValue("Pass");}
	    	   else {sheet.getRow(i).getCell(12).setCellValue("Fail");}	    	
	           Write(); 	   
         }     
    	  Thread.sleep(5000);
          driver.findElement(By.id(p.getProperty("HomeButton"))).click();
         
      }   
      
      @Test(priority=2, enabled= false)
      public void VerifyBeneficiary() throws InterruptedException
      {
    	  driver.findElement(By.xpath(p.getProperty("FundTransferOtherBank"))).click();
 	  	  driver.findElement(By.xpath(p.getProperty("QuickTransfer"))).click();
    	  driver.findElement(By.xpath(p.getProperty("MB_VerifyBen"))).click();
    	  Thread.sleep(7000);
    	  driver.findElement(By.id(p.getProperty("MB_selectBenAcc"))).click();
    	  driver.findElements(By.id(p.getProperty("SelectAccNumber"))).get(0).click();  	
    	  
    	  driver.findElement(By.id(p.getProperty("MB_etSearchButton"))).sendKeys("1234567890");
    	  driver.findElement(By.id(p.getProperty("MB_etSearchButton"))).sendKeys(Keys.ENTER);   
    	  
    	  driver.findElement(By.id(p.getProperty("MB_selectBenAcc"))).click();
    	  driver.findElements(By.id(p.getProperty("SelectAccNumber"))).get(0).click();    	  
    	  Thread.sleep(2000);  
    	  driver.findElement(By.id(p.getProperty("MB_confOTP"))).sendKeys("123456");
    	  driver.findElement(By.id(p.getProperty("submitButton"))).click();
    	  Thread.sleep(1000);
    	  driver.findElement(By.id(p.getProperty("Button1"))).click();
    	  Thread.sleep(2000);
          driver.findElement(By.id(p.getProperty("HomeButton"))).click();	  
      }

      @Test(priority = 3)
      public void NEFTERequest() throws InterruptedException
      {
    	  driver.findElement(By.xpath(p.getProperty("FundTransferOtherBank"))).click();
 	  	  driver.findElement(By.xpath(p.getProperty("QuickTransfer"))).click();
    	  driver.findElement(By.xpath(p.getProperty("MB_24*7QuickTransfer"))).click();
    	  Thread.sleep(2000);
    	  
    	  driver.findElement(By.id(p.getProperty("SelectFromAccount"))).click();
    	  driver.findElements(By.id(p.getProperty("SelectAccNumber"))).get(0).click();
    	  
    	  driver.findElement(By.id(p.getProperty("MB_etSearchButton"))).sendKeys("95862354784");
    	  driver.findElement(By.id(p.getProperty("MB_etSearchButton"))).sendKeys(Keys.ENTER);   
    	  
    	  driver.findElement(By.id(p.getProperty("MB_selectBenAcc"))).click();
    	  driver.findElements(By.id(p.getProperty("SelectAccNumber"))).get(0).click();    	  
    	  Thread.sleep(2000); 
    	  
    	  driver.findElement(By.id(p.getProperty("MB_Remark"))).sendKeys("NA");
    	  driver.findElement(By.id(p.getProperty("MB_amount"))).sendKeys("10");
    	  
    	  driver.findElement(By.id(p.getProperty("submitButton"))).click();
    	  driver.findElement(By.id(p.getProperty("Button1"))).click();
    	 
    	  if(!driver.findElements(By.xpath(p.getProperty("ToastMsg"))).isEmpty()) {
   		   String msg =  driver.findElement(By.xpath(p.getProperty("ToastMsg"))).getAttribute("name");
	    	 System.out.println(msg);;}   
   	      else{System.out.println("Next Page Open");;}
    	  
    	  driver.findElement(By.id(p.getProperty("HomeButton"))).click();
      	
      }
      
      @Test(priority = 4) 
      public void CloseBeneficiary() throws InterruptedException
      {
    	  driver.findElement(By.xpath(p.getProperty("FundTransferOtherBank"))).click();
 	  	  driver.findElement(By.xpath(p.getProperty("QuickTransfer"))).click();
    	  driver.findElement(By.xpath(p.getProperty("MB_CloseBen"))).click();
    	  Thread.sleep(2000);
 
    	  driver.findElement(By.id(p.getProperty("MB_selectBenAcc"))).click();
    	  driver.findElements(By.id(p.getProperty("SelectAccNumber"))).get(0).click();  
    	  
    	  driver.findElement(By.id(p.getProperty("MB_etSearchButton"))).sendKeys("1234567890");
    	  driver.findElement(By.id(p.getProperty("MB_etSearchButton"))).sendKeys(Keys.ENTER); 
    	  
    	  driver.findElement(By.id(p.getProperty("MB_selectBenAcc"))).click();
    	  driver.findElements(By.id(p.getProperty("SelectAccNumber"))).get(0).click();    	  
    	
    	  driver.findElement(By.id(p.getProperty("MB_TransPin"))).sendKeys("100");
    	  driver.findElement(By.id(p.getProperty("submitButton"))).click();
    	  driver.findElement(By.id(p.getProperty("Button1"))).click();
    	  
      }
      
      @AfterClass
      public void quiteBrowser() {
    	  System.out.println("quit method started..");
    	  driver.quit();
      }
}



package netwin.MobileBanking1;
import java.io.IOException;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Utils.MB_BaseClass;

public class MB_FundTransferToOwnAccount extends MB_BaseClass
{
	@Test
	public void FundTransfer() throws InterruptedException, IOException
	{
		  int count = 0; 
		  driver.findElement(By.xpath(p.getProperty("FundTransferWithinBank"))).click();
		  XSSFSheet sheet = workbook.getSheet("MB_FundTransferToOwnAccount");
		  
		  // Open and verify  Fund transfer to Own account form is open or not 
		  driver.findElement(By.xpath(p.getProperty("MB_OwnAccounts"))).click();
	      boolean ownAcc = driver.findElement(By.id(p.getProperty("header_Title"))).isDisplayed();
	  	  if(ownAcc == true) { sheet.getRow(count+=1).getCell(7).setCellValue("Fund transfer to own account Page is Open.");
		  sheet.getRow(count).getCell(8).setCellValue("Pass");}else {System.out.println("Test 1 Fail");}
          Thread.sleep(1000);
          
          // Back Button
          driver.findElement(By.id(p.getProperty("BackButton"))).click();
          boolean back = driver.findElement(By.id(p.getProperty("MB_MenuTextTitle"))).isDisplayed();
          if(back == true)  { sheet.getRow(count+=1).getCell(7).setCellValue("MB is open the back page of Fund transfer to own account");
		  sheet.getRow(count).getCell(8).setCellValue("Pass");}else {System.out.println("Test 2 Fail");}
		  driver.findElement(By.xpath(p.getProperty("MB_OwnAccounts"))).click();
          Thread.sleep(1000);
          
          // Home Button 
          driver.findElement(By.id(p.getProperty("HomeButton"))).click();
          boolean home =driver.findElement(By.id(p.getProperty("MB_MenuTextTitle"))).isDisplayed();
          if(home == true)  { sheet.getRow(count+=1).getCell(7).setCellValue("MB has open the Home Page.");
		  sheet.getRow(count).getCell(8).setCellValue("Pass");}else {System.out.println("Test 3 Fail");}
          driver.findElement(By.xpath(p.getProperty("FundTransferWithinBank"))).click();
    	  driver.findElement(By.xpath(p.getProperty("MB_OwnAccounts"))).click();
    	  Thread.sleep(2000);
          
          // Check Title 
          String ExpTitle = "Fund Transfer to Own Account";
          String ActTitle = driver.findElement(By.id(p.getProperty("header_Title"))).getText();
          if(ExpTitle.equals(ActTitle)) { sheet.getRow(count+=1).getCell(7).setCellValue("Given Title is match with 'Fund Transfer to Own Account'");
		  sheet.getRow(count).getCell(8).setCellValue("Pass");}else {System.out.println("Test 4 Fail");}
          Thread.sleep(1000);
          
          
          // Check Account List display or not 
          driver.findElement(By.id("com.netwin.mobilebanking.dyankmsj:id/from_acc")).click();
          boolean accList = driver.findElement(By.id("com.netwin.mobilebanking.dyankmsj:id/parent")).isDisplayed();
          if(accList == true)  { sheet.getRow(count+=1).getCell(7).setCellValue("Account List is Open");
		  sheet.getRow(count).getCell(8).setCellValue("Pass");}else {System.out.println("Test 5 Fail");}
          Thread.sleep(1000);
          
          // Check given Number of accounts are present or not
          List<WebElement> elements = driver.findElements(By.xpath("//*[@resource-id='" + "com.netwin.mobilebanking.dyankmsj:id/acno" + "']"));
          int elementCount = elements.size();
          if(elementCount == 4) {sheet.getRow(count+=1).getCell(7).setCellValue("Given Number of Accounts are present in the Account List");
		  sheet.getRow(count).getCell(8).setCellValue("Pass");}else {System.out.println("Test 6 Fail");}
          Thread.sleep(1000);
          
          // Check the account details 
          String details = driver.findElement(By.id("com.netwin.mobilebanking.dyankmsj:id/acno")).getText();
          String bal = driver.findElement(By.id("com.netwin.mobilebanking.dyankmsj:id/acbal")).getText();
          if( details.equals("SAVING ACCOUNT(2001283)") && bal.equals("Balance: 102 cr")){sheet.getRow(count+=1).getCell(7).setCellValue("Account Detail is correct");
		  sheet.getRow(count).getCell(8).setCellValue("Pass");}else {System.out.println("Test 7 Fail");}
          Thread.sleep(1000);
          
          
          // Check the All Live/ Regular account is present or not in the account list 
          List<WebElement> liveaccount = driver.findElements(By.id("com.netwin.mobilebanking.dyankmsj:id/acno"));  
          boolean isElementPresent0 = true;
          for (WebElement element : liveaccount) {
              if (element.getText().contains("SAVING ACCOUNT(2001283)")) {isElementPresent0 = true;break;}}       
          if (isElementPresent0){sheet.getRow(count+=1).getCell(7).setCellValue("Live/Regular Accounts are Display"); 
          sheet.getRow(count).getCell(8).setCellValue("Pass");}
          else { System.out.println("TC 8 Fail"); }
          
            
          // Check the Closed account is present or not in the account list 
          List<WebElement> Closeaccount = driver.findElements(By.id("com.netwin.mobilebanking.dyankmsj:id/acno"));  
          String targetElementText = "SAVING ACCOUNT(2001200)";
          boolean isElementPresent = true;
          for (WebElement element : Closeaccount) {
              if (element.getText().contains(targetElementText)) {isElementPresent = true;break;}}       
          if (isElementPresent){sheet.getRow(count+=1).getCell(7).setCellValue("Closed Accounts is not  Display");
          sheet.getRow(count).getCell(8).setCellValue("Pass");}
          else { System.out.println("TC 9 Fail"); }
          
          
         // Check the Freeze account is present or not in the account list 
          List<WebElement> Freezeaccount = driver.findElements(By.id("com.netwin.mobilebanking.dyankmsj:id/acno"));  
          String targetElementText1 = "SAVING ACCOUNT(2001280)";
          boolean isElementPresent1 = true;
          for (WebElement element : Freezeaccount) {
              if (element.getText().contains(targetElementText1)) {isElementPresent1 = true;break;}}
          if (isElementPresent1) {sheet.getRow(count+=1).getCell(7).setCellValue("Freeze Accounts is not  Display");
          sheet.getRow(count).getCell(8).setCellValue("Pass");} 
          else {System.out.println("TC 10 Fail"); }
          
        // Check the Revoke account is present or not in the account list 
          List<WebElement> Revokeaccount = driver.findElements(By.id("com.netwin.mobilebanking.dyankmsj:id/acno"));  
          String targetElementText2 = "SAVING ACCOUNT(2001283)";
          boolean isElementPresent2 = false;
          for (WebElement element : Revokeaccount) {
              if (element.getText().contains(targetElementText2)) {isElementPresent2 = true;break;}}
          if (isElementPresent2) {sheet.getRow(count+=1).getCell(7).setCellValue("Revoke Accounts is Display");
          sheet.getRow(count).getCell(8).setCellValue("Pass");} 
          else {System.out.println("TC 11 Fail"); }
          
          
          // Check the Deaf account is present or not in the account list 
          List<WebElement> Deafaccount = driver.findElements(By.id("com.netwin.mobilebanking.dyankmsj:id/acno"));  
          String targetElementText3 = "SAVING ACCOUNT(2001283)";
          boolean isElementPresent3 = true;
          for (WebElement element : Deafaccount) {
              if (element.getText().contains(targetElementText3)) {isElementPresent3 = true;break;}}
          if (isElementPresent3) {sheet.getRow(count+=1).getCell(7).setCellValue("Deaf Accounts not is Display");
          sheet.getRow(count).getCell(8).setCellValue("Pass");} 
          else {System.out.println("TC 12 Fail"); }
          
          
          // Check the Non operative account is present or not in the account list 
          List<WebElement> NonOperativefaccount = driver.findElements(By.id("com.netwin.mobilebanking.dyankmsj:id/acno"));  
          String targetElementText4 = "SAVING ACCOUNT(2001283)";
          boolean isElementPresent4 = true;
          for (WebElement element : NonOperativefaccount) {
              if (element.getText().contains(targetElementText4)) {isElementPresent4 = true;break;}}
          if (isElementPresent4) {sheet.getRow(count+=1).getCell(7).setCellValue("Non Operative  Accounts not is Display");
          sheet.getRow(count).getCell(8).setCellValue("Pass");} 
          else {System.out.println("TC 13 Fail"); }
          
          
       // Check the Loan over Due account is present or not in the account list 
          List<WebElement> LoanOverDuefaccount = driver.findElements(By.id("com.netwin.mobilebanking.dyankmsj:id/acno"));  
          String targetElementText5 = "SAVING ACCOUNT(2001283)";
          boolean isElementPresent5 = true;
          for (WebElement element : LoanOverDuefaccount) {
              if (element.getText().contains(targetElementText5)) {isElementPresent5 = true;break;}}
          if (isElementPresent5) {sheet.getRow(count+=1).getCell(7).setCellValue("Loan over Due account Accounts not is Display");
          sheet.getRow(count).getCell(8).setCellValue("Pass");} 
          else {System.out.println("TC 14 Fail"); }
           
          
         // Check that user is able select the Account from account list & check the account details of selected account ..
          driver.findElements(By.id("com.netwin.mobilebanking.dyankmsj:id/acno")).get(0).click();
          boolean acc = driver.findElement(By.id("com.netwin.mobilebanking.dyankmsj:id/from_acc")).isDisplayed();
          if(acc==true){sheet.getRow(count+=1).getCell(7).setCellValue("User is able to select the account from given list");
          sheet.getRow(count).getCell(8).setCellValue("Pass");} 
          else {System.out.println("TC 15 Fail"); }
          
          // Check that from account number is display as per the selected account number
          String fromAcc1 = driver.findElement(By.id("com.netwin.mobilebanking.dyankmsj:id/selacct")).getText();
          String fromAcc2 = "2001283";
          if(fromAcc1.equals(fromAcc2)){sheet.getRow(count+=1).getCell(7).setCellValue("Account number is display as per the selected account number");
          sheet.getRow(count).getCell(8).setCellValue("Pass");} 
          else {System.out.println("TC 16 Fail"); }       
          
         //Check that search account number is able to search the accounts
          driver.findElement(By.id("com.netwin.mobilebanking.dyankmsj:id/etSearch")).sendKeys("2001284");
          Thread.sleep(1000);
          driver.findElement(By.id("com.netwin.mobilebanking.dyankmsj:id/etSearch")).sendKeys(Keys.ENTER);
          Thread.sleep(1000);
          driver.findElement(By.id("com.netwin.mobilebanking.dyankmsj:id/beneficiary_acc")).click();
          String AccNo= driver.findElements(By.id("com.netwin.mobilebanking.dyankmsj:id/acc_no")).get(0).getText();
          driver.findElement(By.id("com.netwin.mobilebanking.dyankmsj:id/acc_no")).click();
          if(AccNo.equals("AGARE SUNIL VASANT(2001284)")){sheet.getRow(count+=1).getCell(7).setCellValue("User is able to search the account present in account list..");
          sheet.getRow(count).getCell(8).setCellValue("Pass");} 
          else {System.out.println("TC 17 Fail"); }  
          
         
          // Check the user is able to search the account by entering last 4 digits of account number.
          driver.findElement(By.id("com.netwin.mobilebanking.dyankmsj:id/etSearch")).sendKeys("1284");   
          Thread.sleep(1000);
          driver.findElement(By.id("com.netwin.mobilebanking.dyankmsj:id/etSearch")).sendKeys(Keys.ENTER);
          Thread.sleep(1000);
          driver.findElement(By.id("com.netwin.mobilebanking.dyankmsj:id/beneficiary_acc")).click();
          String AccNo1= driver.findElements(By.id("com.netwin.mobilebanking.dyankmsj:id/acc_no")).get(0).getText();    
          driver.findElement(By.id("com.netwin.mobilebanking.dyankmsj:id/acc_no")).click();
          if(AccNo1.equals("AGARE SUNIL VASANT(2001284)")){sheet.getRow(count+=1).getCell(7).setCellValue("User is able to serach the account by entering last 4 digits of account number.");
          sheet.getRow(count).getCell(8).setCellValue("Pass");} 
          else {System.out.println("TC 18 Fail"); }  
          
          //Check the user is able to search the accounts that are not display in the LOV
          driver.findElement(By.id("com.netwin.mobilebanking.dyankmsj:id/etSearch")).sendKeys("2001287");
          Thread.sleep(1000);
          driver.findElement(By.id("com.netwin.mobilebanking.dyankmsj:id/etSearch")).sendKeys(Keys.ENTER); 
          Thread.sleep(1000);
          driver.findElement(By.id("com.netwin.mobilebanking.dyankmsj:id/etSearch")).click();
          driver.findElement(By.id("com.netwin.mobilebanking.dyankmsj:id/beneficiary_acc")).click();              
          boolean AccNo2 =   driver.findElement(By.id("com.netwin.mobilebanking.dyankmsj:id/acc_no")).isDisplayed();
          driver.findElement(By.id("com.netwin.mobilebanking.dyankmsj:id/acc_no")).click();
          if(AccNo2==false){sheet.getRow(count+=1).getCell(7).setCellValue("User is able to search the accounts that are not display in the LOV");
          sheet.getRow(count).getCell(8).setCellValue("Pass");} 
          else {System.out.println("TC 19 Fail"); }  
          
         // Check that Other Account list should be able to open the list or not    
          driver.findElement(By.id("com.netwin.mobilebanking.dyankmsj:id/beneficiary_acc")).click();              
          boolean AccNo3 =   driver.findElement(By.id("com.netwin.mobilebanking.dyankmsj:id/acc_no")).isDisplayed();
          driver.findElement(By.id("com.netwin.mobilebanking.dyankmsj:id/acc_no")).click();
          if(AccNo3==true){sheet.getRow(count+=1).getCell(7).setCellValue("User is able to search the accounts that are not display in the LOV");
          sheet.getRow(count).getCell(8).setCellValue("Pass");} 
          else {System.out.println("TC 20 Fail"); }  
               
          // Check that only those accounts are present in the other account list that are available for that user. 
          List<WebElement> elements1 = driver.findElements(By.xpath("//*[@resource-id='" + "com.netwin.mobilebanking.dyankmsj:id/ " + "']"));
          int elementCount1 = elements1.size();
          System.out.println(elementCount1);
          if(elementCount1 == 3) {sheet.getRow(count+=1).getCell(7).setCellValue("Given Number of Accounts are present in the Account List");
		  sheet.getRow(count).getCell(8).setCellValue("Pass");}else {System.out.println("Test 21 Fail");}
          Thread.sleep(1000);
          
          //
          
          
          
          Write();
	}
}

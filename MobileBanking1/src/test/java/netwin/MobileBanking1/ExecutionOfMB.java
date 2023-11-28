package netwin.MobileBanking1;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import Utils.MB_BaseClass;

public class ExecutionOfMB extends MB_BaseClass
{    
      @Test(priority =1, enabled= false)
      public void MyAccountOptions() throws InterruptedException
      {
    	  driver.findElement(By.xpath(p.getProperty("MyAccountsOptions"))).click();
    	  driver.findElement(By.xpath(p.getProperty("MyAccounts"))).click();
    	  
    	  // Back Button
    	  driver.findElement(By.id(p.getProperty("BackButton"))).click();
    	  driver.findElement(By.xpath(p.getProperty("MyAccounts"))).click();
    	  
    	  // Home Button
    	  driver.findElement(By.id(p.getProperty("HomeButton"))).click();
    	  driver.findElement(By.xpath(p.getProperty("MyAccountsOptions"))).click();
    	  driver.findElement(By.xpath(p.getProperty("MyAccounts"))).click();
    	 
    	  // Select Account
    	  Thread.sleep(1000);
    	  driver.findElement(By.xpath(p.getProperty("MB_SavingAccounts"))).click();
    	  driver.findElements(By.id(p.getProperty("SelectAccNumber"))).get(2).click();
    	  driver.findElement(By.xpath(p.getProperty("backButton"))).click();
    	  driver.findElement(By.id(p.getProperty("BackButton"))).click();
    	  driver.findElement(By.id(p.getProperty("BackButton"))).click();
    	  
    	  // Mini Statements
    	  driver.findElement(By.xpath(p.getProperty("MiniStatement"))).click();
    	  driver.findElements(By.id(p.getProperty("MB_AcNo"))).get(2).click();
    	    
    	  driver.findElement(By.id(p.getProperty("BackButton"))).click();
    	  Thread.sleep(1000);
    	  driver.findElement(By.id(p.getProperty("BackButton"))).click();
    	 
    	  // Download Statements
    	  driver.findElement(By.xpath(p.getProperty("DownloadStatement"))).click();
    	  driver.findElement(By.id(p.getProperty("MB_selectAccNo"))).click();
    	  driver.findElements(By.id(p.getProperty("SelectAccNumber"))).get(1).click();
    	  
    	  driver.findElement(By.id(p.getProperty("submitButton"))).click();
    	  driver.findElement(By.id(p.getProperty("Button1"))).click();	  
    	  driver.findElement(By.id(p.getProperty("HomeButton"))).click();      	  
    	  Thread.sleep(5000);
      }
      
      @Test(priority=2)
      public void FundTransferWithinBank() throws InterruptedException
      {
    	  Thread.sleep(1000);
    	  driver.findElement(By.xpath(p.getProperty("FundTransferWithinBank"))).click();
    	  driver.findElement(By.xpath(p.getProperty("MB_OwnAccounts"))).click();
    	  
    	  //Fund Transfer to Own Account
    	  driver.findElement(By.id(p.getProperty("SelectFromAccount"))).click();
    	  driver.findElements(By.id(p.getProperty("MB_AcNo"))).get(1).click();
    	 // driver.findElement(By.id(p.getProperty("MB_etSearchButton")).sendKeys("SBIN0001234"+Keys.ENTER);
    	  Thread.sleep(1000);
    	  driver.findElement(By.id(p.getProperty("SelectFromAccount"))).click();
    	  driver.findElements(By.id(p.getProperty("MB_AcNo"))).get(1).click();
    	  Thread.sleep(1000);
    	  driver.findElement(By.id(p.getProperty("MB_Remark"))).sendKeys("Not Applicable");
    	  driver.findElement(By.id(p.getProperty("MB_Amount"))).sendKeys("4");
    	 
    	  driver.findElement(By.id(p.getProperty("submitButton"))).click();
    	  Thread.sleep(1000);
    	  driver.findElement(By.id(	p.getProperty("Button2"))).click();
    	  //Confirm Fund transfer to own accounts
    
//     	  driver.findElement(By.id(p.getProperty("MB_OTP"))).sendKeys("1234");
//    	  driver.findElement(By.id(p.getProperty("MB_TransactionPin"))).sendKeys("100");
//    	  Thread.sleep(1000);
//    	 // driver.findElement(By.id(p.getProperty("MB_ConfirmButton"))).click();
//    	  driver.findElement(By.id("HomeButton")).click();
      // Does not execute this code because of it will showing the duplicate entry.
    	  
    	  //Fund Transfer to Other accounts
      	  driver.findElement(By.xpath(p.getProperty("FundTransferWithinBank"))).click();
    	  driver.findElement(By.xpath(p.getProperty("MB_OtherAccounts"))).click();
    	  
    	   // Add Beneficiary
    	  driver.findElement(By.xpath(p.getProperty("MB_AddFTBeneficiary"))).click();
    	  
    	  driver.findElement(By.id(p.getProperty("SelectFromAccount"))).click();
    	  driver.findElements(By.id(p.getProperty("SelectAccNumber"))).get(1).click();
    	   
    	  driver.findElement(By.id(p.getProperty("MB_BenAccType"))).click();
    	  driver.findElements(By.id(p.getProperty("SelectAccNumber"))).get(1).click();
    	  
    	  driver.findElement(By.id(p.getProperty("MB_BenAccNumber"))).sendKeys("1234567891");  
    	  driver.findElement(By.id(p.getProperty("MB_ConBenAccNumber"))).sendKeys("1234567891");
    	  driver.findElement(By.id(p.getProperty("MB_BenMobileNumber"))).sendKeys("9586324581");
          driver.findElement(By.id(p.getProperty("MB_BenLmtAmt"))).sendKeys("100");
          driver.findElement(By.id(p.getProperty("RechargeButton"))).click();
      
          driver.findElement(By.id(p.getProperty("Button1"))).click();
          Thread.sleep(5000);
          driver.findElement(By.id(p.getProperty("BackButton"))).click();
          
          // Verify Beneficiary
          driver.findElement(By.xpath(p.getProperty("MB_VarifyFTBen"))).click();
    	  driver.findElement(By.id(p.getProperty("SelectFromAccount"))).click();
    	  driver.findElements(By.id(p.getProperty("SelectAccNumber"))).get(1).click();
    	 
//    	  driver.findElement(By.id(p.getProperty("MB_etSearchButton"))).sendKeys("95862354784");
//    	  driver.findElement(By.id(p.getProperty("MB_etSearchButton"))).sendKeys(Keys.ENTER);
     	  
//    	  Thread.sleep(100);
//     	  driver.findElement(By.id(p.getProperty("submitButton"))).click();
     	  driver.findElement(By.id(p.getProperty("BackButon"))).click();
     	  driver.findElement(By.id(p.getProperty("BackButon"))).click();
     	  driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"Home\"]/android.widget.ImageView")).click();  
     	  Thread.sleep(1000);
      }
     
      @Test(priority = 3, enabled = false)
      public void FundTransferOtherBank() throws InterruptedException
      {
    	  driver.findElement(By.xpath(p.getProperty("FundTransferOtherBank"))).click();
    	  driver.findElement(By.xpath(p.getProperty("QuickTransfer"))).click();
    	  driver.findElement(By.xpath(p.getProperty("Add_Beneficiary"))).click();
    	  
    	   // Add Beneficiary
    	  driver.findElement(By.id(p.getProperty("SelectFromAccount"))).click();
    	  driver.findElements(By.id(p.getProperty("SelectAccNumber"))).get(1).click();
    	  
    	  driver.findElement(By.id(p.getProperty("MB_IFSCCode"))).sendKeys("SBIN0001234");
          driver.findElement(By.id(p.getProperty("MB_SearhIFSCButton"))).click(); 
   	      driver.findElement(By.id(p.getProperty("MB_BenMobileNumber"))).sendKeys("9544863252");
          driver.findElement(By.id(p.getProperty("MB_BenName"))).sendKeys("Pritika");
   	      driver.findElement(By.id(p.getProperty("MB_BenAddress"))).sendKeys("At Nashik");
   	      driver.findElement(By.id(p.getProperty("MB_BenAccountNumber"))).sendKeys("1234567890");
   	      driver.findElement(By.id(p.getProperty("MB_BenConfirmAccNumber"))).sendKeys("1234567890");
          driver.findElement(By.id(p.getProperty("MB_BenSubmit"))).click();   
   		  
          driver.findElement(By.id(p.getProperty("Button1"))).click();
          Thread.sleep(1000);
          driver.findElement(By.id(p.getProperty("BackButton"))).click();
          
   	       // Verify Beneficiary
          driver.findElement(By.xpath(p.getProperty("MB_VerifyBen"))).click();
    	  Thread.sleep(5000);
    	  driver.findElement(By.id(p.getProperty("SelectFromAccount"))).click();
    	  driver.findElements(By.id(p.getProperty("SelectAccNumber"))).get(1).click();
    	  driver.findElement(By.id(p.getProperty("MB_etSearchButton"))).sendKeys("SBIN0001234");
    	  driver.findElement(By.id(p.getProperty("MB_BenAcc"))).click();
    	  driver.findElements(By.id(p.getProperty("SelectAccNumber"))).get(0).click();
    	  driver.findElement(By.id(p.getProperty("MB_confOTP"))).sendKeys("12345");
    	  Thread.sleep(1000);
    	  driver.findElement(By.id(p.getProperty("submitButton"))).click();
    	  driver.findElement(By.id(p.getProperty("Button1"))).click();
    	  driver.findElement(By.id(p.getProperty("ClearButton"))).click();  
    	  driver.findElement(By.id(p.getProperty("BackButton"))).click();
    	  driver.findElement(By.id(p.getProperty("BackButton"))).click();
    	  
    	  // NEFT E-Request
    	  driver.findElement(By.xpath(p.getProperty("NEFT_ERequest"))).click();
    	  driver.findElement(By.xpath(p.getProperty("Add_Beneficiary"))).click();
    	  
  	    // Add Beneficiary
  	     driver.findElement(By.id(p.getProperty("SelectFromAccount"))).click();
  	     driver.findElements(By.id(p.getProperty("SelectAccNumber"))).get(1).click();
  	  
  	     driver.findElement(By.id(p.getProperty("MB_IFSCCode"))).sendKeys("SBIN0001234");
         driver.findElement(By.id(p.getProperty("MB_SearhIFSCButton"))).click(); 
 	     driver.findElement(By.id(p.getProperty("MB_BenMobileNumber"))).sendKeys("9544863252");
         driver.findElement(By.id(p.getProperty("MB_BenName"))).sendKeys("Pritika somase ");
 	     driver.findElement(By.id(p.getProperty("MB_BenAddress"))).sendKeys("At Nashik");
 	     driver.findElement(By.id(p.getProperty("MB_BenAccountNumber"))).sendKeys("1234567890");
 	     driver.findElement(By.id(p.getProperty("MB_BenConfirmAccNumber"))).sendKeys("1234567890");
         driver.findElement(By.id(p.getProperty("MB_BenSubmit"))).click();   
 		  
         driver.findElement(By.id(p.getProperty("Button1"))).click();
         Thread.sleep(5000);
         driver.findElement(By.id(p.getProperty("BackButton"))).click();
         
         // Verify Beneficiary
          driver.findElement(By.xpath(p.getProperty("MB_VerifyBen"))).click();
   	      driver.findElement(By.id(p.getProperty("SelectFromAccount"))).click();
   	      driver.findElements(By.id(p.getProperty("SelectAccNumber"))).get(1).click();
   	      Thread.sleep(1000);
 	      driver.findElement(By.id(p.getProperty("MB_confOTP"))).sendKeys("12345");
 	      Thread.sleep(1000);
    	  driver.findElement(By.id(p.getProperty("submitButton"))).click();
    	  driver.findElement(By.id(p.getProperty("Button1"))).click();
    	  Thread.sleep(1000);
    	  driver.findElement(By.id(p.getProperty("BackButon"))).click();
    	  driver.findElement(By.id(p.getProperty("BackButon"))).click();
    	  	  
    	  // IMPS Transaction
    	  driver.findElement(By.xpath(p.getProperty("IMPSTransactionStatus"))).click();
    	  driver.findElement(By.id("com.netwin.mobilebanking.dyankmsj:id/bank_rrn")).sendKeys("12345");
    	  driver.findElement(By.id("com.netwin.mobilebanking.dyankmsj:id/Status")).click();
    	  driver.findElement(By.id("com.netwin.mobilebanking.dyankmsj:id/back")).click();
    	  driver.findElement(By.id("com.netwin.mobilebanking.dyankmsj:id/largeLabel")).click();   
      }
      
      @Test(priority= 4, enabled= false)
       public void RechargeAndBillPay() throws InterruptedException
       {
    	   driver.findElement(By.xpath(p.getProperty("RechargeAndBillPay"))).click();
    	   for(int i = 0; i<=4; i++)
    	   {
    		   if(i==3) {continue;}
    		   driver.findElements(By.id(p.getProperty("MB_RechargeTitle"))).get(i).click();
    		   driver.findElement(By.id(p.getProperty("SelectFromAccount"))).click();
    		   driver.findElements(By.id(p.getProperty("SelectAccNumber"))).get(2).click();
    		   
    		   driver.findElement(By.id(p.getProperty("MB_RechargeMoNum"))).sendKeys("3598642586");
    		   driver.findElement(By.id(p.getProperty("MB_RechargeAmount"))).sendKeys("11");
    		   driver.findElement(By.id(p.getProperty("MB_RechargeConAmt"))).sendKeys("11");
    	    	
    		   driver.findElement(By.id(p.getProperty("MB_RechargeOperator"))).click();
    		   driver.findElements(By.id(p.getProperty("MB_RechargeSelectText"))).get(2).click();
    		  
    		   driver.findElement(By.id(p.getProperty("MB_RechargeCircle"))).click();
    		   driver.findElements(By.id(p.getProperty("MB_RechargeSelectText"))).get(2).click();
    		   driver.findElement(By.id(p.getProperty("MB_RechargeButton"))).click();
    		   driver.findElement(By.id(p.getProperty("Button2"))).click();
    		   driver.findElement(By.id(p.getProperty("BackButton"))).click();
    	  }
    	   driver.findElement(By.id("com.netwin.mobilebanking.dyankmsj:id/largeLabel")).click();  
       }
      
       
       @Test(priority= 5, enabled= false)
       public void ChangePIN() throws InterruptedException
       {        
           driver.findElements(By.id(p.getProperty("ChangePin"))).get(8).click();          
           Thread.sleep(1000);
           
           // Login
    	   driver.findElement(By.id("com.netwin.mobilebanking.dyankmsj:id/oldpin")).sendKeys("123456");
    	   driver.findElement(By.id("com.netwin.mobilebanking.dyankmsj:id/newpin")).sendKeys("123");
    	   driver.findElement(By.id("com.netwin.mobilebanking.dyankmsj:id/newpinc")).sendKeys("123");   	   
    	   driver.findElement(By.id("com.netwin.mobilebanking.dyankmsj:id/getOtp")).click();
    	   Thread.sleep(10000);
    	   driver.findElement(By.id("com.netwin.mobilebanking.dyankmsj:id/update")).click(); 	
    	   
    	   // Transaction
    	   driver.findElement(By.id("com.netwin.mobilebanking.dyankmsj:id/profilepass")).click();
    	   driver.findElement(By.id("com.netwin.mobilebanking.dyankmsj:id/oldpin")).sendKeys("123456");
    	   driver.findElement(By.id("com.netwin.mobilebanking.dyankmsj:id/newpin")).sendKeys("123");
    	   driver.findElement(By.id("com.netwin.mobilebanking.dyankmsj:id/newpinc")).sendKeys("123");   	   
    	   driver.findElement(By.id("com.netwin.mobilebanking.dyankmsj:id/getOtp")).click();
    	   Thread.sleep(10000);
    	   driver.findElement(By.id("com.netwin.mobilebanking.dyankmsj:id/update")).click(); 
    	   
    	   // User id 
    	   driver.findElement(By.id("com.netwin.mobilebanking.dyankmsj:id/userID")).click();
    	   driver.findElement(By.id("com.netwin.mobilebanking.dyankmsj:id/newUser")).sendKeys("1234567");
    	   driver.findElement(By.id("com.netwin.mobilebanking.dyankmsj:id/checkAvailabilility")).click();
    	  
    	   driver.findElement(By.id("com.netwin.mobilebanking.dyankmsj:id/confirmUser")).sendKeys("1234567");
    	   driver.findElement(By.id("com.netwin.mobilebanking.dyankmsj:id/getOtp")).click();    	   
    	   Thread.sleep(10000);
    	   driver.findElement(By.id("com.netwin.mobilebanking.dyankmsj:id/update")).click(); 	
     	  
       }
     
}
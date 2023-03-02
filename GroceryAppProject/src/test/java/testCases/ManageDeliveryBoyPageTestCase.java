package testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import constant.Constant;
import elementRepository.AdminPage;
import elementRepository.GLoginPage;
import elementRepository.ManageDeliveryBoyPage;
import utilities.ExcelReadUtility;

public class ManageDeliveryBoyPageTestCase  extends BaseClass{
	
	AdminPage ap;
	GLoginPage gp;
	ManageDeliveryBoyPage deliveryby;
	
	
  @Test
  public void verifyingAdminAbleToAddNewDeliveryBoyDetailsWhileClickingNewButtonInManageDeliveryBoyPage() throws IOException {
	  
	  gp=new GLoginPage(driver);
	  ap=new AdminPage(driver);
	  deliveryby=new ManageDeliveryBoyPage(driver);
	  gp.enterUserName(Constant.LOGINUSERNAME);
	  gp.eneterPassWord(Constant.LOGINPASSWORD);
	  gp.clickSignInButton();
	  ap.clickmanageDeliveryBoy();
	  deliveryby.clickOnNewBtn();
	  deliveryby.enterName(ExcelReadUtility.readStringData("sheet1", 1, 0));
	  deliveryby.enterEmailId(ExcelReadUtility.readStringData("sheet1", 1, 1));
	  deliveryby.enterPhoneNumber(ExcelReadUtility.readIntegerData("sheet1",1,2));
	  deliveryby.enterAddress(ExcelReadUtility.readStringData("sheet1", 1, 3));
	  deliveryby.enterUserName(ExcelReadUtility.readStringData("sheet1", 1, 4));
	  deliveryby.eneterPassWord(ExcelReadUtility.readStringData("sheet1", 1, 5));
	  deliveryby.clickOnCancelBtn();
	    
	   
  }
}

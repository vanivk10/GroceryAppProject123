package testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constant.Constant;
import elementRepository.AdminPage;
import elementRepository.GLoginPage;
import elementRepository.ManageDeliveryBoyPage;
import elementRepository.ManageProductPage;

public class ManageProductTestCase extends BaseClass {
	ManageProductPage mp;
	GLoginPage gp;
	
 @Test(groups= {"critical"} )
  public void verifyingProductTypeRadioButtonIsSelectedInAddProductSubPage () throws IOException {
	//  testBasic();
	  gp=new GLoginPage(driver);
	  mp=new ManageProductPage(driver);
	  gp.enterUserName(Constant.LOGINUSERNAME);
	  gp.eneterPassWord(Constant.LOGINPASSWORD);
	  gp.clickSignInButton();
	  mp.clickManageProdcttab();
	  mp.clickNewButton();
	  boolean actualResult=mp.isRadioButtonSelected();
	  boolean expectedResult=true;
	  Assert.assertEquals(actualResult, expectedResult, Constant.REMEMBERMECHECKBOXERRORMESSAGE);
	  
	  
  }
  
  @Test
  public void verifyingAdminIsAbleToSelectTheValuesFromTheDropDownGroup() {
	
	  gp=new GLoginPage(driver);
	  mp=new ManageProductPage(driver);
	  gp.enterUserName(Constant.LOGINUSERNAME);
	  gp.eneterPassWord(Constant.LOGINPASSWORD);
	  gp.clickSignInButton();
	  mp.clickManageProdcttab();
	  mp.clickNewButton();
	  String actualResult=mp.isDropdownSelected();
	  String expectedresult="discount";
	  Assert.assertEquals(actualResult, expectedresult, Constant.DROPDOWNERRORMESSAGE);
	  
  } 
  
  @Test(groups= {"critical"} )
  public void verifyingAdminIsAbleToSelectTheValuesFromTheRadioButtonPriceType () {
	
	  gp=new GLoginPage(driver);
	  mp=new ManageProductPage(driver);
	  gp.enterUserName(Constant.LOGINUSERNAME);
	  gp.eneterPassWord(Constant.LOGINPASSWORD);
	  gp.clickSignInButton();
	  mp.clickManageProdcttab();
	  mp.clickNewButton();
	  boolean actualResult=mp.isRadioButtonPriceTypeIsSelected();
	  boolean expectedResult=true;
	  Assert.assertEquals(actualResult, expectedResult, Constant.REMEMBERMECHECKBOXERRORMESSAGE);
	  
  } 
  
@Test
public void verifyingToolTipContentOfUnderLineInAddManagProductPage() throws IOException  {
	  
	 // testBasic();
	  gp=new GLoginPage(driver);
	  mp=new ManageProductPage(driver);
	  gp.enterUserName(Constant.LOGINUSERNAME);
	  gp.eneterPassWord(Constant.LOGINPASSWORD);
	  gp.clickSignInButton();
	  mp.clickManageProdcttab();
	  mp.clickNewButton();
	  String actualResult= mp.toolTipContent("aria-label");
	  String expectedResult="Style";
	  Assert.assertEquals(actualResult, expectedResult, Constant.TOOLTIPERRORMESSAGE);
	  	  
  }

@Test
public void verifyingAdminIsAbleToSearchTheProductDetailsWithProductCode() {
	
	gp=new GLoginPage(driver);
	mp=new ManageProductPage(driver);
	gp.enterUserName(Constant.LOGINUSERNAME);
	gp.eneterPassWord(Constant.LOGINPASSWORD);
	gp.clickSignInButton();
	mp.clickManageProdcttab();
	mp.clickSearchBtn1();
	mp.enterProductCode("1269");
	mp.clickOnSearchBtn2();
	mp.getSelectedItemFromSearchBtn2();
	String actualResult=mp.getSelectedItemFromSearchBtn2();
	//String expectedResult=.actualResult. ;
	System.out.println( "Red Meat     ");
 }
}


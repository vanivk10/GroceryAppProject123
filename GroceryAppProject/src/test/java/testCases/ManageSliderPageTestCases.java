package testCases;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.support.Color;
import org.testng.Assert;
import org.testng.annotations.Test;

import constant.Constant;
import elementRepository.AdminPage;
import elementRepository.GLoginPage;

import elementRepository.ManageSliderPage;

public class ManageSliderPageTestCases extends BaseClass {
	GLoginPage gp;
	AdminPage ap;
	ManageSliderPage slider;

  @Test
	
	public void verifyingBackgroundcolorOfResetButton() {
	  
	  slider=new ManageSliderPage(driver);
	  gp=new GLoginPage(driver);
	  ap=new AdminPage(driver);
	  gp.enterUserName(Constant.LOGINUSERNAME);
	  gp.eneterPassWord(Constant.LOGINPASSWORD);
	  gp.clickSignInButton();
	  ap.clickmanageSliderBtn();
	  String color=slider.resetBtnColor();
	  String actualresult=Color.fromString(color).asHex();
	  String expectedresult="#ffc107";
	  Assert.assertEquals(actualresult, expectedresult, "Expected Result is not matched");
	}

	  
  @Test
  public void verifyinAdminCanAccessAddSliderPageWhileClikingOnNewButton()  {
	  
	  slider=new ManageSliderPage(driver);
	  gp=new GLoginPage(driver);
	  ap=new AdminPage(driver);
	  gp.enterUserName(Constant.LOGINUSERNAME);
	  gp.eneterPassWord(Constant.LOGINPASSWORD);
	  gp.clickSignInButton();
	  ap.clickmanageSliderBtn();
	  slider.clickNewBtn();
	  String actualResult=slider.getTitle();
	  String expectedresult="Add Slider | 7rmart supermarket";
	  Assert.assertEquals(actualResult, expectedresult,Constant.COMMONERRORMESSAGE);
	  
  }
  
  @Test
  public void verifyingWorkingOfFileUploadInAddSliderPage() throws AWTException {
	  
	  slider=new ManageSliderPage(driver);
	  gp=new GLoginPage(driver);
	  ap=new AdminPage(driver);
	  gp.enterUserName(Constant.LOGINUSERNAME);
	  gp.eneterPassWord(Constant.LOGINPASSWORD);
	  gp.clickSignInButton();
	  ap.clickmanageSliderBtn();
	  slider.clickNewBtn();
	  slider.FileUpload();
	  slider.enterlinkText("www.amazon.in");
	  slider.clickOnSaveeBtn();
	  String actualResult=slider.getAlertMessage();
	  String expectedResult="?\n"+ 
	  		"Alert!\n"+ 
	  		"Slider Created Successfully";
			  
	  Assert.assertEquals(actualResult, expectedResult, Constant.COMMONERRORMESSAGE);
	  
	 
	  
  }
}

package testCases;
import org.testng.Assert;
import org.testng.annotations.Test;

import constant.Constant;
import elementRepository.AdminPage;
import elementRepository.GLoginPage;
import elementRepository.ManageUserPage;

public class ManageUserPageTestCase extends BaseClass {
	
	GLoginPage gp;
	AdminPage ap;
	ManageUserPage user;
	
  @Test
  public void  verifyingAdminIsAbleToSearchTheUserAndChangeTheStatuOfSearchResultUser() {
	  
	  gp=new GLoginPage(driver);
	  ap=new AdminPage(driver);
	  user=new ManageUserPage(driver);
	  gp.enterUserName(Constant.LOGINUSERNAME);
	  gp.eneterPassWord(Constant.LOGINPASSWORD);
	  gp.clickSignInButton();
	  ap.clickOnAdmin();
	  user.clickOnManageusersBtn();
	  user.clickOnSearchBtn();
	  user.enteUserName("Karuna Thomas");
	  user.clickOnSearchBtn1();
	  user.getSelectedItemFromSearchBtn1();
	  String actualResult=user.getSelectedItemFromSearchBtn1();
	  String expectedResult="Karuna Thomas";
	  Assert.assertEquals(actualResult, expectedResult,Constant.COMMONERRORMESSAGE);
	  
	
  }
}

package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import constant.Constant;
import elementRepository.AdminPage;
import elementRepository.GLoginPage;

public class AdminPageTestCase extends BaseClass{
	
	GLoginPage gp;
	AdminPage ap;
	
	
 @Test
  public void verifyingWorkingOfLogOutButtonInAdminPage() {
	  gp=new GLoginPage(driver);
	  ap=new AdminPage(driver);
	  gp.enterUserName("admin");
	  gp.eneterPassWord("admin");
	  gp.clickSignInButton();
	  ap.clickOnAdmin();
	  String actualResult=ap.clickOnLogout();
	  String expectedResult="https://groceryapp.uniqassosiates.com/admin/login";
	  Assert.assertEquals(actualResult, expectedResult, Constant.COMMONERRORMESSAGE);
	  
	}
  @Test
  public void verifyingPageTiTleOfAdminHomePage() {
	  
	  gp=new GLoginPage(driver);
	  ap=new AdminPage(driver);
	  gp.enterUserName("admin");
	  gp.eneterPassWord("admin");
	  gp.clickSignInButton();
	  String actualResult=ap.pageTitle();
	  //System.out.println(actualResult);
	  String expectedResult="Dashboard | 7rmart supermarket";
	  Assert.assertEquals(actualResult, expectedResult, Constant.COMMONERRORMESSAGE);
	  
  }
  
  @Test
  public void verifyingAdminCanAccessableManageUserPage() {
	  
	  gp=new GLoginPage(driver);
	  ap=new AdminPage(driver);
	  gp.enterUserName("admin");
	  gp.eneterPassWord("admin");
	  gp.clickSignInButton();
	  String actualResult=ap.clickOnManageUserBtn();
	  String expectedResult="https://groceryapp.uniqassosiates.com/admin/list-user";
	  Assert.assertEquals(actualResult, expectedResult, Constant.COMMONERRORMESSAGE);
		  
	  }
	  
  
  
  @Test
  public void verifyingAdminCanAccessableManageOrdersPage() {
	  
	  gp=new GLoginPage(driver);
	  ap=new AdminPage(driver);
	  gp.enterUserName("admin");
	  gp.eneterPassWord("admin");
	  gp.clickSignInButton();
	  ap.clickmanageOrders();
	  String actualResult=ap.pageTitle();
	  //System.out.println(actualResult);
	  String expectedResult="List Orders | 7rmart supermarket";
	  Assert.assertEquals(actualResult, expectedResult, Constant.COMMONERRORMESSAGE);
	  
  }
  
}

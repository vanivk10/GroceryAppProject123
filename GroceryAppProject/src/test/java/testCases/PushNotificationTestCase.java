package testCases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import constant.Constant;
import elementRepository.AdminPage;
import elementRepository.GLoginPage;
import elementRepository.PushNotificationPage;
import utilities.ExcelReadUtility;

public class PushNotificationTestCase extends BaseClass{
	
	//WebDriver driver;
	PushNotificationPage pn;
	GLoginPage gl;
	AdminPage ap;
	
  @Test
  public void VerifyingNoticationSendInPushNotificationPage() throws IOException  {
	  
	  pn=new PushNotificationPage(driver);
	  gl=new GLoginPage(driver);
	  ap=new AdminPage(driver);
	  gl.enterUserName(ExcelReadUtility.readStringData("sheet1", 1, 0));
	  gl.eneterPassWord(ExcelReadUtility.readStringData("sheet1", 1, 1));
	  gl.clickSignInButton();
	  ap.clickPushNotification();
	  pn.enterTitle(Constant.TITLE);
	  pn.enterDescription(Constant.DESCRIPTION);
	  pn.sendNotification();
	  String actualResult=pn.getAlertMessageInPushNotificationInPage();
	  String expectedResult="×\n"
                          +"Alert!\n"
	  	                  +"Message send successfully";
	  
	  Assert.assertEquals(actualResult, expectedResult, Constant.COMMONERRORMESSAGE);
  }
  
 
}

package testCases;

import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import constant.Constant;
import elementRepository.GLoginPage;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;
import org.testng.Assert;


public class GLoginPageTestCase extends BaseClass {// inheritance

	GLoginPage gp;
	
	
	@Test(groups= {"critical"} )
	public void verifyLoginwithInvalidCredentials() throws IOException {
		
		  testBasic();
		  gp=new GLoginPage(driver);
		  gp.enterUserName("admin");
		  gp.eneterPassWord("aa");
		  gp.clickSignInButton();
		  String actualResult=gp.GetAlertMessageInSignInPage();
		  String expectedResult="×\n"
				  + "Alert!\n"
				  + "Invalid Username/Password";
		  Assert.assertEquals(actualResult, expectedResult, ":::Expected Result is Not matched");
		
	}
	

	@Test(groups= {"critical"} )
	public void verifyThetextOfSignInButton() {
    
		gp=new GLoginPage(driver);
		String actualResult= gp.getTextOfSignInButton();
		String expectedResult="Sign In";
		Assert.assertEquals(actualResult, expectedResult, ":::Expected Result is not matched");
	}
	
	@Test(groups= {"critical"} )
	public void VerifyBackgroundColourOfSignInButton() {
		
	    gp=new GLoginPage(driver);
		String color=gp.SignInButtonColour();
		String actualresult=Color.fromString(color).asHex();
		String expectedresult="#343a40";
		Assert.assertEquals(actualresult, expectedresult, "Expected Result is not matched");
	}

	@Test
	public void VerifyingRememberMeCheckBoxIsUnselectedInSignIn() {	
		  gp=new GLoginPage(driver);
		  boolean actualResult=gp.checkRememberMe();
		  boolean expectedResult=false;
		  Assert.assertEquals(actualResult, expectedResult, Constant.REMEMBERMECHECKBOXERRORMESSAGE);
	  }
	@Test
	public void verifyingCurrentUrlOfTheSignInPage() {
		
		gp=new GLoginPage(driver);
		String ActualResult=driver.getCurrentUrl();
		String expectedResult="https://groceryapp.uniqassosiates.com/admin/login";
		Assert.assertEquals(ActualResult, expectedResult, "URL IS NOT MATCHED");
		String actualResult= gp.getTextOfSignInButton();
		String expectedResult2="Sign In";
		Assert.assertEquals(actualResult, expectedResult2, ":::Expected Text is not matched");
		
		
			
	}
	
}


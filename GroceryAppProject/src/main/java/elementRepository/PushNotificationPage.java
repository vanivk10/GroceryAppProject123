package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.GeneralUtilities;

public class PushNotificationPage {
	
	WebDriver driver;
	GeneralUtilities gu=new GeneralUtilities();
	
	public PushNotificationPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id="title")
	WebElement title;
	@FindBy(id="description")
	WebElement descripn;
	@FindBy(xpath="//button[@type='submit']")
	WebElement sendbtn;
	@FindBy(xpath="//a[text()='Reset']")
	WebElement resetbtn;
	
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
	WebElement notificationMsg;
	
	public void enterTitle(String tit) {
		title.sendKeys(tit); 
	}
	
    public void enterDescription(String ds) {
		descripn.sendKeys(ds);
	}
    
    public void sendNotification() {
    	
    	sendbtn.click();
    	
    }
    public void resetNotification() {
    	
    	resetbtn.click();
    }
    
public String getAlertMessageInPushNotificationInPage() {
		
		
	String s=gu.getElementText(notificationMsg);
	//System.out.println(s);
	return s;
	}
}

package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.GeneralUtilities;

public class AdminPage {
	WebDriver driver;
	GeneralUtilities gu=new GeneralUtilities();
	
	public AdminPage(WebDriver driver) {
		
			this.driver=driver;
			PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//li[@class='nav-item dropdown']")
	WebElement adminTab;
	
	@FindBy(xpath="//i[@class='ace-icon fa fa-power-off']")
	WebElement logOutOption;
	
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-user' ]")
	WebElement manageUsersBtn;
	
    @FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-page'][normalize-space()='More info']")
	WebElement managePagesBtn;
	
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-slider'][normalize-space()='More info']") 
	WebElement manageSliderBtn;
	
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-notifications']")
	WebElement pushnotificationBtn;
	
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-order']")
	WebElement manageOrdersBtn;
	
	@FindBy(xpath=" (//a[@href='https://groceryapp.uniqassosiates.com/admin/list-deliveryboy'])[1]")
	WebElement manageDeliveryBoyBtn;
	
	public void clickmanageDeliveryBoy() {
		
		manageDeliveryBoyBtn.click();
	}
	
	public void clickmanageOrders() {
		manageOrdersBtn.click();
		
	}
	public void clickPushNotification() {
		pushnotificationBtn.click();
	}
	
	
	public void clickOnAdmin() {
		adminTab.click();
	}
	
	public String clickOnLogout() {
		logOutOption.click();
	    return	driver.getCurrentUrl();
			
	}
	
	public String pageTitle() {
		return driver.getTitle();
	}
	
	public String clickOnManageUserBtn() {
		manageUsersBtn.click();
		return driver.getCurrentUrl();
	}
	
	public void ClickOnManagePagesBtn() {
		managePagesBtn.click();
		
	}
	
	public void clickmanageSliderBtn() {
		manageSliderBtn.click();
	}
}

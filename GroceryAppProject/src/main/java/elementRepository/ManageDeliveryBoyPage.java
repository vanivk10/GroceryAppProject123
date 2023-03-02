package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.GeneralUtilities;

public class ManageDeliveryBoyPage {
	
	WebDriver driver;
	GeneralUtilities gu=new GeneralUtilities();
	
	public ManageDeliveryBoyPage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/Deliveryboy/add']")
	WebElement newBtn;
	
	@FindBy(xpath="//a[@class='btn btn-rounded btn-primary']")
	WebElement searchBtn;
	
	@FindBy(xpath="//a[@class='btn btn-rounded btn-warning'] ")
	WebElement resetBtn;
	
	@FindBy(xpath="//input[@type='text'][1]")
	WebElement nam;
	
	@FindBy(id="email")
	WebElement emailId;
	
	@FindBy(id="phone")
	WebElement phonenumber;
	
	@FindBy(id="address")
	WebElement addresss;
	
	@FindBy(id="username")
	WebElement newUsername;
	
	@FindBy(id="password")
	WebElement newPassword;
	
	@FindBy(xpath="//button[normalize-space()='Save']")
	WebElement saveBtn;
	
	@FindBy(xpath="//a[text()='Cancel']")
	WebElement cancelBtn;
    
	public void enterName(String na) {
		nam.sendKeys(na);
		
	}
	
	public void enterPhoneNumber(String no) {
		phonenumber.sendKeys(no);
		
	}
	
	public void enterEmailId(String eid) {
		emailId.sendKeys(eid);
		
	}
	
	public void enterAddress(String adr) {
		addresss.sendKeys(adr);
		
	}
	
	
	public void enterUserName(String user) {
		newUsername.sendKeys(user);
		
	}
	
	public void eneterPassWord(String pass) {
		newPassword.sendKeys(pass);
	}
	
	public void clickOnNewBtn() {
		newBtn.click();
	}

	public void clickOnCancelBtn() {
		cancelBtn.clear();
		
	}
	
	public void clickOnSaveBtn() {
		saveBtn.click();
		
	}
}

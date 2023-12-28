package pageObjectModule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UsersPage {
	//store all the elements of the userpage
	@FindBy(name = "username") private WebElement UsernameTB; //IMP
	@FindBy(name = "passwordText") private WebElement PasswordTB; //IMP
	@FindBy(name = "passwordTextRetype") private WebElement RePasswordTB; //IMP
	@FindBy(name = "active") private WebElement AccessDropdown;
	@FindBy(name = "firstName") private WebElement FirstNameTB;//IMP
	@FindBy(name = "lastName") private WebElement LastNameTB;  //IMP
	@FindBy(name = "middleName") private WebElement MiddleInitialTB;
	@FindBy(name = "email") private WebElement EmailAddressTB;
	@FindBy(name = "phone") private WebElement PhoneTB;
	@FindBy(name = "fax") private WebElement FaxTB;
	@FindBy(name = "mobile") private WebElement MobileNumberTB;
	@FindBy(name = "otherContact") private WebElement OtherContactNumberTB;
	@FindBy(name = "timeZoneId") private WebElement UserTimeZoneDropdown;
	@FindBy(name = "workdayDurationStr") private WebElement WorkDayDurationTB;
	@FindBy(name = "overtimeTracking") private WebElement EnableOverTimeTrackingRadioButton;
	@FindBy(xpath = "//input[@value=\"   Create User   \"]") private WebElement CreateUserButton;//IMP
	@FindBy(name="rightGranted[12]") private WebElement ModifyTimeTrackOtherCB;  //IMP
	@FindBy(name="rightGranted[2]") private WebElement CustomerMangee_ProjectCB;  //IMP
	@FindBy(name="rightGranted[13]") private WebElement ManageTasksCB; //imp
	@FindBy(name="right5") private WebElement ManageUsersCB; //imp
	@FindBy(name="right7")private WebElement ManageBillingTimeCB;  //imp
	@FindBy(name="rightGranted[1]") private WebElement generateReportCB;
	
	//Initialization
	UsersPage(WebDriver driver){
		PageFactory.initElements(driver,this);
	}
	
	//Declaration
	public WebElement getUsernameTB() {
		return UsernameTB;
	}
	public WebElement getPasswordTB() {
		return PasswordTB;
	}
	public WebElement getAccessDropdown() {
		return AccessDropdown;
	}
	public WebElement getRePasswordTB() {
		return RePasswordTB;
	}
	public WebElement getFirstNameTB() {
		return FirstNameTB;
	}
	public WebElement getLastNameTB() {
		return LastNameTB;
	}
	public WebElement getMiddleInitialTB() {
		return MiddleInitialTB;
	}
	public WebElement getEmailAddressTB() {
		return EmailAddressTB;
	}
	public WebElement getPhoneTB() {
		return PhoneTB;
	}
	public WebElement getFaxTB() {
		return FaxTB;
	}
	public WebElement getMobileNumberTB() {
		return MobileNumberTB;
	}
	public WebElement getOtherContactNumberTB() {
		return OtherContactNumberTB;
	}
	public WebElement getUserTimeZoneDropdown() {
		return UserTimeZoneDropdown;
	}
	public WebElement getWorkDayDurationTB() {
		return WorkDayDurationTB;
	}
	public WebElement getEnableOverTimeTrackingRadioButton() {
		return EnableOverTimeTrackingRadioButton;
	}
	public WebElement getCreateUserButton() {
		return CreateUserButton;
	}
	
	
	//operational method
	
	public void UsernameTB() {
		UsernameTB.sendKeys("");
	}
	public void PasswordTB() {
		
	}
	public void AccessDropdown(){
		
	}
	public void RePasswordTB(){
		
	}
	public void FirstNameTB(){
		
	}
	public void LastNameTB(){
		
	}
	public void MiddleInitialTB(){
		
	}
	public void EmailAddressTB() {
		
	}
	public void PhoneTB(){
		
	}
	public void FaxTB() {
		
	}
	public void MobileNumberTB() {
		
	}
	public void OtherContactNumberTB() {
		
	}
	public void UserTimeZoneDropdown() {
		
	}
	public void WorkDayDurationTB() {
		
	}
	public void EnableOverTimeTrackingRadioButton() {
		
	}
	public void CreateUserButton() {
		
	}

}

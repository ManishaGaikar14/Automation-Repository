package pageObjectModule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	//store all web elements of login page
	@FindBy(name = "username") private WebElement usnTB;
	@FindBy(name = "pwd") private WebElement pswTB;
	@FindBy(id = "loginButton") private WebElement loginButton;
	@FindBy(name = "remember") private WebElement keepMeLoggedInCheckBox;
	@FindBy(partialLinkText = "Actimind Inc.") private WebElement actiMindLink;
	@FindBy(partialLinkText = "License for using this software") private WebElement licenceLink;
	//@FindBy(xpath = "(//td[@valign=\"top\"]/descendant::div)[2]") private WebElement logoname;
	
	//initialization of webelement create constructor
//	public LoginPage(WebElement usnTB, WebElement pswTB, WebElement loginButton, WebElement keepMeLoggedInCheckBox,
//			WebElement actiMindLink, WebElement licenceLink) {
//		super();
//		this.usnTB = usnTB;
//		this.pswTB = pswTB;
//		this.loginButton = loginButton;
//		this.keepMeLoggedInCheckBox = keepMeLoggedInCheckBox;
//		this.actiMindLink = actiMindLink;
//		this.licenceLink = licenceLink;
//	}
	//Initialization by using constructor for all elements once using webdriver interface
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	//utilization

	public WebElement getUsnTB() {
		return usnTB;
	}

	public WebElement getPswTB() {
		return pswTB;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

	public WebElement getKeepMeLoggedInCheckBox() {
		return keepMeLoggedInCheckBox;
	}

	public WebElement getActiMindLink() {
		return actiMindLink;
	}

	public WebElement getLicenceLink() {
		return licenceLink;
	}
	
	
	//operational methods
	
	public void validLogin(String validusn,String validpass) {
		usnTB.sendKeys(validusn);
		pswTB.sendKeys(validpass);
		loginButton.click();
	}
	
	public void invalidLogin(String invalidusn,String invalidPass) {
		usnTB.sendKeys(invalidusn);
		pswTB.sendKeys(invalidPass);
		loginButton.click();
		usnTB.clear();
	}
}

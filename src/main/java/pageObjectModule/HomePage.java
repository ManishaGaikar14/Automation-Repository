package pageObjectModule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	//store all the modules of home page
	@FindBy(xpath = "//div[text()='Time-Track']/following-sibling::div/img") private WebElement Time_Track_Module;
	@FindBy(xpath = "//div[text()=\"Tasks\"]/following-sibling::div/img") private WebElement Task_Module;
	@FindBy(xpath = "//div[text()='Reports']/following-sibling::div/img") private WebElement Reports_Module;
	@FindBy(xpath = "//div[text()='Users']/following-sibling::div/img") private WebElement Users_Module;
	@FindBy(xpath = "//div[text()='Work Schedule']/following-sibling::div/img") private WebElement WorkSchedule_Module;
	@FindBy(xpath = "//div[text()='Settings']/following-sibling::div/img") private WebElement Settings_Module;
	@FindBy(partialLinkText = "Logout") private WebElement Logout_Button;
	
	//initialisation
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	//declaration
	public WebElement getTime_Track_Module() {
		return Time_Track_Module;
	}

	public WebElement getTask_Module() {
		return Task_Module;
	}

	public WebElement getReports_Module() {
		return Reports_Module;
	}

	public WebElement getUsers_Module() {
		return Users_Module;
	}

	public WebElement getWorkSchedule_Module() {
		return WorkSchedule_Module;
	}

	public WebElement getSettings_Module() {
		return Settings_Module;
	}

	public WebElement getLogout_Button() {
		return Logout_Button;
	}
	
	//operational methods
	public void Time_Track_Module() {
			Time_Track_Module.click();
	}

	public void Tasks_Module() {
		Task_Module.click();
	}
	public void Reports_Module() {
		Reports_Module.click();
	}
	public void Users_Module() {
		Users_Module.click();
		}
	public void Work_Schedule_Module() {
		WorkSchedule_Module.click();
 	}
	public void Settings_Module() {
		Settings_Module.click();
 	}
 	public void Logout_Method() {
 		Logout_Button.click();
 	}
}



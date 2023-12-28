package pageObjectModule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class TasksPage {
	//store all the web elements of taskspage
	@FindBy(partialLinkText = "Projects & Customers") private WebElement Project_Customer_SubModule;
	@FindBy(xpath = "//input[@value=\"Create New Customer\"]") private WebElement Create_new_Customer_SubModule;
	@FindBy(name = "name") private WebElement Customer_NameTB;
	@FindBy(name = "createCustomerSubmit") private WebElement CreateCustomer_Button;
	@FindBy(xpath = "//input[@value=\"Create New Project\"]") private WebElement Create_new_Project_SubModule;
	@FindBy(name = "customerId") private WebElement Customer_Name_Dropdown;
	@FindBy(name = "name") private WebElement ProjectName;
	@FindBy(name = "createProjectSubmit") private WebElement Create_Project_Button;
	@FindBy(partialLinkText = "Logout") private WebElement Logout;
	
	//initialization
	public TasksPage(WebDriver driver) {
	PageFactory.initElements(driver,this);	
	}

	//declaration
	
	public WebElement getProject_Customer_SubModule() {
		return Project_Customer_SubModule;
	}

	public WebElement getCreate_new_Customer_SubModule() {
		return Create_new_Customer_SubModule;
	}

	public WebElement getCustomer_NameTB() {
		return Customer_NameTB;
	}

	public WebElement getCreateCustomer_Button() {
		return CreateCustomer_Button;
	}

	public WebElement getCreate_new_Project_SubModule() {
		return Create_new_Project_SubModule;
	}

	public WebElement getCustomer_Name_Dropdown() {
		return Customer_Name_Dropdown;
	}

	public WebElement getProjectName() {
		return ProjectName;
	}

	public WebElement getCreate_Project_Button() {
		return Create_Project_Button;
	}

	public WebElement getLogout() {
		return Logout;
	}
	
	
	//operational Methods
	public void createcustomer_createproject_method(String cust_name) {
		Project_Customer_SubModule.click();
		Create_new_Customer_SubModule.click();
		Customer_NameTB.click();
		CreateCustomer_Button.click();
		Create_new_Project_SubModule.click();
		Select sel = new Select(Customer_Name_Dropdown);
		//sel.click_on_Task_Module();
		//create customer and project use taskpage
		//TasksPage tp = new TasksPage(driver);
		//tp.cu
		
	}
}

package pageObjectModule;

import java.io.IOException;

public class createcustomer_ProjectTestCase extends BaseTest{

	public static void main(String[] args) throws IOException, InterruptedException {
		//to open and close browser
		BaseTest bt = new BaseTest();
		bt.setUp();
		//read the date from property and excel sheet file
		Flib flib = new Flib();
		//perform valid login use login page pom
		LoginPage lp = new LoginPage(driver);
		//lp.validLogin(flib.readDataFromProperty(PROP_PATH, "Username",flib.readDataFromProperty(PROP_PATH "Password"));
		lp.validLogin(flib.readDataFromProperty(PROP_PATH,"Username"),flib.readDataFromProperty(PROP_PATH, "Password"));
		//to work task module use homepage pom
		HomePage hp = new HomePage(driver);
		Thread.sleep(2000);
		hp.Tasks_Module();
		//hp.Logout_Method();
		bt.tearDown();
	}
}

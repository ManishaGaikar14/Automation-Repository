package pageObjectModule;

import java.io.IOException;

public class ActiTimeValidLogin extends BaseTest {
	public static void main(String[] args) throws IOException {
		BaseTest bt = new BaseTest();
		bt.setUp();
		LoginPage lp = new LoginPage(driver);
		//lp.validLogin(Invalid_Cred, EXCEL_PATH);
		Flib flib = new Flib();
		lp.validLogin(flib.readDataFromProperty(PROP_PATH, "Username"),flib.readDataFromProperty(PROP_PATH, "Password"));
		bt.tearDown();
	}
}

package pageObjectModule;

import java.io.IOException;

public class ActiTimeInvalidLogin extends BaseTest{
	public static void main(String[] args) throws IOException, InterruptedException {
		BaseTest bt = new BaseTest();
		bt.setUp();
		LoginPage lp = new LoginPage(driver);
		Flib flib = new Flib();
		int rc = flib.rowCount(EXCEL_PATH, Invalid_Cred);
		for(int i=1;i<=rc;i++) {
			lp.invalidLogin(flib.readDataFromExcel(EXCEL_PATH, Invalid_Cred, i, 0),flib.readDataFromExcel(EXCEL_PATH, Invalid_Cred, i, 1));	
		}
		Thread.sleep(2000);
		bt.tearDown();
		
	}

}

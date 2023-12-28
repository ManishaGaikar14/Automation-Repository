package keywordDriverFramework;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ActiTimeInvalidLoginCred extends BaseTest {
	public static void main(String[] args) throws IOException, InterruptedException {
		BaseTest bt = new BaseTest();
		bt.openBrowser();
		//to read data from excel sheet
		Flib flib = new Flib();
		int rc = flib.rowCount("./src/main/resources/ActiTimeTestData1.xlsx","InvalidCredentials");
		Thread.sleep(2000);
		for(int i=0;i<=rc;i++) {
		String invalidusn = flib.readDataFromExcel("./src/main/resources/ActiTimeTestData1.xlsx", "InvalidCredentials", i, 0);
		String invalidpsw = flib.readDataFromExcel("./src/main/resources/ActiTimeTestData1.xlsx", "InvalidCredentials", i, 1);
		//identify web element
		Thread.sleep(2000);
		WebElement usn = driver.findElement(By.name("username"));
		usn.sendKeys(invalidusn);
		WebElement pwd = driver.findElement(By.name("pwd"));
		pwd.sendKeys(invalidpsw);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("username")).clear();
		}
		bt.closeBrowser();
	}
}


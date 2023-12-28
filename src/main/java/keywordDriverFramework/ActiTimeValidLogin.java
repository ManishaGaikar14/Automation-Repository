package keywordDriverFramework;

import java.io.IOException;

import org.openqa.selenium.By;

public class ActiTimeValidLogin extends BaseTest implements IautoConstant{
	public static void main(String[] args) throws IOException, InterruptedException {
		//launch browser and application
		BaseTest bt = new BaseTest();
		bt.openBrowser();
		//read data from property file create object of flib
		Flib flib = new Flib();
		String usn = flib.readDataFromProperty(PROP_PATH,"Username");
		System.out.println(usn);
		String pwd = flib.readDataFromProperty(PROP_PATH,"Password");
		System.out.println(pwd);
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys(usn);
		Thread.sleep(2000);
		driver.findElement(By.name("pwd")).sendKeys(pwd);
		Thread.sleep(2000);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
		bt.closeBrowser();
	}
}

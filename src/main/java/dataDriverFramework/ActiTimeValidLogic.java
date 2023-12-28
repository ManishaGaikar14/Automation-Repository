package dataDriverFramework;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeValidLogic {
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1:81/login.do;jsessionid=aqgeh33ka601s");
		Flib flib = new Flib();
		String usnData = flib.readDataFromExcel("./src/main/resources/ActiTimeTestData1.xlsx","ValidCredentials",1, 0);
		String pwdData = flib.readDataFromExcel("./src/main/resources/ActiTimeTestData1.xlsx","ValidCredentials",1, 1);
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys(usnData);
		driver.findElement(By.name("pwd")).sendKeys(pwdData);
		driver.findElement(By.id("loginButton")).click();
	}
}

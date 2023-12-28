package dataDriverFramework;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeInvalid {
public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://127.0.0.1:81/login.do;jsessionid=aqgeh33ka601s");
	Flib flib = new Flib();
	String usnData = flib.readDataFromExcel("./src/main/resources/ActiTimeTestData1.xlsx","InvalidCredentials",1, 0);
	System.out.println(usnData);
	String pwdData = flib.readDataFromExcel("./src/main/resources/ActiTimeTestData1.xlsx","InvalidCredentials",1, 1);
	System.out.println(pwdData);
	Thread.sleep(2000);	
	driver.findElement(By.name("username")).sendKeys(usnData);
	driver.findElement(By.name("pwd")).sendKeys(pwdData);
	driver.findElement(By.id("loginButton")).click();
	driver.close();
}
}

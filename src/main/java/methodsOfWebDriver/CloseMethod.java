package methodsOfWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseMethod {
	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://omayo.blogspot.com/2013/05/page-one.html");
	//click on link
	driver.findElement(By.partialLinkText("Open a popup")).click();
	//close the browser--->it only close parent browser/current browser,the browser which has control
	driver.close();
	}

}

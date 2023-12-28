package methodsOfWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitMethod {
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	//maximize the browser
	driver.manage().window().maximize();
	//launch web application
	Thread.sleep(2000);
	driver.get("https://omayo.blogspot.com/2013/05/page-one.html");
	//click on the link
	Thread.sleep(2000);
	driver.findElement(By.partialLinkText("Open a")).click();
	//close parent and child both browser
	Thread.sleep(2000);
	driver.quit();
	}
}

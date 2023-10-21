package methodsOfWebdriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandlesMethod1 {
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.get("http://omayo.blogspot.com/");
	String currentUrlOfPage = driver.getCurrentUrl();
	System.out.println(currentUrlOfPage);
	System.out.println("____________________");
	driver.findElement(By.partialLinkText("Open a popup window")).click();
	Thread.sleep(2000);
	driver.findElement(By.partialLinkText("SeleniumTutorial")).click();
	Thread.sleep(2000);
	String parentHandle = driver.getWindowHandle();
	System.out.println(parentHandle);
	System.out.println("____________________");
	Set<String> parentChildHandles = driver.getWindowHandles();
	System.out.println(parentChildHandles);
	System.out.println("_____________________");
	
	for(String WindowHandle:parentChildHandles) {
		//System.out.println(parentHandle);
		//System.out.println(parentChildHandles);
		if(!parentHandle.equals(WindowHandle)) {
			System.out.println("address of child window: "+WindowHandle);
			//to switch control for child handles,with the help of address of that.
			driver.switchTo().activeElement().sendKeys(WindowHandle);
		}
		else
			System.out.println("address of parent window: "+WindowHandle);
	}
	driver.quit();
	}
}



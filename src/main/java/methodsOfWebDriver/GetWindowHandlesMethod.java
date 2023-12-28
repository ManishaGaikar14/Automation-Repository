package methodsOfWebDriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandlesMethod {
	public static void main(String[] args) {
		//LAUNCH BROWSER
		WebDriver driver=new ChromeDriver();
		//maximize browser
		driver.manage().window().maximize();
		//launch application
		driver.get("https://omayo.blogspot.com/2013/05/page-one.html");
		//to get the address of the multiple window
		String parentHandle = driver.getWindowHandle();
		System.out.println("Current Window Address:"+parentHandle);
		//open the link
		driver.findElement(By.partialLinkText("Open a popup")).click();
		//address of all window
		Set<String> AllHandles = driver.getWindowHandles();
		for(String wh:AllHandles) {
			if(!parentHandle.equals(wh)) {
				System.out.println("Child Handle Address:"+wh);
			}
			else
				System.out.println("Parent Handle Address:"+wh);
		}
		//close parent and child both browser
		driver.quit();
}
}

package methodsOfWebDriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToMethod1 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		//maximize browser
		driver.manage().window().maximize();
		//launch browser
		driver.get("https://omayo.blogspot.com/2013/05/page-one.html");
		//click on link
		driver.findElement(By.partialLinkText("Open a popup")).click();
		String parentHandle = driver.getWindowHandle();
		System.out.println(parentHandle);
		Set<String> allHandle = driver.getWindowHandles();
		for(String wh:allHandle) {
			if(!parentHandle.equals(wh)) {
				System.out.println("Child Handle Address:"+wh);
				driver.switchTo().window(wh);
			}
			else
				System.out.println("Parent Handle Address:"+wh);
				driver.switchTo().window(wh);
		}
		//here only close child window bcos control on child window
		driver.close();
	}
}

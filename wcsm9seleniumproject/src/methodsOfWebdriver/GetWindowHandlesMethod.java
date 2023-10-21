package methodsOfWebdriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandlesMethod {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("http://omayo.blogspot.com/");
		String urlcurrent = driver.getCurrentUrl();
		System.out.println(urlcurrent);
		String title = driver.getTitle();
		System.out.println(title);
		
		System.out.println("_______________");
		driver.findElement(By.partialLinkText("Open a popup window")).click();
		String title1 = driver.getTitle();
		System.out.println(title1);
		
		System.out.println("________________ ");
		//it print the address of parent browser/current browser/print the address of browser which hold the control
		String parentHandle = driver.getWindowHandle();
		System.out.println(parentHandle);
		
		System.out.println("_________________");
		Set<String> parentChildHandles = driver.getWindowHandles();
		System.out.println(parentChildHandles);
		
		System.out.println("_________________");
		driver.close();
		
		
	}

}

package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefoxBrowser {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new FirefoxDriver();
		System.out.println("Firefox Is Open");
		Thread.sleep(2000);
		driver.close();
		System.out.println("Firefox is close");
	}	
}

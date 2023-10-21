package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class LaunchCromeBrowser {
	
	public static void main(String[] args) throws InterruptedException {
		// to launch chrome browser we need to create and object of chrome Driver
		WebDriver driver=new ChromeDriver(); //here we are upcasting to access the methods from webdriver (interface)
		
		driver.manage().window().maximize(); //manage() use to call the maximize method,and to call that before that we call widow()
		
		System.out.println("Chrome is Open");
		//to delay the time of closing we use the method from Threat class sleep().....STOP 
		
		Thread.sleep(2000);
		//To close the browser we need to call thE method from webdriver(interface) which is close()
		
		driver.close();
		System.out.println("Chrome is Close");
	}
}

package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdLocator {
	public static void main(String[] args) throws InterruptedException {
		//launch web application
	WebDriver driver=new ChromeDriver();
	// delay for 2sec
	Thread.sleep(2000);
	//maximize
	driver.manage().window().maximize();
	Thread.sleep(2000);
	//launch web application
	driver.get("file:///C:/Users/Pagey/Desktop/htmlBasics/WebPage.html");
	//delay for 2sec
	Thread.sleep(2000);
	//identify the web element Username textbox and pass the value
	driver.findElement(By.tagName("input")).sendKeys("Admin");
	Thread.sleep(2000);
	//identify the web element Password textbox and pass the value
	driver.findElement(By.id("id2")).sendKeys("Manager");
	}

}

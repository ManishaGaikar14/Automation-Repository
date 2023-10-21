package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagName {
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	//maximize
	driver.manage().window().maximize();
	//delay for 2sec
	Thread.sleep(2000);
	//launch Web Application
	driver.get("file:///C:/Users/Pagey/Desktop/htmlBasics/WebPage.html");
	//identify web element- username textbox and pass a value
	driver.findElement(By.tagName("input")).sendKeys("Admin");
	}

}

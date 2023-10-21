package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagName1 {
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	//maximize
	driver.manage().window().maximize();
	//delay for 2sec
	Thread.sleep(20000);
	//launch the web application
	driver.get("file:///C:/Users/Pagey/Desktop/htmlBasics/WebPage.html");
	Thread.sleep(2000);
	//identify username testbox and pass value
	driver.findElement(By.tagName("input")).sendKeys("Admin");
	Thread.sleep(2000);
	//identify password textbox and pass value
	//here the tag name of above usename and password are same so,it will always giving priority to the first suggestion
	//so,here we need to use id locator,bcoz it is present in password source code of html
	driver.findElement(By.tagName("input")).sendKeys("Manager");
	
	}

}

package assignmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.edge.EdgeDriver;

public class Twitter {
	public static void main(String[] args) throws InterruptedException {
	//launch browser
	WebDriver driver=new EdgeDriver();
	//maximize
	driver.manage().window().maximize();
	//delay for 2sec
	Thread.sleep(2000);
	//launch web application
	Navigation Nav = driver.navigate();
	Nav.to("https://twitter.com/i/flow/signup");
	//Nav.back();
	//Nav.forward();
	//Nav.refresh();
	//identify the textbox and pass value
	driver.findElement(By.tagName("span")).click();
	///driver.findElement(By.tagName("input")).sendKeys("Pooja");
	Thread.sleep(2000);
	//identify the textbox and pass value
	//driver.findElement(By.)
	}

}

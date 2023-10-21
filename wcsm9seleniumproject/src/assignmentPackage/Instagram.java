package assignmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {
	public static void main(String[] args) throws InterruptedException {
		
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.get("https://www.instagram.com/accounts/login/");
	driver.findElement(By.tagName("input")).sendKeys("546876746");
	//driver.findElement(By.name("password")).sendKeys("Pass@123");
	//driver.findElement(By.tagName("button")).click();
	}
}

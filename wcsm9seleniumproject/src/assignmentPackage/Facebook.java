package assignmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	public static void main(String[] args) throws InterruptedException {
	//String username = "abcdk1234@gmail.com";
	//String pass = "Pass@12";
	WebDriver driver=new ChromeDriver();
	Thread.sleep(20);
	driver.get("https://www.facebook.com/login/");
	driver.findElement(By.name("email")).sendKeys("username");
	driver.findElement(By.id("pass")).sendKeys("pass@123");
	driver.findElement(By.tagName("button")).click();
	}
}


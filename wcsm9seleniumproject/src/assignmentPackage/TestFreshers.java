package assignmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestFreshers {
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.get("https://testfreshers.qspiders.com/login");
	Thread.sleep(2000);
	driver.findElement(By.id("standard-adornment-weight")).sendKeys("abcd12@gmail.com");
	driver.findElement(By.id("password")).sendKeys("Pass@123");
	}
}


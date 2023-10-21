package assignmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra {
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	Thread.sleep(2000);
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.get("https://www.myntra.com/login/password");
	//driver.findElement(By.tagName("input")).sendKeys("search anything");
	driver.findElement(By.id("mobileNumberPass")).sendKeys("abcd1234@gmail.com");
	Thread.sleep(2000);
	//driver.findElement(By.id("password")).sendKeys("abcd@123"); //this value pass in search box
	}
}
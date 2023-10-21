package assignmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartXpath {
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to("https://www.flipkart.com/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[@role='button']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Mobile");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	Thread.sleep(2000);
	//driver.findElement(By.xpath(""))
	}
}

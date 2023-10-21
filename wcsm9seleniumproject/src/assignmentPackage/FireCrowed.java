package assignmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class FireCrowed {
	public static void main(String[] args) throws InterruptedException {
		//launch web application
		WebDriver driver=new ChromeDriver();
		//maximize
		driver.manage().window().maximize();
		//delay for 2sec
		Thread.sleep(20000);
		//launch web application
		 Navigation Nav = driver.navigate();
		 Nav.to("https://crowd.fireflink.com/signin");
		 Thread.sleep(2000);
		 driver.findElement(By.tagName("input")).sendKeys("abcd@gmail.com");
		 Thread.sleep(2000);
		 driver.findElement(By.id("password")).sendKeys("Pass@123");
		 Thread.sleep(2000);
		 driver.findElement(By.tagName("button")).click();
	}

}

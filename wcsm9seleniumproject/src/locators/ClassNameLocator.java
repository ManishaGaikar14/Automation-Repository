package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassNameLocator {
	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 Thread.sleep(2000);
		 driver.get("https://www.google.com/");
		 Thread.sleep(2000);
		 driver.switchTo().activeElement().sendKeys("Joey Tribbiani",Keys.ENTER);
		 driver.findElement(By.className("lNPNe")).click();
	}
}

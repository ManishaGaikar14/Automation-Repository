package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameLocator {
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.get("file:///C:/Users/Pagey/Desktop/htmlBasics/WebPage.html");
	driver.findElement(By.name("name1")).sendKeys("admin");
	driver.findElement(By.name("name2")).sendKeys("pass@123");
	driver.findElement(By.name("n1")).click();
	}
}

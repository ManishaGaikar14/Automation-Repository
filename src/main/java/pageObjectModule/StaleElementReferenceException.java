package pageObjectModule;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementReferenceException {
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://127.0.0.1:81/login.do;jsessionid=5ebcsbdn5e2ai");
	WebElement element = driver.findElement(By.name("username"));
	Thread.sleep(2000);
	System.out.println(element);
	driver.navigate().refresh();
	Thread.sleep(2000);
	element.sendKeys("admin");
	System.out.println(element);
	driver.close();
	}

}

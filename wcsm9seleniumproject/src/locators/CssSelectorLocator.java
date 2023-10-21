package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorLocator {
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.get("https://www.netflix.com/in/");
	driver.findElement(By.cssSelector("a[id=\"signIn\"]")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("id_userLoginId")).sendKeys("9765620120");
	Thread.sleep(2000);
	driver.findElement(By.id("id_password")).sendKeys("pass@123");
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("button[class=\"btn login-button btn-submit btn-small\"]")).click();
	driver.close();
	}

}

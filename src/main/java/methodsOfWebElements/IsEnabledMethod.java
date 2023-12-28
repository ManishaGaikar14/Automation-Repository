package methodsOfWebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledMethod {
	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://demoapps.qspiders.com/");
	WebElement TextBoxEnableOrNot = driver.findElement(By.name("name"));
	boolean element = TextBoxEnableOrNot.isEnabled();
	System.out.println(element);
	driver.findElement(By.partialLinkText("Disabled")).click();
	WebElement element1 = driver.findElement(By.name("email"));
	boolean ele = element1.isEnabled();
	System.out.println(ele);
	driver.close();
	}
}

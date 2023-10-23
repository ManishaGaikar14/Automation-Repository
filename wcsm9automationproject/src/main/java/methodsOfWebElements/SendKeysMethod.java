package methodsOfWebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysMethod {
	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.navigate().to("http://127.0.0.1:81/login.do;jsessionid=1ioclhn6sa7ln");
	WebElement usnTB = driver.findElement(By.name("username"));
	usnTB.sendKeys("admin");
	WebElement psdTB = driver.findElement(By.name("pwd"));
	psdTB.sendKeys("manager");
	}

}

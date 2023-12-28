package methodsOfWebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickMethod {
	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("http://127.0.0.1:81/login.do;jsessionid=6aoplgifq06j");
	driver.findElement(By.name("username")).sendKeys("admin");
	//click method used to click on radio button,button,checkbox etc
	driver.findElement(By.id("loginButton")).click();
	driver.close();
	}

}
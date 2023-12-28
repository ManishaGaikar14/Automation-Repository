package methodsOfWebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextMethod {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://127.0.0.1:81/login.do;jsessionid=6aoplgifq06j");
		driver.findElement(By.name("username")).sendKeys("admin");
		WebElement pwd = driver.findElement(By.name("pwd"));
		pwd.sendKeys("manager");
		String text1 = pwd.getText();
		System.out.println(text1);
		WebElement loginbutton = driver.findElement(By.id("loginButton"));
		String text = loginbutton.getText();
		System.out.println(text);
		driver.close();
	}
}

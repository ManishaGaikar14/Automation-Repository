package methodsOfWebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTagName {
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://127.0.0.1:81/login.do;jsessionid=6aoplgifq06j");
		WebElement element = driver.findElement(By.name("username"));
		element.sendKeys("admin");
		String tagName = element.getTagName();
		System.out.println(tagName);
		driver.close();
	}
}

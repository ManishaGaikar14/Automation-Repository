package methodsOfWebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getAttributeMethod {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://127.0.0.1:81/login.do;jsessionid=6aoplgifq06j");
		driver.findElement(By.name("username")).sendKeys("admin");
		WebElement pwd = driver.findElement(By.name("pwd"));
		pwd.sendKeys("manager");
		//print the value which present inside the the given attribute
		String name = pwd.getAttribute("name");
		System.out.println(name);
		WebElement attributeValue = driver.findElement(By.id("loginButton"));
		String value = attributeValue.getAttribute("id");
		attributeValue.click();
		System.out.println(value);
	}
}

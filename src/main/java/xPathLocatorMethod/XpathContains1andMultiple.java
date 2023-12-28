package xPathLocatorMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathContains1andMultiple {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.bluestone.com/jewellery/rings.html");
		//using text function contains
		driver.findElement(By.xpath("//a[contains(text(),\"Rings \")]"));
		//using unique attribute contains
		driver.findElement(By.xpath("//div[contains(@id,\"login\") ]"));
		//using logical operator contains
		driver.findElement(By.xpath("//div[contains(@class,\"showLoginBox\") and (contains(@id,\"login\"))]"));
		//using logical or operator is multiple suggestion contains method
		driver.findElement(By.xpath("//div[contains(@class,\"showLoginBox\") or (contains(@id,\"login\"))]"));
		//using multiple attribut by unique attribut,text(),contains()-->tag name should be same
		driver.findElement(By.xpath("//a[@class='tah-a-l' and (text()='Try at Home Cart')]"));
	}

}

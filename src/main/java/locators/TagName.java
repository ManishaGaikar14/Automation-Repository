package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagName {
	public static void main(String[] args) {
	   WebDriver driver=new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("https://www.google.com/");
	   //tagname locator use to identify the web element
	   driver.findElement(By.tagName("textarea")).sendKeys("selenium");
	   driver.close();
	}

}

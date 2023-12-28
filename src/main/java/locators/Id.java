package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Id {
	public static void main(String[] args) {
	  WebDriver	driver=new ChromeDriver();
	  //MAXIMIZE BROWSER
	  driver.manage().window().maximize();
	  //launch web application
	  driver.get("https://www.google.com/");
	  //find web element using ifd locator,it is a unique locator
	  driver.findElement(By.id("APjFqb")).sendKeys("omayoblagspot");
	  driver.close();
	}
}

package assignmentPackage;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MyntraEndToEndFlow {
	public static void main(String[] args) {
	ChromeOptions co = new ChromeOptions();
	co.addArguments("--disable-notifications");
	WebDriver driver=new ChromeDriver(co);
	driver.manage().window().maximize();
	driver.navigate().to("https://www.myntra.com/");
	driver.findElement(By.xpath("//input[@placeholder=\"Search for products, brands and more\"]")).sendKeys("iphone");
	driver.findElement(By.xpath("//a[@class=\"desktop-submit\"]")).click();
	driver.findElement(By.xpath("//img[@class=\"img-responsive\"and(@title=\"macmerise Black Printed Iphone 13 Pro Max Mobile Back Case\")]")).click();
	String ParentHandle = driver.getWindowHandle();
	System.out.println(ParentHandle);
	Set<String> AllHandles = driver.getWindowHandles();
	for(String WH : AllHandles) 
	{
		if(!ParentHandle.equals(WH)){
			driver.switchTo().window(WH);
		}
	}
	driver.findElement(By.xpath("//input[@placeholder=\"Enter pincode\"]")).sendKeys("422403");
	}
}


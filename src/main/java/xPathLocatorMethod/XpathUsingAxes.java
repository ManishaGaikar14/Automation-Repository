package xPathLocatorMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathUsingAxes {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.bluestone.com/jewellery/lakshmigoldcoins.html");
		//descendant is used to locate web element
		//first locate parent web element then child we element--->descendant
		driver.findElement(By.xpath("//div[@id='login']/descendant::span[text()='Login']"));
		//first locate child web element then parent to traverse--->ancestor
		//driver.findElement(By.xpath(""))
		
	}

}

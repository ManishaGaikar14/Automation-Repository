package xPathLocatorMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathUniqueAttribute {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
		driver.get("https://www.bluestone.com/jewellery/lakshmigoldcoins.html");
		driver.findElement(By.xpath("//input[@id=\"search_query_top_elastic_search\"]")).sendKeys("watch");
		driver.close();
		}
}

package xPathLocatorMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathLocatorUsingTextFunction {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("//input[@id=\"search_query_top_elastic_search\"]");
		driver.findElement(By.xpath("//a[text()=\"Rings \"]")).click();
		driver.close();
	}
}

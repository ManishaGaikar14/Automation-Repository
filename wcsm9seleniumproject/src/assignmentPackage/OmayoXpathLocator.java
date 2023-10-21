package assignmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OmayoXpathLocator {
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://omayo.blogspot.com/2013/05/page-one.html");
	Thread.sleep(2000);
	//driver.findElement(By.xpath("//input[@id=\"b-query\"]")).click();
	//driver.findElement(By.xpath(""))
	driver.findElement(By.xpath("//select[@id=\"drop1\"]")).click();
	driver.findElement(By.xpath("//input[@name=\"fname\"]")).sendKeys("selenium WebDriver");
	driver.findElement(By.xpath("//textarea[@id=\"ta1\"]")).sendKeys("hii...My Name Is pooja");
	driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("hghjgh");
	driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("hgjhgj");
	driver.findElement(By.xpath("//input[@name=\"userid\"]")).sendKeys("mannn");
	driver.findElement(By.xpath("//input[@name=\"pswrd\"]")).sendKeys("jhgjhd7");
	driver.findElement(By.xpath("//input[@value=\"Login\"]")).sendKeys("hgf45");
	driver.findElement(By.xpath("//a[text()='Open a popup window']")).click();
	//driver.findElement(By.xpath(""))
	}

}

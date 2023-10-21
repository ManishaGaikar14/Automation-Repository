package assignmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class IRCTCxPathLocator {
	public static void main(String[] args) throws InterruptedException {
	ChromeOptions co=new ChromeOptions();
	co.addArguments("--disable-notifications");
	WebDriver driver=new ChromeDriver(co);
	driver.manage().window().maximize();
	driver.get("https://www.irctc.co.in/nget/train-search");
	Thread.sleep(2000);
	//driver.findElement(By.xpath("//span[@class=\"ng-tns-c57-8 ui-autocomplete ui-widget\"]")).click();
	driver.findElement(By.xpath("//input[@aria-controls=\"pr_id_1_list\"]")).sendKeys("PUNE JN - PUNE (PUNE)");
	driver.findElement(By.xpath("//input[@aria-controls=\"pr_id_2_list\"]")).sendKeys("DELHI - DLI (NEW DELHI)");
	driver.findElement(By.xpath("//span[@class=\"ng-tns-c58-10 ui-calendar\"]")).click();
	driver.findElement(By.xpath("//a[text()='25']")).click();
	driver.findElement(By.xpath("//div[@class=\"ng-tns-c65-11 ui-dropdown ui-widget ui-state-default ui-corner-all\"]")).click();
	driver.findElement(By.xpath("//span[text()='Anubhuti Class (EA)']")).click();
	driver.findElement(By.xpath("//div[@class=\"ng-tns-c65-12 ui-dropdown ui-widget ui-state-default ui-corner-all\"]")).click();
	driver.findElement(By.xpath("//li[@aria-label=\"LADIES\"]")).click();
	driver.findElement(By.xpath("//label[text()='Flexible With Date']")).click();
	driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	//drver.findElement(By.xpath("//input[@id=\"4896669\"]")).sendKeys("pooja123@gmail.com");
	//driver.findElement(By.xpath("//span[@text()=' PUNE JN - PUNE ']")).click();
	///driver.findElement(By.xpath("//span[@text()=' PUNE JN - PUNE ']")).click();)
	}
}

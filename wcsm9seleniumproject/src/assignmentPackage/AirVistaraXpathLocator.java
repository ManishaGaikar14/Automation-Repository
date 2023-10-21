package assignmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AirVistaraXpathLocator {
	public static void main(String[] args) {
	ChromeOptions co = new ChromeOptions();
	co.addArguments("--disable-notifications");
	WebDriver driver=new ChromeDriver(co);
	driver.manage().window().maximize();
	driver.navigate().to("https://www.airvistara.com/in/en");
	driver.findElement(By.xpath("//button[@id=\"cookieModalCloseBtn\"]")).click();
	driver.findElement(By.xpath("//div[@name=\"departsfrom-div\"]")).click();
	driver.findElement(By.xpath("//input[@placeholder=\"Select Departure City\"]")).sendKeys("MNQ");
	driver.findElement(By.xpath("//div[@id=\"arrivesat-div\"]")).click();
	driver.findElement(By.xpath("//input[@placeholder=\"Select Arrival City\"]")).sendKeys("PNQ");
	driver.findElement(By.xpath("//div[@id=\"travel-Dates\"]")).click();
	driver.findElement(By.xpath("//a[text()='26']")).click();
	driver.findElement(By.xpath("//a[text()='27']")).click();
	driver.findElement(By.xpath("//input[@name=\"passengers\"]")).click();
	driver.findElement(By.xpath("//div[@id=\"passengersDiv\"]")).click();
	driver.findElement(By.xpath("//button[@id=\"adds_adult\"]")).click();
	driver.findElement(By.xpath("//button[@value=\"business\"]")).click();
	driver.findElement(By.xpath("//div[@id=\"discArmed\"]")).click();
	driver.findElement(By.xpath("//button[@class=\"col-xs-12 done_btn aubergine-button-dark passengerModalBtn\"]")).click();
	driver.findElement(By.xpath("//button[@id=\"book-flight-widget\"]")).click();
	}

}

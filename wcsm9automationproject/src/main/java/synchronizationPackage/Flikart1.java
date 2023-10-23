package synchronizationPackage;

//import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
public class Flikart1 {
	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to("https://www.flipkart.com/");
	driver.findElement(By.xpath("//span[@class=\"_30XB9F\"]")).click();
	driver.findElement(By.xpath("//input[@name=\"q\"]")).sendKeys("Mobile");
	driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='OnePlus Nord CE 2 Lite 5G (Blue Tide, 128 GB)']"))).click();
	driver.findElement(By.xpath("//div[text()='OnePlus Nord CE 2 Lite 5G (Blue Tide, 128 GB)']")).click();
	driver.findElement(By.xpath("//a[@class=\"kmlXmn\"]")).click();
	driver.findElement(By.xpath("//a[@class=\"_1fGeJ5 qaAL3J\"]")).click();
	driver.findElement(By.xpath("//input[@placeholder=\"Enter Delivery Pincode\"]")).sendKeys("422403");
	driver.findElement(By.xpath("//span[text()=\"Change\"]")).click();
		
	}

}

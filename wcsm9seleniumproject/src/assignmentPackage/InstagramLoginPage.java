package assignmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramLoginPage {
public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to("https://www.instagram.com/?hl=en");
	driver.findElement(By.xpath("//input[@aria-label=\"Phone number, username, or email\"]")).click();
}
}

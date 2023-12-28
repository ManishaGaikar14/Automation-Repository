package frameHandeling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchControlToFrameWithIndex {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//launch web Application
		driver.get("https://www.bluestone.com/");
		//handle division popup
		driver.findElement(By.xpath("//span[text()='Not now']")).click();
		WebElement element = driver.findElement(By.xpath("//div[@class=\"d-hotline h-btn animated zoomIn faster     \"]"));
		driver.switchTo().frame(element);
	}
}

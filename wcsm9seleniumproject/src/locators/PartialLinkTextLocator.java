package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLinkTextLocator {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.navigate().to("http://omayo.blogspot.com/");
		driver.findElement(By.partialLinkText("a popup window")).click();
		Thread.sleep(2000);
		driver.quit();
	}
}

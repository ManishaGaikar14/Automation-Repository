package dropdownHandeling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectMultipledropdown {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://omayo.blogspot.com/2013/05/page-one.html");
		Thread.sleep(2000);
		WebElement dropdown = driver.findElement(By.id("multiselect1"));
		Thread.sleep(2000);
		Select ele = new Select(dropdown);
		for(int i=0;i<=3;i++) {
			ele.selectByIndex(i);
		}
		Thread.sleep(2000);
		for(int i=0;i<=3;i++) {
			ele.deselectByIndex(i);
		}
		driver.close();
	}
}

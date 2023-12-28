package dropdownHandeling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectionForMultiselectDropdown {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/Pagey/Desktop/htmlBasics/MultiselectDropdown.html");
		driver.findElement(By.xpath("//section[text()='Dropdown']")).click();
		Thread.sleep(2000);
		WebElement dropdown = driver.findElement(By.name("singleselect"));
		Select ele = new Select(dropdown);
		for(int i=0;i<=11;i++) {
			ele.selectByIndex(i);
		}
		Thread.sleep(2000);
		for(int i=0;i<=11;i++) {

			ele.deselectByIndex(i);
		}
		driver.close();
	}
}

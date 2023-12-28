package dropdownHandeling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByIndexMethod {
	public static void main(String[] args) {
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	 driver.get("file:///C:/Users/Pagey/Desktop/htmlBasics/DropDown.html");
	 WebElement dropdown = driver.findElement(By.id("id"));
	 //handle single static dropdown
	 Select ele = new Select(dropdown);
	 ele.selectByIndex(2);
	}

}

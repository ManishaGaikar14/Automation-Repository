package dropdownHandeling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectByIndexMethod {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demoapps.qspiders.com/");
		driver.findElement(By.xpath("//section[text()='Dropdown']")).click();
		Thread.sleep(2000);
		WebElement dropdown = driver.findElement(By.xpath("//select[contains(@class,'transition-all duration-150 w-5/1')]"));
		Thread.sleep(2000);
		Select ele = new Select(dropdown);
		Thread.sleep(2000);
		ele.selectByIndex(1);
		Thread.sleep(2000);
		ele.deselectByIndex(1);
		driver.close();
		//driver.get("http://127.0.0.1:81/user/submit_tt.do");
		
	}

}

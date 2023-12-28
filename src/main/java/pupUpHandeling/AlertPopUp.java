package pupUpHandeling;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demoapps.qspiders.com/?scenario=1");
		driver.findElement(By.xpath("//section[text()=\"Popups\"]")).click();
		driver.findElement(By.xpath("//section[text()=\"Javascript\"]")).click();
		driver.findElement(By.xpath("//button[text()=\"Alert Box\"]")).click();
		//WebElement element = driver.findElement(By.id("buttonAlert2"));
		Alert al=driver.switchTo().alert();
		String text = al.getText();
		System.out.println(text);
		al.dismiss();
	}
}

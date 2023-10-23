package methodsOfWebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayedMethod {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://demoapps.qspiders.com/image");
		driver.findElement(By.xpath("//a[@aria-current=\"page\"]")).click();
		WebElement isDisplaYMethod = driver.findElement(By.name("Attended"));
		boolean result = isDisplaYMethod.isDisplayed();
		System.out.println(result);
	}

}

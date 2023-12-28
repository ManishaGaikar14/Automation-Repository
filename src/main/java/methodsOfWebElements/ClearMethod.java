package methodsOfWebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearMethod {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.bluestone.com/jewellery/lakshmigoldcoins.html");
		WebElement element = driver.findElement(By.id("search_query_top_elastic_search"));
		Thread.sleep(2000);
		element.sendKeys("necklace");
		Thread.sleep(2000);
		element.clear();
		driver.close();
	}

}

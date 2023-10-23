package methodsOfWebElements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextMethod {
	public static void main(String[] args) {
		WebDriver	driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		  driver.navigate().to("https://www.google.com/");
		  driver.switchTo().activeElement().sendKeys("iphone");
		  List<WebElement> AllIphones = driver.findElements(By.xpath("//div[@class=\"pcTkSc\"]"));
		  for(WebElement phone:AllIphones) {
			  System.out.println(phone.getText());
		  }
	}

}

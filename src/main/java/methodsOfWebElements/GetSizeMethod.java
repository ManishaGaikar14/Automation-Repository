package methodsOfWebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSizeMethod {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.selenium.dev/");
		WebElement leftcornerelement = driver.findElement(By.id("Layer_1"));
		Dimension sizeOfElement = leftcornerelement.getSize();
		int hight = sizeOfElement.getHeight();
		System.out.println(hight);
		int width = sizeOfElement.getWidth();
		System.out.println(width);
		driver.close();
	}

}

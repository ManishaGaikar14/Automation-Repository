package methodsOfWebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetRectMethod {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.selenium.dev/");
		WebElement element = driver.findElement(By.className("navbar-brand"));
		Rectangle rectLocationSize = element.getRect();
		int hight = rectLocationSize.getHeight();
		System.out.println(hight);
		int width = rectLocationSize.getWidth();
		System.out.println(width);
		int xaxis = rectLocationSize.getX();
		System.out.println(xaxis);
		int yaxis = rectLocationSize.getY();
		System.out.println(yaxis);
		driver.close();
	}

}

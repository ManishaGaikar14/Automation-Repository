package synchronization;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//maven repository
		driver.get("https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java/4.15.0");
	}

}

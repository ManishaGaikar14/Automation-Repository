package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		//launch web application using navigate method
		//driver.navigate().to("https://www.selenium.dev/");
		//driver.close();
		Navigation nav = driver.navigate();
		Thread.sleep(2000);
		nav.to("https://www.selenium.dev/");
		//perform backword operation
		Thread.sleep(2000);
		nav.back();
		//perform forword operation
		Thread.sleep(2000);
		nav.forward();
		//refresh browser
		Thread.sleep(2000);
		nav.refresh();
		Thread.sleep(2000);
		driver.close();
	}
}
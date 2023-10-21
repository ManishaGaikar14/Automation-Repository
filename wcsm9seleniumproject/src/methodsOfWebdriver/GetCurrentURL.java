package methodsOfWebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentURL {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.zomato.com/india");
		Thread.sleep(2000);
		Object getTitlePage = driver.getTitle();
		System.out.println(getTitlePage);
		System.out.println(driver.getCurrentUrl());
		driver.close();	
	}
}

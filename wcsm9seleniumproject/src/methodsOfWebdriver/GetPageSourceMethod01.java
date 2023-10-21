package methodsOfWebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageSourceMethod01 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/account/login?ret=/");
		Thread.sleep(2000);
		String sorceCodeOfPage = driver.getPageSource();
		System.out.println(sorceCodeOfPage);
		String currentURL = driver.getCurrentUrl();
		System.out.println(currentURL);
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		driver.close();
	}

}

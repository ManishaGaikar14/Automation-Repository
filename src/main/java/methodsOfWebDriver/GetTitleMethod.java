package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleMethod {
	public static void main(String[] args) throws InterruptedException {
		//launch browser
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		//maximize browser
		driver.manage().window().maximize();
		//launch web Application
		Thread.sleep(2000);
		driver.get("https://www.flipkart.com/");
		//to get the title of page 
		String titleOfPage = driver.getTitle();
		System.out.println(titleOfPage);
		//close current browser
		driver.close();
	}
}

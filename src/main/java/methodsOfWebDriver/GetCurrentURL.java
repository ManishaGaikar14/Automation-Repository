package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentURL {
	public static void main(String[] args) {
		//launch Browser
		WebDriver driver=new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		//launch web Application
		driver.get("https://www.flipkart.com/");
		//to get the url of the current page 
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		//close browser
		driver.close();
	}

}
